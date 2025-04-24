package com.javaex.ex04;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		
		while(true) {
			
			System.out.println("숫자를 입력하세요.");
			System.out.print("숫자: ");
			int num = sc.nextInt();
			
			
			if(num==0) {
				break;
				
			}//else를 break때문에 생략가능.
			if(num%3==0) {
		
				System.out.println("3의 배수입니다.");
			}else {
				System.out.println("3의 배수가 아입니다.");	
			}
			
			//반복문(while) 처음으로
			
		}
			
		
		
		System.out.println("종료");
		sc.close();
		
		
	}

}
