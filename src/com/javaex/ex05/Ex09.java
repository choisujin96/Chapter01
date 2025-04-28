package com.javaex.ex05;

public class Ex09 {

	public static void main(String[] args) {
		
		/*
		int no =5;
		int var = no;
		*/
		
		
		int[] arrA = new int[3];
		
		arrA[0] = 3;
		arrA[1] = 5;
		arrA[2] = 6;
		
		//new를 사용해야 새로운 저장소가 만들어짐. 
		//이렇게 사용하면 같은 주소를 공유하게 됨!
		int[] arrB = arrA;
		
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		
		System.out.println("===============================");
		//A 값이 B에도 먹었는지 확인.
		for(int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
		
		System.out.println("===============================");
		
		//A[1]를 100으로 변경
		arrA[1] = 100;
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		
		System.out.println("===============================");
		
		//변경한 A[1]이 B에도 먹었는지 확인.
		for(int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
		
		System.out.println("===============================");
		
		//B[2]를 999로 변경
		arrB[2] = 999;
		
		for(int i=0; i<arrB.length;i++) {
			System.out.println(arrB[i]);
		}
		
		System.out.println("===============================");
		
		//변경한 B[2]가 A에도 먹었는지 확인.
		for(int i=0; i<arrA.length;i++) {
			System.out.println(arrA[i]);
		}
	}
}
