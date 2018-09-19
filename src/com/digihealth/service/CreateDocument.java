package com.digihealth.service;

import java.util.Random;

/**
 * 创建文书
 */
public class CreateDocument {

	public static String getRandom(int min, int max){
	    Random random = new Random();
	    int s = random.nextInt(max) % (max - min + 1) + min;
	    return String.valueOf(s);

	}

	public static void main(String[] args) {
		System.out.println(getRandom(1, 4));
	}
}
