package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {

		int[] arrA = new int[3];
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
		int[] arrB = new int[3];
		/*
		arrB[0] = arrA[0];
		arrB[1] = arrA[1];
		arrB[2] = arrA[2];
		아래 for문과같이 줄일 수 있다.
		*/
		
		for(int i = 0; i<arrA.length; i++) {
			arrB[i] = arrA[i];
		}
		
		
		
		
		//출력
		for(int i = 0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}

		for(int i = 0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
		
		System.out.println("====================================");
		System.out.println("arrA[1] 100으로 변경"); // A만바뀌고 B는 안바뀌는지 확인
		
		arrA[1] = 100;
		//출력
		for(int i = 0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}

		for(int i = 0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
		
		
		
		
		
	}

}
