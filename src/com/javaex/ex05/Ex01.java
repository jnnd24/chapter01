package com.javaex.ex05;

public class Ex01 {
	
	
	public static void main(String[] args) {
		
		
		for (int i = 1; i<=6 ; i++) {

			int num = (int)(Math.random()*45)+1;
			System.out.print(num+"\t"); 
			
			
		}
		
		
		
		int no1, no2, no3, no4, no5, no6;
		
		no1 = (int)(Math.random()*45)+1;
		no2 = (int)(Math.random()*45)+1;
		no3 = (int)(Math.random()*45)+1;
		no4 = (int)(Math.random()*45)+1;
		no5 = (int)(Math.random()*45)+1;
		no6 = (int)(Math.random()*45)+1;
		System.out.println("");
		System.out.print(no1+"\t"+no2+"\t"+no3+"\t"+no4+"\t"+no5+"\t"+no6);
		
		
		
	}

}

