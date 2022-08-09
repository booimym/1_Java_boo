package edu.kh.op.practice;

import java.util.Scanner;


public class OperatorPractice4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int input1 = sc.nextInt();
		System.out.print("영어 : ");
		int input2 = sc.nextInt();
		System.out.print("수학 : ");
		int input3 = sc.nextInt();
		
		
		// 합계를 저장하기 위한 변수 sum을 기억해두세요.
		
		//int sum = kor + eng + math;
		
		// 평균을 저장하기 위한 변수
		// sum/3.0 이렇게 3이 아니라 3.0으로 나눈 이유는?  
		// sum과 3은 둘다 자료형이 int니까 int/int = int가 됨... 소수점 버림해서 사라짐...
		// sum(int) / 3.0(double) = int가 더 큰 double로 자동형변환이 됨.
		
		//double avg = sum / 3.0;
		
		//--------------------------------------------------------------------------------------
		
		
		//String result kor>=40 && eng>=40 && math >= 40 && avg>=60 ? "합격" : "불합격" ;
		
		
		
		
	System.out.println("합계 : " + (input1 + input2 + input3));
	
	
	
	System.out.println("평균 : " + (input1 + input2 + input3)/3.0);
	
	boolean result1 =  input1 >=40 && input2 >= 40 && input3 >= 40 ;
	
	boolean result2 = ((input1 + input2 + input3)/3.0) >= 60;
	
			
	
	String result3 = (result1 == true && result2 == true ?"합격":"불합격");
		
		
		
	System.out.println(result3);

	
	}

}
