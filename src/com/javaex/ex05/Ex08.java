package com.javaex.ex05;

public class Ex08 {

	public static void main(String[] args) {
	
		
		//배열A
		int[] arrA = new int[3];
		
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 7;
		
		
		//배열B
		int[] arrB = new int[3];
		
		arrB[0] = 3;
		arrB[1] = 6;
		arrB[2] = 7;
		
		
		//arrA[1]를 100으로 바꾸시오.
		arrA[1] = 100;
		
		
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}//for문을 다 돌면 i는 없어지니 밑에도 i를 사용할 수 있다.
		
		System.out.println("==========================");
		
		for(int i=0; i<arrB.length;i++) {
			System.out.println(arrB[i]);
		}

	}

}
