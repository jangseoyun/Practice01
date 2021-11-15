package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
	public static void main(String [] args) {
		//사용자로부터 구의 반지름을 입력받아 구의 부피를 계산하는 프로그램을 작성
		//파이는 3.14 공식 > 부피 : 4/3*반지름^3*파이
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름: ");
		int radius = sc.nextInt();
		
		final double pai = 3.14;
		
		double volume = (4.0/3.0*pai*(radius*radius*radius));
//		double volume = ((double)4/(double)3*pai*(radius*radius*radius));

		
		System.out.print("구의부피는: "+volume+" 입니다.");
		
	
		
		sc.close();
	}
}
