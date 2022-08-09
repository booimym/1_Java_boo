package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("이름 : ");
		String input1 = sc.nextLine();
		
	
		System.out.print("학년(정수) : ");
		int input2 = sc.nextInt();
		
		System.out.print("반(정수) : ");
		int input3 = sc.nextInt();
		
		System.out.print("번호(정수) : ");
		int input4 = sc.nextInt();
		
		sc.nextLine(); //입력 버퍼 맨 앞에 남은 엔터를 꺼내옴 -> 입력 버퍼 청소
		
		
		System.out.print("성별(남학생/여학생) : ");
		String input5 = sc.nextLine();
		
		// 버퍼에 맨앞에 남은 엔터를 꺼내옴
		// -> 문자열을 입력하지 못하고 넘어감.
		
		//*해결방법*
		//입력 버퍼 맨앞에 있는 엔터(개행문자)를 제거
		
		//맨 앞에 엔터(개행문자)가 남는 경우 : nextLine();을 제외한 나머지 ㅋㅋ
		//뒤에 sc.nextLine()을 한번 더 작성하기
		
		// 띄어쓰기 없는 경우는 대부분 next()를 이용하는 것이 편합니다.
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		Double input6 = sc.nextDouble();
		
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f점 입니다.", input2,input3,input4,input1,input5,input6);
		
		
	}

}
