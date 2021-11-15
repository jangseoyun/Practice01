package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		//20. 동전별 개수를 입력받아 총금액을 계산하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
			
			System.out.print("500원 개수: ");
			int fiv_hun = sc.nextInt();
			System.out.print("100월 개수: ");
			int one = sc.nextInt();
			System.out.print("50원 개수: ");
			int five = sc.nextInt();
			System.out.print("10원 개수: ");
			int ten = sc.nextInt();
			
			int sum = fiv_hun*500+one*100+five*50+ten*10;
			System.out.println("동전의 총합은 "+sum+" 원 입니다.");
		
		sc.close();
	}
}
