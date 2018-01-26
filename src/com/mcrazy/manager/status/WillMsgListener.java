package com.mcrazy.manager.status;

import org.fusesource.hawtbuf.Buffer;
import org.fusesource.hawtbuf.UTF8Buffer;
import org.fusesource.mqtt.client.Callback;
import org.fusesource.mqtt.client.CallbackConnection;
import org.fusesource.mqtt.client.Listener;
import org.fusesource.mqtt.client.MQTT;
import org.fusesource.mqtt.client.QoS;
import org.fusesource.mqtt.client.Topic;

import com.mcrazy.log.Log;

public class WillMsgListener {
	private String user = env("APOLLO_USER", "admin");
	private String password = env("APOLLO_PASSWORD", "password");
	private String host = env("APOLLO_HOST", "localhost");
	private int port = Integer.parseInt(env("APOLLO_PORT", "61613"));
	private CallbackConnection connection;
	private String destination = "/mcrazy/msg/will";
	
	private static final WillMsgListener willlistener = new WillMsgListener();

	public static WillMsgListener getInstance() {
		return willlistener;
	}

	private WillMsgListener() {

	}
	
	public void initWillMsgListener() {
        try {
        	MQTT mqtt = new MQTT();
        	mqtt.setHost(host, port);
            mqtt.setUserName(user);
            mqtt.setPassword(password);

            connection = mqtt.callbackConnection();
            connection.listener(new Listener() {
                public void onConnected() {
                }
                public void onDisconnected() {
                }
                public void onFailure(Throwable value) {
                    value.printStackTrace();
                    System.exit(-2);
                }

                public void onPublish(UTF8Buffer topic, Buffer msg, Runnable ack) {
                    String body = msg.utf8().toString();
                    Log.err.info("收到will消息{}", body);
                }
            });
            connection.connect(new Callback<Void>() {
                @Override
                public void onSuccess(Void value) {
                    Topic[] topics = {new Topic(destination, QoS.AT_LEAST_ONCE)};
                    connection.subscribe(topics, new Callback<byte[]>() {
                        public void onSuccess(byte[] qoses) {
                        	Log.err.info("============订阅will主题成功:{}==============", destination);
                        }
                        public void onFailure(Throwable value) {
                            value.printStackTrace();
                            Log.err.info("============订阅will主题失败 {}==============", destination);
                            System.exit(-2);
                        }
                    });
                }
                @Override
                public void onFailure(Throwable value) {
                    value.printStackTrace();
                    Log.err.info("================连接mqtt失败==============");
                    System.exit(-2);
                }
            });
            
//            // Wait forever..
            synchronized (WillMsgListener.class) {
                while(true)
                	WillMsgListener.class.wait();
            }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static String env(String key, String defaultValue) {
        String rc = System.getenv(key);
        if( rc== null )
            return defaultValue;
        return rc;
    }
}
