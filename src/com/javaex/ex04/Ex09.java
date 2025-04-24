package com.javaex.ex04;

public class Ex09 {

	public static void main(String[] args) {
		
		/*
		while(true) {
			if(조건 no가 6의 배수이고 no가 14의 배수냐?) {
				while문 탈출
			}
		}
		*/

		
		
		/*
		int no = 1;
		
		while(true) {
			
			if(no%6==0 && no%14==0) {
				break;
			}
			System.out.println("현재: " + no);
			no++;
		}
		
		System.out.println("정답: " + no);
		 */
	
		////////////////////////////////
		
		
		//break는 밑에 질문이 있건 말건 바로 입구컷인데
		//아래는 true를 false로 바꿔주면 밑에 질문까지는 통과는 시키지만 다시 들어갈 수 없음.
		
		
		
		int no = 0;
		
		boolean action = true;
		
		while(action) {
			no++;
			System.out.println("현재: " + no);
			
			if(no%6==0 && no%14==0) {
				action = false;
			}
			
		}
		
		System.out.println("정답: " + no);
		
	}
	
}
