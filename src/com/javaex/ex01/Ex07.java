package com.javaex.ex01;

public class Ex07 {
	
	public static void main(String[] args) {
		
        double v01 = 5/4; //1.25 -->1.0
        System.out.println(v01);  // 5/4==>정수형(연산)정수형 ==> 정수형

        double v02 = (double)5 / 4 ;  
        System.out.println(v02);   
        
        double v03 = 5 / (double)4 ;  
        System.out.println(v03);     
        
        double v04 = (double)5 / (double)4 ;
        System.out.println(v04);
        
        double v06 = (int)1.3+1.8;
        System.out.println(v06);

	}

}
