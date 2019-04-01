package com.gmail.ura;

public class Application {
	public static void main(String[] args) {
		System.out.println("------task1-----");
		byte a = 9;
		short b = 5;
		int c = 100;
		long d = 2018;
		float pi = 3.14f;
		char j = 65530;
		double f = 2.7;
		boolean p = true;
		
		System.out.println("------task2-----");
		
		System.out.println("Byte MAX = " + Byte.MAX_VALUE);
		System.out.println("Byte MIN = " + Byte.MIN_VALUE);
		System.out.println("Short MAX = " + Short.MAX_VALUE);
		System.out.println("Short MIN = " + Short.MIN_VALUE);
		System.out.println("Integer MAX = " + Integer.MAX_VALUE);
		System.out.println("Integer MIN = " + Integer.MIN_VALUE);
		System.out.println("Long MAX = " + Long.MAX_VALUE);
		System.out.println("Long MIN = " + Long.MIN_VALUE);
		System.out.println("Character MAX = " + Character.MAX_VALUE);
		System.out.println("Character MIN = " + Character.MIN_VALUE);
		System.out.println("Float MAX = " + Float.MAX_VALUE);
		System.out.println("Float MIN = " + Float.MIN_VALUE);
		System.out.println("Double MAX = " + Double.MAX_VALUE);
		System.out.println("Double MIN = " + Double.MIN_VALUE);
		System.out.println("Boolean = " + Boolean.FALSE);
		System.out.println("Boolean = " + Boolean.TRUE);
		
		System.out.println("------task3-----");
		
		int [] myArray = {34, 7, 2, 8, 0,-2, 70, 1,-3, 20};
		int max = myArray[0];
		int min = myArray[0];
		for (int i = 0; i<10; i++) {
		if (min>myArray[i]) {
			min = myArray[i];
		}
		if (max<myArray[i]) {
			max = myArray[i];
		}	
		}
		System.out.println("MAX = "+max + " " + "MIN = " + min);
	}
}
