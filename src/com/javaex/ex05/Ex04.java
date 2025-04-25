package com.javaex.ex05;

public class Ex04 {
	public static void main(String[] args) {
		
		//  이 변수를   여기다가 담아주세요.[3칸 만들어줘]
		int[] intArr = new int[3];
		
		//이변수[몇번째방] = 방안에 있는 숫자
		intArr[0] = 3;
		intArr[1] = 6;
		intArr[2] = 9;
		
		
		
		//intArr.length  --> 위에 갯수 수정 해도 끝까지 출력한다.(for문의 출력갯수는 수정하지 않아도 됨)  
		
		//intArr.length 는 방갯수를 나타내는 거임.
		for(int i=0; i<intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		
		
	}

}
