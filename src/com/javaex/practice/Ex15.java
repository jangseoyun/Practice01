package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		//마일을 km로 변환하는 프로그램을 작성하세요
		//1마일 = 1.609km 상수로 지정
		
		Scanner sc = new Scanner(System.in);
		
			System.out.print("마일을 입력하세요: ");
			float mile = sc.nextFloat();
			final float km = 1.609f;
			float change = mile*km;
			
			System.out.println(mile+"마일은 "+change+"킬로미터 입니다.");
			//------------------------------
			System.out.print("마일을 입력하세요: ");
			double mile2 = sc.nextDouble();
			final double km2 = 1.609;
			double change2 = mile2*km;
			
			System.out.println(mile2+"마일은 "+change2+"킬로미터 입니다.");
					
		sc.close();
	}
}
