package com.javaex.ex01;

public class Ex05 {
	public static void main(String[] args) {
		
		//일반적인 방식
		double pi = 3.14;
		
		double result01 = pi*5*5;
		System.out.println(result01);
		
		
		//pi 값 변경가능
		pi=3.141512;
		double result02= pi*5*5;
		System.out.println(result02);
		
		//상수로 정의하는 방식
		//보통 변수이름은 소문자로 작성하나 final을 쓸 경우에는 대문자로 표기하기 암묵적인 약속을 함.
		final double PI =3.14;
		
		double result03 = PI*5*5;
		System.out.println(result03);
		
	
		/*
		//상수의 값을 변경하려고 하면 에러발생
		PI=3.1415926;  //PI는 상수로 선언 변경시 에러발생
		
		double result04 = PI*5*5;
		System.out.println(result04);
		*/
		
		
	}
}
