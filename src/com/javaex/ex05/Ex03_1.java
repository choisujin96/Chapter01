package com.javaex.ex05;

public class Ex03_1 {

	public static void main(String[] args) {
		
		//1.친구 이름 배열 만들기
		String[] friends = new String[]{"수진", "나라", "룰루", "랄라"};
		
		//2.배열 내용 출력하기 (반복문 사용)
		for (int i=0; i<friends.length; i++) 
			System.out.println(friends[i]);
	}

}
