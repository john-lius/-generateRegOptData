package com.digihealth.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class PropertiesLoader {

	private static ResourceLoader resourceLoader = new DefaultResourceLoader();

	private final Properties properties;

	public PropertiesLoader(String... resourcesPaths) {
		properties = loadProperties(resourcesPaths);
	}

	public Properties getProperties() {
		return properties;
	}

	/**
	 * ȡ��Property������System��Property����,ȡ�������ؿ��ַ���.
	 */
	private String getValue(String key) {
		String systemProperty = System.getProperty(key);
		if (systemProperty != null) {
			return systemProperty;
		}
		if (properties.containsKey(key)) {
	        return properties.getProperty(key);
	    }
	    return "";
	}

	/**
	 * ȡ��String���͵�Property������System��Property����,�����ΪNull���׳��쳣.
	 */
	public String getProperty(String key) {
		String value = getValue(key);
		if (value == null) {
			throw new NoSuchElementException();
		}
		return value;
	}

	/**
	 * ȡ��String���͵�Property������System��Property����.�����ΪNull�򷵻�Defaultֵ.
	 */
	public String getProperty(String key, String defaultValue) {
		String value = getValue(key);
		return value != null ? value : defaultValue;
	}

	/**
	 * �������ļ�, �ļ�·��ʹ��Spring Resource��ʽ.
	 */
	private Properties loadProperties(String... resourcesPaths) {
		Properties props = new Properties();
		for (String location : resourcesPaths) {
			InputStream is = null;
			try {
//				Resource resource = resourceLoader.getResource(location);  // ��ȡ��Ŀ·���µ������ļ�;
				BufferedReader bufferedReader;
				bufferedReader = new BufferedReader(new FileReader(location));  // ��ȡ����·���µ������ļ�;
//				is = resource.getInputStream();
//				props.load(is);
				props.load(bufferedReader);
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			} finally {
				IOUtils.closeQuietly(is);
			}
		}
		return props;
	}
}
