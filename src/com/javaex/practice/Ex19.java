package com.javaex.practice;

public class Ex19 {
	public static void main(String[] args){
		//long형 변수를 사용하여 빛이 1년동안 진행하는 거리를 계산하여 출력
		//단 빛의 속도는 300000km/s로 계산한다.
		
		final long ligt = 300000;
		long km = ligt*31536000L;
		System.out.println("빛이 1년 동안 가는 거리는 "+km+" km 입니다.");
		
	}
}
