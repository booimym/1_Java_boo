package edu.kh.control.loop;

import java.util.Scanner;

public class WhileExample {

	/* While문
	 * 
	 * - 별도의 초기식, 증감식이 존재하지 않고
	 *   반복 종료 조건만을 설정하는 반복문
	 * 
	 * 
	 * - 반복 횟수가 정해져 있지 않지만 
	 *   언젠간 반복이 종료되는 경우에 사용한다.
	 * 
	 * [작성법]
	 * 
	 * while(조건식) { 
	 * 
	 * 	조건식이 true인 경우 반복 수행할 구문
	 * 
	 * }
	 */
	
	
	public void ex1() {
		
		// while 기초 사용법 1
		
		// 1부터 10까지 출력 (While / for)
		
		for (int i = 1 ; i <= 10 ; i++) {
			
			System.out.println(i);

		}
		
		System.out.println("===========================================");
	
	
	int i = 1;
	while(i<= 10) {
		
		System.out.println(i);
		
		i++;
		
		}
	
	}
	
	
	public void ex2() {
		
		//while 기초 사용법 2
		
		//입력되는 모든 정수의 합 구하기
		//단, 0이 입력되면 반복 종료
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		int input = -1;
		//input = while문 내에서 입력 받은 값을 저장할 변수인데
		
		//입력받은 값이 0인 경우라는 조건을 판별하기 위해
		//while문 보다 앞에 먼저 선언을 함.
		
		//하지만 input변수 선언 시 초기화가 되어있지 않으면 조건식 수행을 못하기 때문에
		//0이 아닌 임의의 값을 이용해서 초기화를 한다.
		
		
		// -> 왜 0은 안 되는가?
		// 0으로 초기화하는 경우 while문 조건이 바로 false가 되며
		//한번도 반복을 못하는 상황이 발생하게 되기 때문에
		// (조건식 !=0인데 0으로 초기화하면 안 됨)
		
		
		while(input != 0 ) {
			//input cannot be resolved to a variable
			//input != 0에 대한 에러 뜸 - input 변수가 해석되지 않는다 == 변수가 존재하지 않는다.
			
			
			//조건식 내에 있으니까 무한히 정수 입력을 받을 것이다.
			//이 입력받은 정수를 누적시킬 것임.
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			
			
			sum += input;
			
			System.out.println("현재 누적 값" + sum );
			
		}
		
	}
	public  void ex3() {
			
			// 분식집 주문 프로그램
			
			// ex)
			// ---메뉴---
			// 	1. 떡볶이(5000원)
//				2. 김밥(3000원)
//				3. 라면(4000원)
//				4. 돈까스(8000원)
//				9. 주문 완료
//				메뉴선택  >> 1 
// 				---메뉴---
// 				1. 떡볶이(5000원)
//				2. 김밥(3000원)
//				3. 라면(4000원)
//				4. 돈까스(8000원)
//				9. 주문 완료
//				메뉴선택  >> 2 
// 				---메뉴---
// 				1. 떡볶이(5000원)
//				2. 김밥(3000원)
//				3. 라면(4000원)
//				4. 돈까스(8000원)
//				9. 주문 완료
//				메뉴선택  >> 9 
			
			//떡볶이 김밥을 주문하셨습니다.
			//총 가격은 8000원입니다.
			
			
		Scanner sc = new Scanner(System.in);
		
		int input = 0; 
		//초기화를 해줘야 되는데, 0으로 해도 ㅇㅋ. 
		
		
		
		String menu =""; //문자열 누적을 위해 초기화 진행.
		//"가나다" : 내용있음, " " : 띄어쓰기(내용)가 있음
		//"" : 빈 문자열(내용은 없지만 문자열임)
		
//		menu += "떡볶이";
//		menu += "김밥";
//		출력 : " 떡뵉이 김밥"
//		
		int sum = 0; //가격 합계
		
		boolean flag = false;//신호로 사용하는 변수
		// true : 첫 번째가 아닌  주문
		// false :  첫 번째 주문 (깃발 내려져 있는 상태)
		
		while(input != 9) {
			
			System.out.println("===메뉴===");
			System.out.println("1. 떡볶이(5000원)");
			System.out.println("2. 김밥(3000원)");
			System.out.println("3. 라면(4000원)");
			System.out.println("4. 돈까스(8000원)");
			System.out.println("9. 주문 완료");
			
			System.out.print("메뉴선택  >>");
		
		input = sc.nextInt();
		
		System.out.println(); //줄바꿈
		
		//flag는 t/f인 변수니까 t/f인 조건식 안에 걍 드갈 수 있음.
		if (flag && (input >=1 && input <=4)) { //true인 경우(첫주문x) + 메뉴를 잘 입력했을 때
			
			menu += ", ";
			
		} else { // false인 경우 실행
			flag = true;//??????
		}
		
		switch(input) {
		case 1: 
			menu += "떡볶이";
			sum += 5000; // 떡볶이
			break;
		case 2:
			menu += "김밥";
			sum += 3000; //김밥
			break;
		case 3: 
			menu += "라면";
			sum += 4000; //라면
			break;
		case 4: 
			menu += "돈까스";
			sum += 8000; //돈까스
			break;
		case 9: 
			
			break;
		default : System.out.println("잘못 입력하셨습니다.");
		}// switch 끝나는 부분
		
				
		} //while end
		
		//떡볶이 김밥을 주문하셨습니다.
		//총 가격은 8000원입니다.
		
		System.out.println(menu + "을/를 주문하셨습니다.");
		System.out.println("총 가격은 "+sum+"원 입니다.");
		
		
	}
	
	//방법2개
	

	public void ex4() {
		
		/*   do - while문
		 * 	
		 * - ★최소 1회★ 이상 반복하는 while문
		 * 
		 * [작성법]
		 * 
		 *  do {
		 *  
		 *  
		 *  } while(조건식);
		 *  
		 *  do 				: { } 내부 코드를 일단 수행해라.
		 *  while(조건식)	: 조건식이 true이면  { } 내부코드를 반복 수행 
		 *   
		 *   
		 *
		 */
		
		 Scanner sc = new Scanner(System.in);
	      
	      int sum = 0;
	      
	      int input = 0; 
	      
	      do {
	         System.out.print("정수 입력 : ");
	         input = sc.nextInt();
	         
	         sum += input;
	         
	         System.out.println("현재 누적 값 : " + sum);
	      }while( input != 0 );
		
				
		
	}
	
	public void ex5() {
		
		
		
		
	}
	
}
