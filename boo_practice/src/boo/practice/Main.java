package boo.practice;

import java.util.Scanner;

public class Main {

	private Scanner sc = new Scanner(System.in);
	
		
		
		
	public void ex1() {
		System.out.print("정수 입력" );
		int n = sc.nextInt();
		for(int i = 0 ; i < n ;i++) {
			
			int num = (int)(Math.random() * 2000001)-1000000;
			System.out.print(num+" ");
			
			
		}
	
	}
	
	public void ex2() {
		
		int[] arr = new int[9];
		
		int max = 0;
		int num = 0;
		for(int i = 0 ; i < 9 ; i++) {
			
			arr[i] = sc.nextInt();
			
			if ( arr[i] > max ) {
				max = arr[i];
				num = i;
			}
		
		}
		
		System.out.println(max);
		System.out.println(num);
		
		
	}
}
