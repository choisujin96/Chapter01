package com.javaex.ex01;

public class Ex01 {
	
	public static void main (String[] args) {
		
		int myAge;  //선언
		
		myAge = 25;  //초기화(값을 처음 넣는 것), = 이 기호는 오른쪽에 이는 걸 왼쪽에 넣으라는 뜻의 기호
		
		System.out.println(myAge);  //화면출력
		
		myAge = 26;
		
		System.out.println(myAge);
		
		
		/**********************************************/
		
		byte no;
		no=127;     //byte -128~127
		System.out.println(no);
		
		/**********************************************/
		
		
		//int 범위까지는 L을 쓰지 않아도 된다.
		//long형에서 int 범위를 벗어나는 경우 숫자끝에 L을 쓴다.
		
		long no2;
		no2 = 2147483648L;
		System.out.println(no2);
		
	
	}

}
