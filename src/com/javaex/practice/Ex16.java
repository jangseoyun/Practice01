package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	public static void main (String[] args) {
		//16. 상품을 구매하면 정가의 10%를 부가세로 부여한다.
		//아래와 같이 출력되도록 프로그램 작성
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품가격: ");
		int price = sc.nextInt();
		System.out.print("받은돈: ");
		int take = sc.nextInt();
		System.out.println("==========================");
		
		float take2 = (float)take;
		System.out.println("받은돈: "+take2);
		
		float price2 = (float)price;
		System.out.println("상품가격: "+price2);
		
		System.out.println("부가세: "+price*10.0/100.0);
		
		System.out.println("잔액: "+(take-price2));
		
		sc.close();
	}
}
