package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {

	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		
		int input = sc.nextInt();
		
		if(input>=1) {
			for ( int x = 1 ; x <= input; x++ ) {
				
				System.out.print(x + " ");
			}
			
		} else {
			System.out.print("1 이상의 숫자를 입력해주세요. ");
			
		}
		
	
		
		
		
		
	}
	
	public void practice2() {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		
		int input = sc.nextInt();
		
		if(input>=1) {
			for ( int x = input ; x >= 1 ; x-- ) {
				
				System.out.print(x + " ");
			}
			
		} else {
			System.out.print("1 이상의 숫자를 입력해주세요. ");
			
		}
		
			
	}
	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		
		int input = sc.nextInt();
		int sum = 0;
		
		
		
		for ( int x = 1  ; x<= (input-1)  ; x++ ) {
			
			
			System.out.print(x + "+");
			sum = sum + x;
			
		}
		
		System.out.println(sum);
		
		//보류
		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 >=1 && num2 >=1) {
		
		if (num2>num1) {
			for (int x = num1 ; x <= num2 ; x++) { 
				System.out.print(x + " ");
				
				}
			} else {
			for (int x = num2 ; x <= num1 ; x++) {
				
				
			System.out.print(x + " ");
			
				}
		
		
			}
		} else {
			System.out.print("1 이상의 숫자를 입력해주세요");
	}
		
		//쌤: 안 된다는 것부터 먼저 해라.
		//  if(num1, num2 중에 1미만이 있는가? (num1<1 || num2 <1) -> 1이상의 숫자를 입력해주세요
		// else(둘다 1미만이 아닐 경우) -> for문 쓰기.
		// 	나머지는 내가 푼 것과 같음
		
		//다른 풀이법 1 (for문 1번만 쓰는법)
		int start = num1;
		int end = num2;
		
		if(num1 >num2) { //처음에는 임의로 변수선언했다가 먼저 입력한 숫자가 크면 다르게 하는 거지.
			
			start = num2;
			end= num1;
			
		}
		
		for(int i = start ; i <= end ; i++) {
			System.out.print(i + " ");
			
			
			
		}
		
		
		//다른 풀이법 2
		//  8      4입력했다면,
		if(num1 > num2) {
			
			//[두 변수의 값 교환]이라는 방법 : 많이 사용하는 방법임.
			int temp = num1; // temp : 8 . num1 :8 , num2 : 4 (오른쪽의 값을 왼쪽에 대입한다)
			
			num1 = num2; // temp : 8 . num1 :4 , num2 : 4 
			
			num2 = temp; // temp : 8 . num1 :4 , num2 : 8
			
		}
		
	}
	
	
	
	
	
	
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 :");
		int num = sc.nextInt();
		
		for( int x = 1  ; x <= 9 ; x++ ) {
			
		 System.out.printf("%d * %d = %d\n" ,num,x,num*x );
			
		}
	}
	
	
	public void practice6() {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 :");
		int num = sc.nextInt();
		
		if(num>=10 || num<2) {
			System.out.println("2~9사이 숫자만 입력해주세요.");
			
		} else {
			
			for( int x = num ; x <= 9 ; x++) {
				
				
				System.out.println("===="+x+"단====");
				
				for ( int i = 1; i <= 9 ; i++ ) {
					System.out.printf("%d x %d = %d\n" ,x,i,x*i );
					
					
					}
				
				
				System.out.println();
				}
			
			
			}
		
		}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 :");
		int num = sc.nextInt();
		
			for(int row = 1 ; row <= num ; row++) {
			

				for(int col = 1 ; col <= row ;col++) {
				
				System.out.print("*");
				
				}
			
			System.out.println();
			
			}
		
		
		
		
		}
	
	public void practice8() {
				
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 :");
		int num = sc.nextInt();
		
		for(int row = num ; row >=1 ; row--) {
			
			
			for(int col = row ; col >= 1 ; col--) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	
	//4321
	//4321
	//4321
	//4321 이렇게 나옴.... 흠...
		//int col = num이라고 안하고 col= row라고 했더니 됨!!!! 
	
	
		}

	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 :");
		int input = sc.nextInt();
		
		for (int row = 1 ; row <= input ; row++) {
			
			
			//방법1-1 for(int i = input - row ; i >=1; i--){
//		}
			//방법1-2
//			for(int i = input - 1 ; i>= row ; i--) {
				
//					input = 321
//						  	21
//							1
				
//				System.out.print(" ");
//			}
//		그다음 for (int col = 1 ; col <= row ; col++){
//		 system.out.print("*"); 
//			} 코드.
			
			
			for( int col = 1 ; col <= input ; col++) {
				//col <= row 에서 input으로 바뀐건가
				if( col <= input - row ) {
					
					System.out.print(" ");
					
					
				} else {
					
					System.out.print("*");
				}
				
				
				
			}
			System.out.println();
		}
	
		
		
	}		
		
		
	
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 :");
		int input = sc.nextInt();
		
		// 위쪽 삼각형
		
		for( int row = 1 ; row <= input; row++) {
			
			for ( int col = 1; col <= row ; col++) {
				
				System.out.print("*");
			}
			System.out.println(); //줄바꿈
		}
	
		//아래쪽 삼각형
		for( int row = input -1 ; row >= 1; row--) { //위에꺼 정반대인데 하나만 줄이기(input-1)
		
		for ( int col = 1; col <= row ; col++) {
			
			System.out.print("*");
		}
		System.out.println(); //줄바꿈
		
	}
	
	//두번째 방법
		
//	3을 입력했다고 하면 5
//  5를 입력했다고 하면 7
// n을 입력했다고 하면 2n-1이 출력되어야해
		
		for(int row = 1 ; row <= input*2-1;  row++) {
			
			if(row < input) {
				
				for(int col=1; col <= row ; col++) {
					System.out.print("*");
				}
				
			} else {
				for(int col = input; col > row - input; col--) {
					
				}
				
				System.out.println(); //줄바꿈
			}
			
			
			
			
		}
		
		
		
	}
	
	
	
	
	
	
	public void practice11() { //9번의 응용문제 - 9번처럼 밀어넣고 옆으로 더 출력하기.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 :");
		int input = sc.nextInt();
		
		for (int row = 1 ; row <= input ; row++) {
			
			
			//방법1-1 for(int i = input - row ; i >=1; i--){
		
			//방법1-2
			for(int i = input - 1 ; i>= row ; i--) {
			
//					input = 321
//						  	21
//							1
			
				System.out.print(" ");
			}
			for (int col = 1 ; col <= row *2 -1 ; col++) {
				System.out.print("*"); 
			}
			
		
		}	
	}	
			
			
//			for( int col = 1 ; col <= input ; col++) {
//				//col <= row 에서 input으로 바뀐건가
//				if( col <= input - row ) {
//					
//					System.out.print(" ");
//					
//					
//				} else {
//					
//					System.out.print("*");
//				}
//				
//				
//				
//			}
//			System.out.println();
//		}
//		
//		
//		
//		
//	}
//	
	
	
	
	public void practice12() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 :");
		int input = sc.nextInt();
		//입력(5개)출력하게 한 다음에 IF문 넣기
		
		for(int row = 1 ; row <= input ; row++) {
			
			for(int col = 1 ; col<= input ; col++) {
				
				//첫 번째 / 마지막 줄, 칸일 때만 *을 출력하겠다는 if문
//				if(row ==1 || row == input || col ==1 || col ==input) {
//					System.out.print("*");
//					
//				}else {
//					System.out.print(" ");
//					
//				}
				
				
				System.out.println(); //줄바꿈
			}
			
		}
		
		//언제 공백을 출력할까보다 언제 별을 출력할까가 더 쉽다.
		// 첫번째줄, 마지막줄, 첫번째칸, 마지막칸에만 별을 출력하자
		
		
		
	}
	
	
	
	
	public void practice13() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 하나를 입력하세요 :");
		int input = sc.nextInt();
		int count = 0;
		
		
		for(int i = 1 ; i <= input ; i++) {
			
			//2의 배수 또는 3의 배수인 경우 출력
			
			if(i%2 == 0 || i %3 ==0 ) {
				System.out.print(i + " ");
				
				//2와 3의 공배수 == 2로도 나누어 떨어지고 3으로도 나누어 떨어진다.
				//앞서 썼던 if문 재활용
				
				if(i%2 == 0 && i %3 ==0 ) {
					
					
					count++;  //count 증가
				}
				
				
			}
		}
		
		System.out.println("\ncount :" + count);
	}
	
}


