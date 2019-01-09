package com.digihealth.utils;

import org.apache.commons.codec.binary.Base64;

public class Base64Utils {

	/**
	 * º”√‹
	 * @param value
	 * @return
	 */
	public static String encode(String value) {
		return new String(Base64.encodeBase64(value.getBytes()));
	}

	/**
	 * Ω‚√‹
	 * @param value
	 * @return
	 */
	public static String decode(String value) {
		return new String(Base64.decodeBase64(value.getBytes()));
	}
	
	public static void main(String[] args) {
		System.out.println(decode("sPzGpA=="));
		System.out.println(encode("π¨æ±"));
	}
}
