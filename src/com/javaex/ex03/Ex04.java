package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("근무시간을 입력하세요.");
		System.out.print("근무시간:");
		int work = sc.nextInt();
		
		//{}문 안쪽에서 생성된 변수는 {}문이 끝나면 사라진다.
		//따라서 {}문 밖에서도 사용할 변수는 {}문 밖에서 선언한다.
		
		int sum = 0;  //sum을 초기화 해야 마지막 입력값을 먹음
	
		if(work<=8){
			sum = work * 10000;
			
			
		}else if(work>8) {
			sum = (work-8)*12000 + 8*10000;		
		
		/*		
		int overtime = work - 8;
		System.out.println( (8 * 10000) + (overtime * 12000));
		*/
			
		}
		
		System.out.println("임금은 " + sum + " 입니다.");
		
		sc.close();
		
	}

}
