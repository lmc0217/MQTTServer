package com.mcrazy.log;

import java.io.File;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Log日记处理
 * 
 * @author liu mengchao
 * 
 */
public final class Log {
	public static final String PATH_LOG = "/home/workspace/mqttserver/logs";
	public static final String PATH_CONF = "/home/workspace/mqttserver/conf";
	
	private Log(){
		
	}
	
	static{
		StringBuilder builder = new StringBuilder();
		String filepath = builder.append(PATH_CONF).append(File.separator)
				.append("log4j.properties").toString();
		PropertyConfigurator.configure(filepath);
	}
	public static Logger err = LoggerFactory.getLogger(Log.class); // log
}
