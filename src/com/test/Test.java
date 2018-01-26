package com.test;

import com.mcrazy.main.McPublisher;

public class Test {
	public static void main(String[] args) {
		try {
			// 初始化线程池
			McPublisher.getInstance().initMQTT();
			McPublisher.getInstance().publishData("vccc", "/mqtt/topic/0");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
