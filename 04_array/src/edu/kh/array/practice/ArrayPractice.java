package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	
	
	public void practice1(){
		
	int[] arr = new int[9];
	int num = 0;
	int sum = 0;
	
	for(int i=0; i<arr.length ; i++) {
		
		arr[i] = num++ ; //arr[i] = i +1 ;
		
		if(i%2 == 0) { //0을 2로 나누면 나머지 0임.- 짝수로 취급 중...
			sum += num ;
		}
		
		System.out.print(num);
	}
		
	System.out.printf("\n짝수 번째 인덱스 합: %d",sum);
		
	
	// 0번째 인덱스는 짝수로 취급한다는데, 딱히 조건에 넣지도 않았는데 왜 결과 잘 나옴?
	}
	
	public void practice2() {
		
		int[] arr = new int[9];
		int num = 10;
		int sum = 0;
		
		for(int i=0 ; i<arr.length;i++) {
			arr[i] = num--; //arr[i] = 9-i;
			if(i%2==1) {
				sum += num;	
			}
			System.out.printf("%2d",num);
			
		}
		
		System.out.printf("\n홀수 번째 인덱스 합: %d",sum);
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		int num = 0;
		
		
		for(int i=0 ; i<arr.length ; i++) {
			
			arr[i] = num++;
			System.out.printf("%2d",num);
			
			
		}
		
		
	}
	
	public void practice4() {
		
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0 ; i<5 ; i++) {
		System.out.print("입력 " + i + ":");
		arr[i] =  sc.nextInt();
		}
		System.out.print("\n검색할 값 :");
		int input = sc.nextInt();
		
//		switch(input){
//		case arr[0]	: System.out.print("\n인덱스 :" + arr[0] ); ;break;
//		case arr[1]	: System.out.print("\n인덱스 :" + arr[1] ); ;break;
//		case arr[2]	: System.out.print("\n인덱스 :" + arr[2] ); ;break;
//		case arr[3]	: System.out.print("\n인덱스 :" + arr[3] ); ;break;
//		case arr[4]	: System.out.print("\n인덱스 :" + arr[4] ); ;break;
//		default : System.out.print("\n일치하는 값이 존재하지 않습니다."); break;
//		
//		}
		
		//switch쓰려면 어떻게 해야돼??
		
		if (input == arr[0]) {
			System.out.print("\n인덱스 :" + arr[0] );
		} else if (input == arr[1]) {
			System.out.print("\n인덱스 :" + arr[1]);
		}else if (input == arr[2]) {
			System.out.print("\n인덱스 :" + arr[2]);
		}else if (input == arr[3]) {
			System.out.print("\n인덱스 :" + arr[3]);	
		}else if (input == arr[4]) {
			System.out.print("\n인덱스 :" + arr[4]);
		}else {
			System.out.print("\n일치하는 값이 존재하지 않습니다.");
		}
		
		
		
	}
	
//	public void practice5() {
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("문자열 :");
//		String str = sc.next();
//		System.out.print("문자 :");
//		String str1 =sc.next();
//		
//		char ch = sc.next().charAt(input);
//		
//		
//		//문자를 얻어와야하는데, 
//		
//		
//	
	
	
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 :" );
		int input = sc.nextInt();
		int[] arr = new int[input];
		int sum = 0;
		for(int i = 0 ; i <arr.length ; i++) {
			System.out.print("배열"+i+"번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += i;
		}
		System.out.println(Arrays.toString(arr));
		System.out.printf("총합 : %d",sum);
		
	}
	
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) :");
		
	}
	
	
	public void practice8() { //모름
		
//		Scanner sc = new Scanner(System.in);
//		int input =sc.nextInt();
//		if((input<3) && (input%2 ==0)) {
//			
//			System.out.println("다시 입력하세요");
//			
//			
//		} else {
//			
//			int[] arr = new int[input];
//			
//			if(arr[num] <= ((input-1)/2)) {
//				
//				for(int i = 1 ; i<=(2*input-1) ;i++) {
//					
//				}
//			} else {
//				
//				for(int x =2*(input-1); x>=1 ;x--) {
//					
//				}
//			} 
//		}
	}
	
	
	public void practice9() {
		
		int[] arr = new int[10];
		System.out.print("발생한 난수 :");
		for(int i =0 ; i < arr.length; i++) {
		int ran =(int)(Math.random()*11);
		System.out.printf("%3d",ran);
		}
		
		
	}
	
	public void practice10() {
		
		//최대값, 최소값
		
		
		
	}
	
	
	public void practice14() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 :");
		int input = sc.nextInt();
		String[] str = new String[input];
		sc.nextLine();
		
		System.out.print("1번째 문자열 :");
		str[0]=sc.nextLine();
		
		System.out.print("2번째 문자열 :");
		str[1]=sc.next();
		
		System.out.print("3번째 문자열 :");
		str[2]=sc.next();
		
		//뭐 개행어쩌고 이랬던 거 같은데 어디서 배웟더라...
		
		System.out.println(); //주소 나오게 하는 거말고 나열이 뭐였지 arrays이랬던거같은데
		
	}
	
	public void practice15() {
		
		
		int[] arr = new int[4][4];
		
		for(int row = 0; row <= 4; row++) {
			
			for(int col = 0;col <=4;col++) {
				
				
			}
		}
		
		
		
		
		
		
	}
	
	
	
}
