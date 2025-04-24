package com.javaex.ex03;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
	
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("월:");
		
		int month = sc.nextInt();
		
		switch(month) {
			case 1: System.out.println("31일");
			break;
			
			case 2: System.out.println("28일");
			break;
			
			case 3: System.out.println("31일");
			break;
			
			case 4: System.out.println("30일");
			break;
			
			case 5: System.out.println("31일");
			break;
			
			case 6: System.out.println("30일");
			break;
			
			case 7: System.out.println("31일");
			break;
			
			case 8: System.out.println("31일");
			break;
			
			case 9: System.out.println("30일");
			break;
			
			case 10: System.out.println("31일");
			break;
			
			case 11: System.out.println("30일");
			break;
			
			case 12: System.out.println("31일");
			break;
			
		}
		
		sc.close();
		*/
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요:");
		
		int month = sc.nextInt();
		
		switch(month) {
		
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30");
				break;
				
			case 2: 
				System.out.println("28");
				break;
				
			default:
				System.out.println("31");
				break;
		
		}//장점: 독립된 덩어리로 보여서 깔끔해 보임
		  //단점: 많이 줄여놔서 파악하는데 시간이 걸림. 
		
		sc.close();
	
	}

}
