package com.javaex.ex05;

public class Ex04_배열기본 {

	public static void main(String[] args) {
		
		 // 기본형!!
		int[] intArray = new int[3];
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;
		
		for(int i = 0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		
		
		/*
		int[] intArray = new int[] {3, 6, 9};
		
		for(int i = 0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		*/
		
	}

}
