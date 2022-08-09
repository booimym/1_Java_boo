package edu.kh.op.practice;

import java.util.Scanner;



public class OperatorPractice3 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("정수 입력 : ");
		int input1 = sc.nextInt();
		
		
		//양수/음수/0 한번에 하는 다른 방법!!
		// String result = 조건식 ? true : false;
		// String result = (input == 0 ) ? "0" : (input > 0 ? "양수" : "음수");
		//(0이 젤 먼저 나온 이유는 제일 빠르게 알 수 있는 조건식이라서)
		
		//system.out.println(result + "입니다.");
		
		// 이렇게 식을 한번에 할 경우, 앞 조건식에 0이 뒤 조건식에도 들어가냐 이게 문제가 될 수 있는데, 이건 포함 안됩니다. 좋아요
		
		
		
		String result1 = input1>0?"양수 입니다.":"";
		
		System.out.println(result1);
		
		
		System.out.print("정수 입력 : ");
		int input2 = sc.nextInt();
		
		String result2 = input2<0?"음수 입니다.":"";
		
		System.out.println(result2);
		
		System.out.print("정수 입력 : ");
		int input3 = sc.nextInt();
		
		String result3 = input3==0?"0 입니다.":"";
		
		System.out.println(result3);
		


	}

}
