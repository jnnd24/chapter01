package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요:");
		int poi = sc.nextInt();
		
		String level;
		
		if(poi>=90) {
			
			level = "A";
			
		}else if(90>poi&&poi>=80) {
			level = "B";
		}else if(80>poi&&poi>=70) {
			level = "C";
		}else if(70>poi&&poi>=60) {
			level = "D";
		}else {
			level = "F";
		}
			
		
		
		System.out.println(level + "등급");
		
		sc.close();
	}

}
