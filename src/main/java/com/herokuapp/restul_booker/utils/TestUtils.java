package com.herokuapp.restul_booker.utils;

import java.util.Random;

public class TestUtils {
	public static String getRandomValue(){
		Random random = new Random();
		int randomInt = random.nextInt(100000);
		return Integer.toString(randomInt);
	}
}