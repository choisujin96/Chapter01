package com.javaex.ex03;

import java.util.Scanner;

public class Ex009 {
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("과목을 입력하세요");
		 System.out.print("과목:");
		 
		 int sub = sc.nextInt();
		 
		 if(sub == 1) {
			 System.out.println("R101호");
			 
		 }else if(sub == 2) {
			 System.out.println("R202호");
		 
		 }else if(sub == 3) {
			 System.out.println("R303호");
			 
		 }else if(sub == 4) {
			 System.out.println("R404호");
		 
		 }else {
			 System.out.println("상담원에게 문의하세요");
		 }
		
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
	}

}
