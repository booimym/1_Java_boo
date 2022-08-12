package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {

	
	
	public void ex1() {
		
		//break 문 : [가장 가까운] 반복문을 빠져 나가는 구문
		
		for (int i = 1 ; i <= 10000 ; i++) {
			
			
			System.out.println( i );
			
		// i가 20일 때 반복을 종료하고 싶으면, 
			
		if (i ==20) {
			
			break;
			
			}
			
		}
		
		
		System.out.println("=============");
		
		
		for (int row = 1 ; row <= 5; row++) {
			
			for (int col = 1 ; col <= 100 ; col++) {
				
				System.out.printf("(%d , %d)", row, col);
				
				if(col ==3) {
					break; // [더 가까운] 반복문
				}
				
			}
			
			if(row==3) {
				break;
			}
			
			System.out.println();//줄바꿈
			
		}
		
		
	}
	
	
	public void ex2() {
		//0이 입력될 때까지의 입력된 정수의 합 구하기
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		
		while(true) { //조건식에 강제로 true 작성 = 무한반복 ->무한반복만 하니까 도달할 수 없는 코드가 됨)
			
			System.out.print("정수 입력 :");
			int input = sc.nextInt();
			
			if(input ==0) {
				break;
				
				
			}
			
			
			
			sum += input; //누적
			
			
		}//while문 끝
		
		System.out.println("합계 :" + sum);
		//Unreachable code
		
		
		
		
	}
	
	public void ex3() {
		
		//"exit@" 문자열이 입력될 때까지 문자열을 누적하기
		
		
		Scanner sc = new Scanner(System.in);
		
		String str = ""; //비어있는 문자열( 숫자로 따지면 0과 같다)
		
		System.out.println("----문자열 입력 (종료 시 exit@를 입력해라----");
		while (true) {
			
			String input = sc.nextLine(); //next는 한 단어, nextLine은 한줄
			
			
			//에러 이유) 비교연산자는 보통 기본 자료형(8개)의 값 비교만 가능하다.
			// String은 기본 자료형 x, 참조형 o
			
			
			// 참조형은 A.equals(B) 값을 비교할 수 있다!
			// A.equals(B)  A == B
		
			if(input.equals( "exit@")) {
				
				break;
			}
			
			str += input +"\n"; //누적하면서 줄 바꿈
			
			
		}
	
	System.out.println(str);
	
	
	}
	
	public void ex4() {
		
		//continue : 다음 반복으로 넘어감 (반복문을 멈추는 게 아니라)
		
		//1부터 30까지 5의 배수를 제외하고 출력 (continue사용)
		
		
		for( int i = 1 ; i <= 30 ; i++) {
			
			if(i % 5 == 0) {
				continue; //다음 반복으로 이동(증감식 부분으로 이동)
			}
			
			System.out.println(i);
		}
		
	}
	
	public void ex5() {
		
		//1~100까지 1씩 증가하며 출력하는 반복문
		// 단, 5의 배수는 건너뛰고
		//증가하는 값이 40이 되었을 때 출력 후 반복을 멈춤.
		
		for(int i = 1 ; i <= 100 ; i++) {
			
			
			if(i == 40) {
				System.out.println(i);
				break;
			}
			
			if( i % 5 == 0) {
				continue;
					
			}
			
			System.out.println(i );
			
			
			
		}
		
		
		// (1) 40을 출력하고 멈추려면, print를 먼저 쓰고 break를 밑에 써야지...
		// (2) continue를 위에 써버리면 40이 됐을 때 증감식부분으로 넘어가버림...
		// 
		
		
		
	}
	
	public void upDownGame() {
		
		//프로그램 시작 시 1~50 사이의 임의의 수(난수)를 하나 생성하여
		//사용자가 몇 회만에 맞추는지 카운트
		//만약 틀렸을 경우 난수가 입력한 수보다 크면 UP/ 작으면 DOWN을 출력한다.
		
		//(임의의 수가 30일 경우)
		// ex) 1번 입력 : 10
		// UP
		// ex) 2번 입력 : 40
		// Down
		// ex) 3번 입력 : 30
		// 정답입니다.( 총 입력 횟수 : 3회)
		
		//break문을 사용하는 쪽으로 해보기
		
		/*
		 * [난수 생성 : Math.random() -> Java에서 제공해주는 난수 생성 방법
		 * 	0.0 <= x(난수) < 1.0		0.0이상 1.0미만의 난수를 생성( double형 )
		 * 
		 * random에다가 커서 두고 shift + f2 누르면 api문서가 뜬다.
		 * 
		 *  
		 */
		
//		int i ;
//		int count = 0;
//			
		int ran = (int)(Math.random() * 50 +1 );
//			
//		
//		for( i = 1; i <=50 ; i++ ) {
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print( i+"번 입력 : ");
//		int input = sc.nextInt();
//		
//		//0.0 * 50 <= x(난수) < 1.0* 50
//		//0.0 + 1 <= x <50.0 + 1
//		//1.0 <= x *50 +1 < 51.0
//		// 1 <= int(x*50 +1) <51 (소수점 버림 처리) -> 1~50사이 난수
//		
		System.out.println(ran);
//		
//		count ++ ;
//		
//		if (ran == input) {
//			System.out.println("정답입니다.총 정답 횟수 :" + count+"회");
//			
//		} else if (ran < input) {
//			System.out.println("Down");
//		} else {
//			System.out.println("up");
//		}
//		
//		if (input == ran) {
//			break;
//			
//		}
//		
//		}
		
		//엥 ㅠㅠ count 0아니고 1이래.
		//1회부터 count시작하니까.
		
		Scanner sc = new Scanner(System.in);
		
		int count = 1;
		
		while(true) {
			System.out.print(count + "번 입력 :");
			int input = sc.nextInt();
			
			if(ran ==input) {
				
				System.out.printf("정답입니다! (총 입력횟수 :%d회)", count);
				break;
			
			} else if (ran > input) {
			System.out.println("up");
				
			} else {
			System.out.println("Down");
				
			}
			
			
			count++;
			
		}
	
		
		
		
		
	}

	public void rpsGame() {
		
		 // 가위 바위 보 게임
		   
		   // 몇판? : 3
		   
		   // 1번째 게임
		   // 가위/바위/보 중 하나를 입력 해주세요 :  가위
		   // 컴퓨터는 [보]를 선택했습니다.
		   // 플레이어 승!
		   // 현재 기록 : 1승 0무 0패
		   
		   // 2번째 게임
		   // 가위/바위/보 중 하나를 입력 해주세요 :  보
		   // 컴퓨터는 [보]를 선택했습니다.
		   // 비겼습니다.
		   // 현재 기록 : 1승 1무 0패
		   
		   // 3번째 게임
		   // 가위/바위/보 중 하나를 입력 해주세요 :  가위
		   // 컴퓨터는 [바위]를 선택했습니다.
		   // 졌습니다ㅠㅠ
		   // 현재 기록 : 1승 1무 1패
		
		
		//가위바위보 난수만들자
		//(int)(Math.random() * 3) -> 결과가 0,1,2로 나옴. 
//		0 -> 가위
//		1 -> 바위
//		2 -> 보
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 판? :");
		int round =sc.nextInt();
		int win = 0;
		int draw = 0;
		int lose = 0;
	
		
		for(int x=1 ;x<=round ; x++) {
			
			System.out.println("\n"+ x + "번째 게임");
			System.out.println("가위/바위/보 중 하나를 입력 해주세요 :");
			String player = sc.next(); // 사용자의 입력을 받는다.
			
			//컴퓨터 가위/바위/보를 지정하는 것.
			int ran = (int)(Math.random() * 3); //0,1,2
			String com = null; // String의 기본값 (없다 비슷한 거라고 생각하자)
			//String s1 = null;	//참조하고 있는 게 없다.
			//String s2 = ""; 	//비어있는 문자열
			
			
			switch(ran) {
				case 0	: com = "가위"; break;
				case 1	: com = "바위"; break;
				case 2	: com = "보" ; break;
			}//default는 생략 가능함.
			System.out.printf("컴퓨터는 [%s]를 선택했습니다. \n", com);
			
			//사용자와 컴퓨터 가위,바위,보 승패 판별
			//비교 연산은 기본 자료형끼리만 가능. String은 안 됨.
			//String 비교시 equals() 사용
			
			
			if (player.equals(com) ) {
				
				System.out.println("비겼습니다");
				draw++;
			} else {
				
				//사용자 - 컴퓨터
				//가위     보
				//바위     가위
				// 보     가위
				
				
				
				
				//사용자가 이기는 경우에 true가 되는 상황을 미리 변수로 선언
				boolean win1 = player.equals("가위") && com.equals("보")	;			
				boolean win2 = player.equals("바위") && com.equals("가위")	;			
				boolean win3 = player.equals("보") && com.equals("바위")	;			
						
				if(win1 || win2|| win3) {
					System.out.println("이겼습니다");
					win++;
				}else {
					System.out.println("졌습니다");
					lose++;
				}
			
				}
//			//else if (ran >= rps) {
//				System.out.println("졌습니다.");
//				count3++;
//				
//			} else {
//				System.out.println("이겼습니다.");
//				count1++;
//				
//			}
//			
			System.out.printf("현재 기록 : %d승 %d무 %d패\n", win,draw,lose);
			
		}
		
		
		
		
	}
	
	
	
	
	
	
}
