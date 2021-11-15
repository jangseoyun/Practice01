package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		//11. 월급을 입력받아 10년동안 최대 저축액을 계산하는 프로그램 작성
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월급을 입력하세요:");
		int month = sc.nextInt();
		int year = month*120;				
		
		System.out.println("10년동안 최대 저축액은 "+year+"원 입니다.");
		System.out.println("10년동안 최대 저축액은 "+month*120+"원 입니다.");
		sc.close();
	}
}
