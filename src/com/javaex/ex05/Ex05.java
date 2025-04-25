package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {
		
		int[] intArr = new int[3];
		intArr[0] = 3;
		intArr[1] = 6;
		intArr[2] = 35;
		
		/*
		System.out.println("----같은 결과 다른 문법"----);
		
		int[] intArr = new int[] {3,6,35};
		                   //[]안에 숫자는 꼭 빼야한다.
		
		
		System.out.println("----같은 결과 다른 문법"----);
	
		int[] intArr = {3,6,350};
		//공부할 땐 추천하지 않는 문법
		*/
		
		for(int i=0; i<intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		
		
	}

}
