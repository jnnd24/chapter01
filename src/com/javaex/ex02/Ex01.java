package com.javaex.ex02;

public class Ex01 {
	
	public static void main(String[] args) {
		
		int i =2345;
		String ii = "2345";
		double d = 3.14;
		String str = "굿모닝";
		char c = '한';
		String s = "한";
		String name = "장성찬";
		
		System.out.println("안녕하세요");
		System.out.println(str);
		
		
		System.out.print("안녕");
		System.out.print("하세요");
		System.out.println(str+str);
		System.out.println(str+str+"안녕");
		System.out.println("1"+i+str);

		
		String var01 = str+i;
		System.out.println(str + "랑" + i);
		System.out.println(str + d);
		System.out.println(i + i);
		System.out.println(ii + ii);
		
		System.out.println(c + c); // 숫자 코드로연산이되어버림
		System.out.println(s + s);
		
		System.out.println("제 이름은 " + name + " 입니다.");
		
		System.out.println("=======================");
		
		System.out.println("안녕\n하세요.");
		
		
		
		
		
		
		
		
	}

}
























