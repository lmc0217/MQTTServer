/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mcrazy.main;

import org.fusesource.hawtbuf.*;
import org.fusesource.mqtt.client.*;

import com.mcrazy.log.Log;
import com.mcrazy.manager.status.WillMsgListener;

/**
 *  MQTT 数据处理插件
 * @author liu mengchao
 * @createDate 2017.1.23
 */
public class McListener {
	private String user = env("APOLLO_USER", "admin");
	private String password = env("APOLLO_PASSWORD", "password");
	private String host = env("APOLLO_HOST", "localhost");
	private int port = Integer.parseInt(env("APOLLO_PORT", "61613"));
	private CallbackConnection connection;
	private String topic_dev = "/mqtt/topic/0";
	private String topic_will = "/mcrazy/msg/will";
	
	private static final McListener listener = new McListener();

	public static McListener getInstance() {
		return listener;
	}

	private McListener() {

	}
	
	private void initMQTTListener() {
        try {
        	MQTT mqtt = new MQTT();
        	mqtt.setHost(host, port);
            mqtt.setUserName(user);
            mqtt.setPassword(password);

            connection = mqtt.callbackConnection();
            connection.listener(new Listener() {
                long count = 0;
                long start = System.currentTimeMillis();

                public void onConnected() {
                }
                public void onDisconnected() {
                }
                public void onFailure(Throwable value) {
                    value.printStackTrace();
                    System.exit(-2);
                }

                public void onPublish(UTF8Buffer topic, Buffer msg, Runnable ack) {
                	Log.err.info("收到订阅主题{}", topic.toString());
                    String body = msg.utf8().toString();
                    Log.err.info("收到订阅消息{}", body);
                    if( "SHUTDOWN".equals(body)) {
                        long diff = System.currentTimeMillis() - start;
                        Log.err.info(String.format("Received %d in %.2f seconds", count, (1.0*diff/1000.0)));
                        connection.disconnect(new Callback<Void>() {
                            @Override
                            public void onSuccess(Void value) {
                                System.exit(0);
                            }
                            @Override
                            public void onFailure(Throwable value) {
                                value.printStackTrace();
                                System.exit(-2);
                            }
                        });
                    } else {
                        if( count == 0 ) {
                            start = System.currentTimeMillis();
                        }
                        if( count % 1000 == 0 ) {
                            Log.err.info(String.format("Received %d messages.", count));
                        }
                        count ++;
                    }
                }
            });
            connection.connect(new Callback<Void>() {
                @Override
                public void onSuccess(Void value) {
                    Topic[] topics = {new Topic(topic_dev, QoS.AT_LEAST_ONCE), new Topic(topic_will, QoS.AT_LEAST_ONCE)};
                    connection.subscribe(topics, new Callback<byte[]>() {
                        public void onSuccess(byte[] qoses) {
                        	Log.err.info("============订阅主题成功:1.{}, 2.{}==============", topic_dev, topic_will);
                        }
                        public void onFailure(Throwable value) {
                            value.printStackTrace();
                            Log.err.info("============订阅主题失败==============");
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
            
            // Wait forever..
            synchronized (McListener.class) {
                while(true)
                	McListener.class.wait();
            }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String []args) {
		McListener.getInstance().initMQTTListener();
//		WillMsgListener.getInstance().initWillMsgListener();
    }

    private static String env(String key, String defaultValue) {
        String rc = System.getenv(key);
        if( rc== null )
            return defaultValue;
        return rc;
    }
}
