package com.mcrazy.main;

import org.fusesource.hawtbuf.AsciiBuffer;
import org.fusesource.hawtbuf.Buffer;
import org.fusesource.hawtbuf.UTF8Buffer;
import org.fusesource.mqtt.client.Callback;
import org.fusesource.mqtt.client.CallbackConnection;
import org.fusesource.mqtt.client.Future;
import org.fusesource.mqtt.client.FutureConnection;
import org.fusesource.mqtt.client.MQTT;
import org.fusesource.mqtt.client.QoS;
import org.fusesource.mqtt.client.Topic;

import com.mcrazy.log.Log;

import java.util.LinkedList;

/**
 *  MQTT 消息发布者
 * @author liu mengchao
 * @createDate 2017.1.25
 */
public class McPublisher {
//	private String user = env("APOLLO_USER", "admin");
//	private String password = env("APOLLO_PASSWORD", "password");
//	private String host = env("APOLLO_HOST", "localhost");
//	private int port = Integer.parseInt(env("APOLLO_PORT", "61613"));
	private String user = "admin";
	private String password = "password";
	private String host = "www.mcrazy.cn";
	private int port = 61613;
	private CallbackConnection connection;
	private LinkedList<Future<Void>> queue = new LinkedList<Future<Void>>();
	
	private static final McPublisher publisher = new McPublisher();

	public static McPublisher getInstance() {
		return publisher;
	}

	private McPublisher() {

	}
	
	public CallbackConnection getConnection() {
		return connection;
	}

	/**
	 * 初始化MQTT
	 */
	public void initMQTT() throws Exception {
		MQTT mqtt = new MQTT();
        mqtt.setHost(host, port);
        mqtt.setUserName(user);
        mqtt.setPassword(password);
        connection = mqtt.callbackConnection();
        connection.connect(new Callback<Void>() {
            @Override
            public void onSuccess(Void value) {
            	System.out.println("============连接mqtt成功==============");
                Log.err.info("============连接mqtt成功==============");
            }
            @Override
            public void onFailure(Throwable value) {
                value.printStackTrace();
                System.out.println("================连接mqtt失败==============");
                Log.err.info("================连接mqtt失败==============");
                System.exit(-2);
            }
        });
	}
	
	public void publishData(String data, String topic_send) throws Exception {
		System.out.println(data);
		McPublisher.getInstance().getConnection().publish(topic_send, data.getBytes(), QoS.AT_LEAST_ONCE, true, new Callback<Void>() {
			public void onSuccess(Void v) { 
				System.out.println("===========消息发布成功============");
				Log.err.info("===========消息发布成功============");
			} 
			public void onFailure(Throwable value) { 
				System.out.println("========消息发布失败=======");
				Log.err.info("========消息发布失败=======");
				McPublisher.getInstance().getConnection().disconnect(null);
			}
		});
	}

    private static String env(String key, String defaultValue) {
        String rc = System.getenv(key);
        if( rc== null )
            return defaultValue;
        return rc;
    }
}
