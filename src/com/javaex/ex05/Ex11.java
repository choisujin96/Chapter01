package com.javaex.ex05;

public class Ex11 {

	public static void main(String[] args) {
		
		
		
		/*
		//배열복사
		int[] leftArray = new int[3];
		
		leftArray[0] = 30;
		leftArray[1] = 40;
		leftArray[2] = 50;
		
        //int[] rightArray = leftArray;
		
		int[] rightArray = new int[3];
		for(int i=0; i<3; i++) {
			rightArray[i]=leftArray[i];
		}
		
		
		for(int i=0; i<3;i++) {
			System.out.println(leftArray[i]);
		}
		
		System.out.println("===================");
		
		for(int i=0; i<3;i++) {
			System.out.println(rightArray[i]);
		}
		
		
		*/
		
		
		
		
		//
		
		
			
			int[] lArray = new int[] {10, 20, 50};
			int[] rArray = new int[] {20, 20, 30};
			
			if(lArray.length == rArray.length) {
				//세부비교  갯수가 같은 상황
				for(int i=0; i<lArray.length; i++) {
					if(lArray[i] != rArray[i]) {
						//값이 다르면 일해!!
						System.out.println(i + " 번째 값이 다릅니다.");	
					}
				}
			}else {
				System.out.println("두배열의 크기가 다릅니다.");
			}
		
		

	}

}
