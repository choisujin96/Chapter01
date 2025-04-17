package com.javaex.ex01;

public class EX09 {

	public static void main(String[] args) {
		
		//대입연산자 = 
		int a = 7;
		int b = 2;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("------------------");
		
		//산술연산자
		int sum = a + b;
		System.out.println(sum);

		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); // 7/2=(3)----1 /는 나눠서 나온 몫과 나머지 중 몫만 보여줌.
		System.out.println(a%b); // 7/2= 3----(1) %는 나눠서 남은 애를 보여줌. 
		
		System.out.println(7/2); // 3 정수/정수=>정수 
		System.out.println(7.0/2); // 7.0/2.0 =>3.5
		
		System.out.println("------------------");
		
		//부호연산자
		int var = -3;
		int pVar = -var; // -(-3) ==> (+)3
		System.out.println(pVar);
		
		int mVar = +var; // +(-3) ==>-3
		System.out.println(mVar);
		
		//증(가),감(소)연산자
		
		System.out.println(a); // 7
		System.out.println(++a); // 7->8 (실제 기존의 a의 메모리 값을 +1 해버리는 것)  +1, 출력 선증가 후출력
		System.out.println(a); // 8
	
		System.out.println(b); // 2 
		System.out.println(--b); // 2->1 (실제 기존의 b의 메모리 값을 -1 해버리는 것)
		System.out.println(b); // 1
		
		
		System.out.println("------------------");
		System.out.println(a); // 8
		System.out.println(a++); // 8  출력, +1  선출력 후증가
		System.out.println(a); // 9
		
		System.out.println(b); // 1
		System.out.println(b--); // 1  출력, -1  선출력 후증가
		System.out.println(b); // 0
		
		//해야할 일을 나열 후 가 장먼저, 가장 나중에 할 지 결정
		
		int c = 5;
		System.out.println(++c * 2); //12
		System.out.println(c); //6
		
		int d =5;
		System.out.println(d++ * 2);// 10
		System.out.println(d); //6
		
		
		
	}
}
