package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요:");
		int point = sc.nextInt();
		
		if(point >= 90) {
			
			System.out.println("A등급입니다.");
		
		}else if(point<90 && point>=80) {    //point<90 은 필요없는 질문. 왜냐면 위에 질문에서 90이상들은 이미 걸러져서
			                  				// 나머지 애들만 떨어졌기 때문. 밑에도 마찬가지.
			
			System.out.println("B등급입니다.");
						
		}else if(point<80 && point>=70) {
			
			System.out.println("C등급입니다.");
			
		}else if(point<70 && point>=60) {
			
			System.out.println("D등급입니다.");
		
		}else if(point < 60){
									//얘는 아예 필요없는 질문이다. 그치만 초급단계에선 지금 이코드들이 이해하기 쉽다.
			System.out.println("F등급입니다.");
		}
		
		sc.close();		
		*/
	
	
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요:");
		int point = sc.nextInt();
		
		if(point >= 90) {
			
			System.out.println("A등급입니다.");
		
		}else if(point>=80) {  
			
			System.out.println("B등급입니다.");
						
		}else if(point>=70) {
			
			System.out.println("C등급입니다.");
			
		}else if(point>=60) {
			
			System.out.println("D등급입니다.");
		
		}else{
								
			System.out.println("F등급입니다.");
		}
		
		sc.close();		
	
	
	
	
	
	
	}

}
