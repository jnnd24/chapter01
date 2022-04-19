package com.javaex.ex01;

public class Ex07 {
	
	public static void main(String[] args) {
		
		double v01 = 5/4;
		System.out.println(v01);
		//예상 1.25
		//결과 1.0
		
		double v02 = (double)5 /4;
		System.out.println(v02);
		//예상 1.0
		//결과 1.25
		
		double v03 = 5 / (double)4;
		System.out.println(v03);
		
		
		
		double v04 = (double)5 / (double)4;
		System.out.println(v04);
		
		
		
		int v05 = (int)1.3 + (int)1.8;
		System.out.println(v05);
		//예상 2
		//결과 2
		
		
	}

}
