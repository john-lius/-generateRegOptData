package com.digihealth.utils;

import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.google.common.collect.Maps;

public class Global {

	/**
	 * ��ǰ����ʵ��
	 */
	private static Global global = new Global();

	/**
	 * �����ļ����ض���
	 */
	private static PropertiesLoader loader = new PropertiesLoader("D:/generator/config.properties");

	/**
	 * ����ȫ������ֵ
	 */
	private static Map<String, String> map = Maps.newHashMap();

	/**
	 * ��ȡ����
	 * @see ${fns:getConfig('adminPath')}
	 */
	public static String getConfig(String key) {
		String value = map.get(key);
		if (value == null){
			value = loader.getProperty(key);
			map.put(key, value != null ? value : StringUtils.EMPTY);
		}
		return value;
	}
}
