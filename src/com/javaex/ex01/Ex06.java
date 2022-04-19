package com.javaex.ex01;

public class Ex06 {
	
	public static void main(String[] args) {
		
		System.out.println(2+5);
		
		float var01 = 2+5.5f;
		System.out.println(var01);
		
		//자동형변환
		long var02 = 12345L;
		float var03 = 1.1F;
		
		System.out.println(var02+var03);
		
		float result = var02 + var03; // var02 -> float으로 변환 : 12234.5F
		System.out.println(result);
		
		
		//강제 형변환
		float var04 = 111.6345f;
		int var05 = (int)var04;
		System.out.println(var05);
		
		
		//축소변환
		int v01 = 10;
		byte v02 = (byte)v01;
		System.out.println(v02);
		
		
		//축소변환 비정상(int -> byte)
		int v03 = 10302970;
		byte v04 = (byte)v03;
		System.out.println(v04);
		
		//확대변환 byte -> int
		byte v05 = 10;
		int v06 = (int)v05;
		System.out.println(v06);
		
		
		//실수->정수
		double v07 = 5.57;
		int v08 = (int)v07;
		System.out.println(v08);
		
		int v09 = 7;
		double v10 = (double)v09;
		System.out.println(v10);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}















