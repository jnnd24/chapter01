package com.javaex.ex05;

public class Ex07 {

	public static void main(String[] args) {

		int[] leftArray = new int[] {10, 20, 30};
		int[] rightArray = new int[] {10, 20, 30};
		
		if(leftArray.length == rightArray.length) {// 두 배열의 ""갯수"" 가 같은지?
			System.out.println("배열 세부 검사");
			for(int i=0; i<leftArray.length; i++) {
				if(leftArray[i] != rightArray[i]) {
					System.out.println(i+"번쨰 값이 다릅니다");
				}else {
					System.out.println("같습니다.");
				}
			}
			
			
		}else {
			System.out.println("두 배열의 크기가 다릅니다.");
		}
		
		
		
	}

}
