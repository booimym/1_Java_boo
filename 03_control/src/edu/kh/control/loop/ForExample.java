package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {

	
	/*for문
	 * - 끝이 정해져 있는 경우 사용하는 반복문
	 * 		(==반복 횟수가 지정되어 있는 경우)
	 * 
	 * [작성법]
	 * 
	 * for(초기식,조건식,증감식){
	 *   조건식이 true일 때 반복 수행할 코드
	 * }
	 * 
	 * 초기식 : for문을 제어하는 용도의 변수 선언

		조건식 : for문의 반복 여부를 지정하는 식
		    조건식이 true인 경우에 반복을 수행함
		    보통 초기식에 사용된 변수를 이용해서 조건식을 작성함.
		
		증감식 : for문이 끝날 때 마다 특정 값을 변화 시키는 식
		    보통 초기식에 사용된 변수를 증가/감소 시켜
		    조건식의 결과를 변화게 만듦.
	 * 
	 * 
	 * 
	 */
	
	
	public void ex1() {
		
		//for문 기초 사용법
		//1~10까지 반복 출력
		
		for(int i = 1 ; i <= 10 ; i++) {
			//초기식 ; 조건식 ; 증감식 
			System.out.println(i + "출력");
		}
		
	}	
	
	public void ex2() {
	
		//for 기초 사용법 2
		
		//5부터 12까지 1씩 증가하면서 출력하는 코드 만들기
		
		for(int i = 5 ; i <= 12 ; i++ ) {
			
			System.out.println(i + "출력");
						
		}
		
		System.out.println("===============================================================");
		
		// 1부터 100까지의 모든 정수의 합을 구하는 코드 만들기.
		
		int sum = 0; //합계의 저장용 변수를 만들자.
		// 왜 0으로 초기화 하는가?
		// 0이라는 값은 더하거나 뺄 때 아무런 영향이 없어서
		// 누적이 필요한 상황에서 기준점으로 사용하기 적합하다.
		
		
		for(int i = 1 ; i <= 100 ; i++) {
			
			// i 값이 1~100까지 1씩 증가
			// 이 i 값을 sum 변수에 계속 누적
			
			 sum += i ; // sum = sum + i;
			
			
		}
		
		System.out.println( "1~100의 합" + sum );
		
		
	}
	
	
	public void ex3() {
		
		//for 기초 사용법 3
		
		//두 정수를 입력 받아
		// 두 정수 사이의 모든 정수의 합을 출력해보자
		//(의미 : num1 ~num2까지의 모든 정수의 합)
		// 단, 첫 번째 입력이 두 번째 입력보다 작아야 한다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 입력 :");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 :");
		int num2 = sc.nextInt();
		
		int sum = 0; //sum은 합계 저장용 변수
		
		for(int i = num1 ; i <= num2 ;  i++) { 
			
			sum +=  i;
			
			
		}
	
		System.out.printf("%d부터 %d까지의 합 : %d \n", num1, num2, sum);
		
	}
	
	
	public void ex4() {
		
		//for 기초 사용법 4 : 1씩만 증가할 수 있는 게 아니다.
		
		// 1부터 100까지 3씩 증가하는 숫자를 출력 (옆으로)
		
		//결과: 1 4 7 10 13... 
		
		
		for(int i = 1 ; i <= 100 ; i += 3 ) { //i를 3씩 증가시켜야돼
			
			// i를 1씩 증가 == i++ == i = i + 1 이니까
			// i를 3씩 증가 == i = i + 3 == i += 3
			
			System.out.println( i + " " );
		
		
		}
		
		
		
		
		System.out.println("\n-------------------------");
		
		//10부터 20까지 0.5씩 증가
		
		//무한루프나는 이유
		//10 + 0.5 = 자동형변환되어서 10.0 +0.5 = 10.5(double)인데
		//(int)10.5 ->10으로 강제형변환됨
		
		for(double i = 10 ; i <= 20 ; i += 0.5) {
			
			System.out.print(i + " ");
			
		}
		
	
	}
	
public void ex5() {
		
		//for 응용
		//for문 + char + 자동/강제형변환 응용
		
		// A~ Z까지 출력
		
		
//		for( int i = 'A' ; i <= 'Z';i++) {
//			
//			//int > char라서 자동형변환 'A'는 65가 된다. i = 65임
//			
//			
//			System.out.println( (char)  i ); //65를 문자로 강제 형변환.
			
		
	for(char i = 'A' ; i <= 'Z' ; i++ ) { 
		
		
		//
		
		
			System.out.println(i);
		}
		
		
	}
	
	
	
	public void ex6() { //for문 응용
		
		//10부터 1까지 1씩 감소하면서 출력
		
		
		for(int i = 10 ; i>=1 ; i-- ) {
			
		System.out.println(i);	
			
		}
		
		
	}
	
	
	public void ex7() { //[응용]
		
		//입력, sum, for 응용
		
		//정수 5개를 입력 받아서 합계 구하기
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		
		for(int i = 1 ; i <=5 ; i++) {
			System.out.print("입력 "+ i +" :" );
			sum += sc.nextInt();
			//입력 버퍼에서 다음 정수를 얻어와서 (sc.nextInt();)
			//sum변수에 누적
			
		}
		
		System.out.println("합계 :" + sum );

		
	}
	
	public void ex8() { //응용
		
	      // 정수를 몇 번 입력 받을지 먼저 입력 받고
	      // 입력된 정수의 합계를 출력
	      
	      // ex)
	      // 입력 받을 정수의 개수 : 3
	      // 입력 1 : 10
	      // 입력 2 : 20
	      // 입력 3 : 30
	      // 합계 : 60
	      
	      // ex)
	      // 입력 받을 정수의 개수 : 2
	      // 입력 1 : 10
	      // 입력 2 : 20
	      // 합계 : 30
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.print("입력 받을 정수의 개수 : ");
		int num = sc.nextInt();
		
	
		
		
		for(int i = 1 ; i <=num ; i++) {
			
			System.out.print("입력"+ i + " : ");
			sum += sc.nextInt();
			
			
		}
		
		System.out.println("합계 :" + sum );
	}
	
	public void ex9() { // [ 기초 ] 
		
		//for문, %(나머지), if-else 이용
		
		// 1부터 20까지 1씩 증가하며 출력하면서
		// 단, 5의 배수에는 ()를 붙여서 출력
		
		for(int i = 1 ;i<=20 ;i++ ) {
			
		if (i%5 == 0) {
			System.out.print( "("+i+")" + " " );
			
		} else {
			
			System.out.print( i + " ");
		}
		}
		
		
	}
	
	public void ex10() { // [응용]
		
		//for, if, Scanner, 논리연산자, print 메서드
		// 구구단 출력~

		//2에서 9 사이 수를 하나 입력 받아 
		//해당하는 수의 단을 출력
		// 단, 입력 받은 수가 2에서 9사이가 아니라면,
		// "잘못 입력하셨습니다." 를 출력해보기.
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단(2~9) 입력 : ");
		int dan = sc.nextInt();
		
		if (dan>9 || dan<2) {
			
			System.out.println("잘못 입력하셨습니다.");
			
		} else{
			
			//2 * 1 = 2
			//2 * 2 = 4
			
			
			
			
			for (int i = 1; i <= 9 ; i++) {
				
				
				System.out.printf("%d x %d = %d \n" , dan , i , dan * i );
		
			}
			
			System.out.println("======================================");
			
			for (int i = 9; i >= 1 ; i--) {
				
				
				System.out.printf("%d x %d = %d \n" , dan , i , dan * i );
				
			}
			
		}
		
		
	}
	
	//---------------------------------------------------------------------
	//중첩 반복문
	//---------------------------------------------------------------------
	
	public void ex11() {


//	12345
//	12345
//	12345
//	12345
		
	for (int x = 1 ; x <=4 ; x++ ) { //4번반복
		
		
		for (int i = 1 ; i <= 5 ; i++) {
			
			System.out.print(i);
			
		}
		
		
		System.out.println(); //()내용을 출력하고 줄바꿈하는 코드임. 그니까 걍 줄바꿈도 가능!
		
	}
		
	
	}
	
	
	public void ex12() { // [응용]
		
		//구구단 2단부터 9단까지 모두 출력
		
		//2X1=2 2x2=4 2x3=6
		//3X1=3 3x2=6
		//3x1=4
		//
		//
		//
		//
		//9x1=9
		
		for (int dan =2 ; dan<=9 ; dan++) {
			
			for ( int i = 1 ; i <= 9 ; i++) {
				
				System.out.printf("%dx%d=%2d " , dan, i, dan*i  );
				// %2d : 정수가 출력될 칸을 2칸 확보하고 오른쪽 정렬하여 출력.
				
				
			}
			
			System.out.println();
			
			
		}
		
		
	}
		
		public void ex13() {
			
//			1
//			12
//			123
//			1234
			
			for( int x = 1 ; x <=4 ; x++ ) {
				
				for (int i = 1 ; i <= x ; i++ ) {
					
					System.out.print(i);
				}
				
				System.out.println();
			}
		}
	
	
	public void ex14() {
		
		// 2중 for문을 이용하여 다음 모양을 출력하세요.	
		
//		4
//		43
//		432
//		4321
		
		for(int x = 4 ; x>= 1; x--) {
			
			for(int i = 4 ; i >= x ; i--) { //i를 4로 고정해놔서 
				System.out.print(i);
			}
			
			System.out.println();
			
		}
		
		System.out.println("------------------------");
		
		for(int x = 1; x<=4 ; x++) {
			
			for (int i = 4 ; i>= 5-x ; i--) {
				System.out.print(i);
				
				
				
			}
			System.out.println();
		}
		
		
	}
	
	
	public void ex15() {
		
		//2중 for문을 이용하여 다음 모양을 출력하세요
		
		//입력된 정수 : 4
		//4321
		//321
		//21
		//1
		
		//입력된 정수 : 5
		//54321
		//4321
		//321
		//21
		//1
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력된 정수 : ");
		int input = sc.nextInt();
		
//		for ( int x = input ; x >= 1 ; x-- ) { //input부터 1까지 --(54321) 이렇게 출력을 하게 만드는 구문
//												//5줄이 출력되게 만드는 구문
//			
//			for (int i = input ; i >= 1 ; i--) {//5줄이 출력되게 만드는 구문
//				
//				System.out.print(i);
//			}
//			
//			System.out.println();

		for ( int x = input ; x >= 1 ; x-- ) { //input부터 1까지 --(54321) 이렇게 출력을 하게 만드는 구문
												//5줄이 출력되게 만드는 구문
			
			for (int i = x ; i >= 1 ; i--) {//5줄이 출력되게 만드는 구문
				
				System.out.print(i);
			}
			
			System.out.println();

			
			
			}
		
		
		
		
	}	

	public void ex16() {
		//2중 for문을 이용하여 다음 모양을 출력하세요
		
		//*
		//**
		//***
		//****
		//*****
		
		for (int row = 1 ; row <=5  ; row++ ) {
			
			for(int col = 1 ; col <= row ; col++ ) { //col 첫번째 줄 1개, 2번째줄 2개, 3번째줄 3개,,,
				System.out.print("*");
				
				
			}
			
			System.out.println();
		}

		
		
		
		
	}
	
	
	
	public void ex17() {
		
		//합계 : sum
		//개수 : count
		
		// * count, %(나머지), for문을 이용한 검색
		
		
		//1부터 20 사이의 3의 배수의 개수를 출력해보기
		// sum :
		// count :
		
		int sum = 0;
		int count = 0; //수를 셀 때는 0부터 1씩 증가시키면서 세는 것이 보통임.
		
		
		
		for( int i = 1 ; i <= 20 ; i++ ) {
			
			if(i%3 == 0) {
				System.out.print(i);
				sum += i; //누적시킨다
				count++; // 1f조건이 true일 때마다 1 증가하는 코드
				
			}
			
		}
	
		System.out.println("\nsum : " + sum);
		System.out.println("count : " + count);
		
		
	}

	
	public void ex18() {
		
		// 2중 for문과 count를 이용해서 아래 모양 출력하기
		
//		1  2  3  4
//		5  6  7  8
//		9 10 11 12
		
		
		//3행 4열을 출력하는 for문을 먼저 만들기
		
		
		int count = 1 ;
		
		for(int row =1 ; row <=3 ; row++ ) {
			
			for(int col = 1; col <= 4 ; col++) {
				
				
				//System.out.printf("%3d",count);
				//count++;
				
				System.out.printf("%3d",count++); 
				
				//앞쪽에 count++가 배치되었다면, 머라구...?
				//어쨌든 출력한 후, 1씩 증가된거래
				
				
				//후의 증감 연산을 이용하여
				
				
				//출력 후 count 값을 1 증가시킨다.
				
				
				
			}
		
		System.out.println(); //줄바꿈
		
		
		}
		
		
	}
}


