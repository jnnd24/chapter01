package com.javaex.ex01;

public class Ex05 {
	
	public static void main(String[] args) {
		
		
		//일반적인 방식
		double pi = 3.14;
		double result01 = pi*5*5;
		
		System.out.println(result01);
		
		
		//pi값이 변경되는 경우
		pi=3.1415926;
		double result02 = pi*5*5;
		
		System.out.println(result02);
		
		
		
		
		//상수로 지정하는 경우
		final double PI = 3.14;  // 상수로 사용 할때는 대문자
		double result03 = PI*5*5;
		System.out.println(result03);
		
		
		// * 상수의 값을 변경하려 할 때
		/*
		PI = 3.1415926; // PI가 상수로 선원되어 변경 불가
		double result04 = PI*5*5;
		System.out.println(result04);
		*/
		
	}

}
