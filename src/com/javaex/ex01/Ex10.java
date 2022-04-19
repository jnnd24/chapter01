package com.javaex.ex01;

public class Ex10 {
	
	public static void main(String[] args) {
		
		//논리 연산자
		int a = 5;
		int b = 7;
		
		//논리 연산자 기본&&
		System.out.println("&& 연산자");
		System.out.println(true&&true); // tr
		System.out.println(true&&false); // f
		System.out.println(false&&true); // f
		System.out.println(false&&false); //f
		
		// 논리 연산자 기본 
		System.out.println(true||false);
		
		
		System.out.println("응용");
		System.out.println( (a>b)&&(a<b) ); // F
		System.out.println( (a>b&&(a>b) )); // f f >> F
		
		System.out.println("==============");
		System.out.println( (a>b)||(a<b) ); // f t >> t
		
		//논리연산자 기본 !
		System.out.println("==============");
		System.out.println(a>b);
		System.out.println(!(a>b));
		
	}

}
