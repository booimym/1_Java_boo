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
					System.out.printf("%d * %d = %d\n" ,x,i,x*i );
					
					
					}
				
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
		int num = sc.nextInt();
		
		
		for(int row = 1 ; row <= num ; row++) {
			for(int col = 1 ; col <= row ;col++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
		//별로 채우고 if로 공백?
		
	}
	
	
	
	
	}
