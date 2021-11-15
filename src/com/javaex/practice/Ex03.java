package com.javaex.practice;

public class Ex03 {
	public static void main(String[] args) {
		//03. 아래의 출력결과를 예상하여 작성하세요.
		
		int x = 1;
		int y = 1; 
		
		int a = ++x *2; //(1) x값에 1을 더하라 (2) 2를 곱하라 (3) a 대입:출력 
		int b = y++ *2; //(1) y값에 2를 곱하라 (2) b에 대입하라:출력 (3) y값에 1을 더하라
		
		System.out.println("a=" + a); // a=4 : 1. (x)1+1=2 2. 2*2=4 3. a=4
		System.out.println("b=" + b); // b=2 : 2. (y)y*2=2 2. b=2
		System.out.println("x=" + x); // x=2 : ++x로 1+1이 됨 따라서 2
		System.out.println("y=" + y); // y=2 : y에 2를 곱함 따라서 2 
		
	}
}
