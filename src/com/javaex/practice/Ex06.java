package com.javaex.practice;

public class Ex06 {
	public static void main(String[] args) {
		//06. 아래의 출력결과를 예상하여 작성하세요.
		
		int i = 10;   
		int n = i++ %2;
		
		System.out.println(i); // 10 + 1 = 11
		System.out.println(n); // 10%2 = 0 
	}
}
