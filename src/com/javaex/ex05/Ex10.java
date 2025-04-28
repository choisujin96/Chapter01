package com.javaex.ex05;

public class Ex10 {

	public static void main(String[] args) {
		
		int[] arrA = new int[3];
		
		arrA[0] = 3;        //Ex10번은 이 부분을 for문으로 복사
		arrA[1] = 5;
		arrA[2] = 8;
		
		
		int[] arrB = new int[3];
		
		//같은 방끼리 복사한다.  A--->B
		for(int i=0; i<3; i++) {
			arrB[i] = arrA[i];
		}
	
	
		//arrA 출력
		for(int i=0; i<3; i++) {
			System.out.println(arrA[i]);

		}
		
		//arrB출력
		for(int i=0; i<3; i++) {
			System.out.println(arrB[i]);
		}
		
		//서로 다른 2개의 배열
		
	
	}

}
