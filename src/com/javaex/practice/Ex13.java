package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		//13. 원화를 달러화로 계산하는 프로그램을 작성하세요
		//환율 1달러 = 1230.95 상수로 지정
		
		Scanner sc = new Scanner(System.in);
			
			System.out.print("환전할 원화를 입력하세요:");
			int doller01 = sc.nextInt();
			final float fix = 1230.95f;
			float doller = doller01/fix;
			
			System.out.println("받으실 달러는"+doller);
			
			System.out.print("환전할 원화를 입력하세요:");
			int doller02 = sc.nextInt();
			final double fix2 = 1230.95;
			double doller2 = doller02/fix;
			
			System.out.println("받으실 달러는"+doller2);
		
			
		
		sc.close();
	}
}
