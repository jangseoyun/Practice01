package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args){
		//사용자로부터 화씨 온도를 입력받아 섭씨 온도로 변환하는 프로그램 작성
		//(화씨온도 - 32) ÷ 1.8 = 섭씨온도
		Scanner sc = new Scanner(System.in);
		
			System.out.print("화씨: ");
			int f = sc.nextInt();
			double c = (f-32)/1.8;
			
			System.out.println("화씨 "+(float)f+" 의 섭씨온도는 "+c+" 입니다.");
			
		sc.close();
;	}
}
