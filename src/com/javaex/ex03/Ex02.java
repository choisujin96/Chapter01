package com.javaex.ex03;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수:");
		int point = sc.nextInt();
		
		if(point>=60) {
			//true일때 해야할 일
			System.out.println("합격입니다.");
		}
		
		//합격과 불합격이 동시에 같이 출력되면 안되므로 격리 시켜야함
		
		else {
			//false일때 해야할 일
			System.out.println("불합격입니다.");
		}
		
		System.out.println("프로그램종료");
		
		sc.close();
		
		
		
		
		
	}
}
