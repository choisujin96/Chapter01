package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {
		
		/*
		double[] doubleArr = new double[3];
		
		doubleArr[0] = 3.4;
		doubleArr[1] = 6.2;
		doubleArr[2] = 9.5;
		
		for(int i=0; i<doubleArr.length; i++) {
			System.out.println(doubleArr[i]);
		}
		*/
		
		System.out.println("==================");
		
		
		char[] charArr = new char[4];
		
		charArr[0] = 'a';
		charArr[1] = 'b';
		charArr[2] = 'c';
		charArr[3] = 'd';
		
		for(int i=0; i<charArr.length;i++) {
			System.out.println(charArr[i]);
		}
		
		System.out.println("==================");

		String[] sArr= new String[3];
		
		sArr[0]="정우성";
		sArr[1]="유재석";
		sArr[2]="이효리";
		
		for(int i=0; i<sArr.length;i++) {
			System.out.println(sArr[i]);
		}
		System.out.println("반장: " + sArr[1]);
	}

}
