package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {
		
		System.out.println("안녕");
		System.out.println("하세요"); // println 은 자동줄바꿈 (개행을 함)  
		
		System.out.print("안녕");
		System.out.print("하세요"); // print는 자동줄바꿈 X (개행을 하지 않음)
		
		System.out.println("---------------------");
		
		int i =2345;
		double d = 3.14;
		char c = '한'; //--> char는 무조건 한글자만 쓸 수 있고, 따옴표 사용해야함.
		
		String s = "안녕";   //-->String은 한글자여도 쌍따옴표 써야함.
		String str = "굿모닝";
		String name = "최수진";
		
		System.out.println(str);
		System.out.println(5+3);
		System.out.println("굿모닝"+"최수진");
		System.out.println(str+name);
		
		System.out.println("굿모닝"+ i);
		
		System.out.println(i+ i);  //정수+정수
		System.out.println(i+d); //정수+실수 ==> 실수(자동형변환)+실수
		System.out.println(str + i);
		System.out.println(str + d);
	
		String result = name + d; //문자열 + 정수 ==> 문자열+실수==> 문자열!
		System.out.println(result);
		
		//굿모닝랑최수진
	
		String result0 = str +"랑"+ name;
		System.out.println(str+"랑"+name);
	
		System.out.println(str+" 랑 "+name); // 공백도 하나의 글자다.
		
		
		//굿모닝 최수진
		System.out.println(str+" "+name);
	
		//제이름은 최수진 입니다.
		System.out.println("제이름은 "+name+" 입니다.");
	
		System.out.println("--------------------------");

		System.out.println(c);  //한
		System.out.println(c+c);  //한한 char형(코드값 숫자로 관리)은 + 숫자더하기

		//제이름은 "최수진"입니다.
		System.out.println("제이름은 \""+ name + "\" 입니다."); // \표시와"표시를 같이 사용해야 표ㅅㅣ가 됨. \"이렇게 양쪽 사용\"
		
		//제이름은 '최수진'입니다.
				System.out.println("제이름은 '" + name + "' 입니다.");
		
	
		//제이름은 \최수진\입니다.
		System.out.println("제이름은 \\" + name + "\\ 입니다.");
		
		//제이름은 최수진 입니다.
		System.out.println("제이름은\t" + name + "입니다.");   //-->탭 사용은 몇글자를 쓰든 탭으로 생긴 공백 간격 동일
		System.out.println("나의이름은\t" + name + "입니다.");
		
		System.out.println("제이름은\n" + name + "입니다."); //--> 줄바꿈
	}
	
	
}
