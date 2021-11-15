package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		//12. 반지름을 입력받아 원의 면적을 구하는 프로그램을 작성하세요
		//파이값을 3.14로 상수로 지정
		//공식 (원의 반지름)*(원의 반지름)*(원주율)
		//파이*r(반지름)^2
		
		Scanner sc = new Scanner(System.in);
			System.out.print("반지름을 입력하세요: ");
			double half = sc.nextDouble();
			final double pie = 3.14;
			double cercle = (half*half)*pie;
			
			System.out.println("원의 넓이는 "+cercle);
		sc.close();
		
	}
}
