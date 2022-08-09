package edu.kh.control.condition;

import java.util.Scanner;

public class SwitchExample {

	/* switch문
	 * -식 하나의 결과로 많은 경우의 수를 처리할 때 사용하는 조건문
	 * -> 식의 결과로 얻은 값과 같은 case구문이 수행된다.
	 * 
	 * [작성법]
	 * 
	 * 	// switch문의 식은 결과가 true/false가 아닌 식 : 결과가 가,나,다,라1,2,3,4,이런거 나오면 됨
	 * switch(식){
	 * 
	 * case 결과값1 : 수행코드1; break;
	 * case 결과값2 : 수행코드2; break;
	 * case 결과값3 : 수행코드3; break;
	 * ...
	 * default : 모든 case가 만족하지 않을 경우 수행하는 코드;
	 * 
	 * 
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public void ex1() {
		
		// 키보드로 정수를 입력 받아
		// 1이면 " 빨강색 "
		// 2이면 " 주황색 "
		// 3이면 " 노랑색 "
		// 4이면 " 초록색 "
		// 1에서 4가 아니면 "흰색"을 출력
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("정수 입력 : ");
	int input = sc.nextInt();
	
	String result ;
	
//	if (input ==1) {
//		result = "빨강색";
//	} else if(input ==2) {
//		result = "주황색";
//	} else if(input ==3) {
//		result = "노랑색";
//	} else if(input ==4) {
//		result = "초록색";
//	} else {
//		result = "흰색";
//	}
//	
	
	switch(input) {   //식 : 여러 값이 나오는 경우를 집어 넣으면 된다. 굳이 a+b이런 형태일 필요 없어.
	case 1 : result = "빨강색"; break ;
	case 2 : result = "주황색"; break ;
	case 3 : result = "노랑색"; break ;
	case 4 : result = "초록색"; break ;
	
	default : result = "흰색";
	
	}
//리모컨 switch랑 동작원리가 똑같음! input = 7번 입력하면 case값 일치하는 거 찾아서 동작 수행하는 거임.
	
		
		System.out.println(result);
		
		
	}
	
	public void ex2() {
		
		// 정수를 입력 받아
		// 나머지가 1이면 "백팀"
		// 나머지가 2이면 "청팀"
		// 나머지가 3이면 "홍팀"
		// 나머지가 1~3이 아니면 "깍두기"
		
		//정수입력 : 1
		//백팀입니다.
		
		//정수입력 : 4
		//깍두기입니다.
		
		
		
	Scanner sc = new Scanner(System.in);
	System.out.print("정수 입력 : ");
	
	int input = sc.nextInt();
	String result;
	
	switch (input % 4) { //4로 나누면, 나머지가 0,1,2,3이 나옴.
	case 1 : result = "백팀"; break;
	case 2 : result = "청팀"; break;
	case 3 : result = "홍팀"; break;
	default : result = "깍두기"; break;
	}
		
		System.out.println(result + "입니다.");
		
	}
	
	public void ex3() {
		
		// switch문의 식 결과가 double형인 경우 - 불가능
			
		Scanner sc = new Scanner(System.in);
		System.out.println("김밥(3000원) / 라면(4000원) / 샌드위치(5000원) / 짬뽕(10000원) ");
		System.out.print("메뉴 입력 : ");	
		
		String input = sc.next();
		int result;

		
		switch(input){
			
			case "김밥" : result = 3000; break;
			case "라면" : result = 4000; break;
			case "샌드위치" : result = 5000; break;
			case "짬뽕" : result = 10000; break;
			default : result = -1;  //이게 뭐더라? ㅠㅠ
			}
		
		if(result == -1) {
			System.out.println("잘못입력하셨습니다.");
		} else {
			System.out.printf("%s는 10000원 입니다. \n", input, result);
			
		}
		
		
		
		
		
	}
	
	
	public void ex4() {
		
		//산술 연산 계산기 만들기
		//두 정수와 1개의 연산자( + - * / % (String))을 입력받아서 
		//연산 결과를 출력해라.
		//단, 나누기(/) 연산 시  0으로는 나눌 수 없도록 한다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력 : ");	
		int num1 = sc.nextInt();
		System.out.print("연산자 입력 : ");	
		String op = sc.next();
		
		
		System.out.print("정수2 입력 : ");	
		int num2 = sc.nextInt();

		//----------내방법----------------//result의 문제점 - default부분에서는 쓸 게 없음.
		//최소 2개의 변수가 릴요해
		//result : 결과 저장 변수
		// 정상적인 연산자인가? 판단하는 변수
		
		
//		
//		int result;
//		
//	switch(op) {
//	
//	case "+" : result = num1 + num2 ;break;
//	case "-" : result = num1 - num2 ;break;
//	case "*" : result = num1 * num2 ;break;
//	case "/" : 
//		
//		
//		// 두 번째 입력한 정수가 0인 경우
//		// 두 번째 입력한 정수가 0이 아닌 경우
//	
//		if (num2 ==0 ){
//			result = -2;
//		} else {
//			result = num1/num2;
//		}
//		
//		;break;
//	
//	
//	case "%" : result = num1 % num2 ; break;
//	default : result = -1;
//	}
//	
//		
//	
//	if (result == -1) {
//		System.out.println("존재하지 않는 연산자입니다.");
//		
//	} else {
//	
//	
//	System.out.printf("%d %s %d = %d",num1,op,num2,result);
//	}
//		//정수1 입력 : 5
//		//연산자 입력 : +
//		// 정수2 입력 : 4
//		//5 + 4 = 9
//
//		//정수1 입력 : 5
//		//연산자 입력 : /
//		// 정수2 입력 : 0
//		//0으로는 나눌 수 없습니다.
//		
//		//정수1 입력 : 5
//		//연산자 입력 : @
//		// 정수2 입력 : 3
//		//존재하지 않는 연산자 입니다.
//		
	//----------쌤방법----------------//
	
	switch(op) {
	case "+" : System.out.printf("%d %s %d = %d",num1,op,num2,num1 + num2);break;
	case "-" : System.out.printf("%d %s %d = %d",num1,op,num2,num1 - num2);break;
	case "*" : System.out.printf("%d %s %d = %d",num1,op,num2,num1 * num2);break;
	case "/" : 
	
		if (num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
		}else {
			System.out.printf("%d %s %d = %d",num1,op,num2,num1 / num2);
			
		};break;
			
	case "%" : System.out.printf("%d %s %d = %d",num1,op,num2,num1 % num2);break;
	default : System.out.println("존재하지 않는 연산자입니다.");break; // 아 그냥 해도 되는군.....	
	
	}
	
	
	
	
	
	}
	
	
	
	public void ex5() {
		
		//switch문의 break 역할
		
		//계절 판별(switch버전)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("달 입력 : ");
		int month = sc.nextInt();
		
		String season;
		
		// switch문에서 break는
		// "해당 case를 수행한 후 멈춰라"라는 뜻
		// break가 없을 경우
		// -> 다음 case가 연달아서 수행된다!
		
		//장점 : 
		
		switch(month) {
		
		case 3 : case 4 : case 5 : season = "봄" ;break;
		
		case 6 : case 7 : case 8 : season = "여름" ;break;
		
		case 9 : case 10 : case 11 : season = "가을" ;break;
		
		case 12 : case 1 : case 2 : season = "겨을" ;break;
		
		default : season = "잘못 입력 하셨습니다.";
		
		
		}
		
		System.out.println(season);
	}
	
	
	
	
	}
	
	
	
	
	
	

