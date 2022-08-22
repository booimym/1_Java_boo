package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice1 {

	
	public void practice1(){
	
		int[] arr = new int[9];
		int num = 0;
		int sum = 0;

		for(int i=0; i<arr.length ; i++) {

			arr[i] = num++ ; //arr[i] = i +1 ;
			//궁금한 것 : num++이면 012345678으로 나와야 되는 것 아님?

			if(i%2 == 0) { //0을 2로 나누면 나머지 0임.- 짝수로 취급 중...
				sum += num ;
			}

			System.out.print(num);
		}

		System.out.printf("\\n짝수 번째 인덱스 합: %d",sum);


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

		System.out.printf("\\n홀수 번째 인덱스 합: %d",sum);
	
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
		System.out.print("\\n검색할 값 :");
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
			System.out.print("\\n인덱스 :" + arr[0] );
		} else if (input == arr[1]) {
			System.out.print("\\n인덱스 :" + arr[1]);
		}else if (input == arr[2]) {
			System.out.print("\\n인덱스 :" + arr[2]);
		}else if (input == arr[3]) {
			System.out.print("\\n인덱스 :" + arr[3]);
		}else if (input == arr[4]) {
			System.out.print("\\n인덱스 :" + arr[4]);
		}else {
			System.out.print("\\n일치하는 값이 존재하지 않습니다.");
		}



	}

//	Scanner sc = new Scanner([System.in](http://system.in/));
//	System.out.print("문자열 :");
//	String str = sc.nextLine(); //왜 nextLine일까? 띄어쓰기도 안했는데?
//								//next라고 하면 오류 뜬다.
//
//	char[] arr = new char[str.length()];
//	
//	for(int i = 0; i <arr.length;i++) {
//		arr[i] = str.charAt(i);
//	
//	
//	}
//
//
//	System.out.print("문자 :");
//
//	
//	char ch = sc.nextLine().charAt(0);
//	
//	System.out.print(str+"에"+ch+"가 존재하는 위치(인덱스) : " );
//	int count = 0;
//	for(int i=0;i<arr.length;i++) {
//		
//		if(arr[i] == ch) {
//			
//			System.out.print(i);
//			
//			count++;
//		}
//	}
//	System.out.println();
//	
//	System.out.print(ch+"개수 : ");
//	
//	System.out.println(count);
	
	public void practice5() {

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.next();
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);

		char[] arr = new char[str.length()];
		int count = 0;

		System.out.print(str + "에 " + ch + "가 존재하는 위치 :");
		for(int i=0;i<arr.length;i++) {

			if (ch == str.charAt(i)) {

				System.out.print(i+" ");
				count++;
			}


		}

		System.out.println("\\ni 개수 :" + count);


		}
	
	public void practice6() {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 :" );

		int[] arr = new int[sc.nextInt()];
		int sum = 0;
		for(int i = 0 ; i <arr.length ; i++) {
			System.out.print("배열"+i+"번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.printf("총합 : %d",sum);

	}
	
	
	public void practice7() {

		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) :");
		String str = sc.next();
		char[] arr = new char[str.length()];
		for(int i=0;i<arr.length;i++) {
			arr[i] = str.charAt(i);

			if(i<=7) {
				System.out.print(str.charAt(i));
		} else {
			System.out.print("*");
		}
		}


	}

	
	
	public void practice8() { //모름

		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");


		if((sc.nextInt()<3) && (sc.nextInt()%2 ==0)) {

			System.out.println("다시 입력하세요");


		} else {
			int[] arr = new int[sc.nextInt()];

			for(int i=0 ; i < arr.length ; i++)
				if (i<=(sc.nextInt()/2 + 1)) {



					System.out.println(i+",");
				} else {

				}
		}


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
		int[] arr = new int[10];
		System.out.print("발생한 난수:");
		int i = 0;
		int ran1 = (int)(Math.random()*10+1);
		arr[0] = ran1;
		int max = arr[0];
		int min = arr[0];
		for( i = 1; i<arr.length; i++) {
			int ran2 = (int)(Math.random()*10+1);
			arr[i]=ran2;
			
			
			if(arr[i]>max) {
				max = arr[i];
			}
			
			if(arr[i]<min) {
				min = arr[i];
			}
			System.out.print(arr[i] + " ");
			
			
		}
		System.out.println("\n최대값 :" + max);
		System.out.println("최소값 :" + min);
		
//		엥 왜 0000나옴? --
//		오류 해결 - (1)ramdom 쓸 때, () 붙이고
//				(2) ran을 반복문 안에 넣어줘야지 매번 반복할 때마다 다른 random숫자가 나올 수 있다.
//		
//		오류 : 최대값,최소값이 기준을 arr[0]으로 지정해놔가지고 바뀌는 것 같길래 i로 바꿔줬더니 i+1을 몰라서 오류 생기는 듯
//		max로 바꾸면 될듯!!!!!!!!! 대박 해결한듯
//		
//		아 드뎌됨 ㅡㅡ
	}
	
	public void practice13() {

//		Scanner sc= new Scanner([System.in](http://system.in/));
//		System.out.print("문자열 :");
//		String str = sc.next();
//		char[] arr = new char[str.length()];
//		for(int i = 0 ; i < arr.length ; i++) {
//			
//			for(int x = 0; x>i ;x++) {
//				
//			}
//			
//			arr[i] = str.charAt(i);
//			
//			
//			System.out.print(arr[i]);
//		}
//
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


		int[][] arr = new int[3][3];

		for(int row = 0; row <arr.length; row++) {


			for(int col = 0;col <arr[row].length;col++) {



				System.out.print("("+row+","+col+")");

				}

			System.out.println();
			}


		}
	
	public void practice16() {

		int[][] arr = new int[4][4];


		int count = 0;

		for(int row = 0 ; row < arr.length ; row++) {

			for(int col = 0 ; col < arr[row].length ; col++) {

				count++;
				arr[row][col] = count;
				System.out.printf("%4d",arr[row][col]);
			}

			System.out.println();

		}



	}
	
	public void practice17(){

		int[][] arr = new int[4][4];


		int count = 17;

		for(int row = 0 ; row < arr.length ; row++) {

			for(int col = 0 ; col < arr[row].length ; col++) {

				count--;
				arr[row][col] = count;
				System.out.printf("%4d",arr[row][col]);
			}

			System.out.println();

		}

		}

	public void practice18() {

		int[][] arr = new int[4][4];

		for(int row = 0; row< arr.length-1 ; row++) {

			for(int col = 0; col<arr[row].length-1; col++) {

				int ran = (int)(Math.random()*10+1);
				arr[row][col] = ran;
				System.out.printf("%3d",arr[row][col]);

			}
			System.out.println();
		}




	}

	public void practice19() { //char로 했는데 왜 int형인 arr와는 정의가 안 ㅈ맞다고 에러 안뜸?


		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.print("행 크기 :");
		int row =sc.nextInt();
		System.out.print("열 크기 :");
		int col =sc.nextInt();
		if(row<=10 && row>=1 && col<=10 && col>=1) {


		int[][] arr = new int[row][col];



		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				char ran = (char)((Math.random()*26)+65);
				arr[i][j]= ran;
				System.out.printf("%5c",arr[i][j]);
			}
			System.out.println();
		}



		break;
		}
		System.out.println("반드시 1~10사이의 정수를 입력해야 합니다.");

		}
	}

		public void practice20() {

			Scanner sc = new Scanner(System.in);
			System.out.print("행의 크기 :");
			int row = sc.nextInt();
			int[][] arr = new int[row][];
			for(int i = 0 ; i < row ;i++ ) {

				System.out.print(i + "열의 크기 : " );
				int col = sc.nextInt();
				arr[i] = new int[col];

			}

			int count = 97;
			for(int j = 0; j < arr.length ; j++) {

				for (int x = 0; x <arr[j].length; x++) {

					arr[j][x] = count++;
					System.out.printf("%2c",(char)arr[j][x]);
				}
				System.out.println();
			}




		}

		public void practice21() {

			String[] students = {"강건강","남나나","도대담","류라라","문미미",
					"박보배","송성실","윤예의","진재주","차천축","피풍표","홍하하"};

			String[][] str1 = new String[3][2];
			String[][] str2 = new String[3][2];
			
			int i = 0;
			System.out.println("==1분단==");
			for(int row1 = 0 ; row1<str1.length;row1++) {

				for(int col1 = 0 ; col1 < str1[row1].length ; col1++) {

					System.out.print( students[i]+ " ");
					i++;
				}

				System.out.println();
			}

			System.out.println("==2분단==");
			for(int row2 = 0 ; row2<str2.length;row2++) {

				for(int col2 = 0 ; col2 < str2[row2].length ; col2++) {

					System.out.print( students[i]+ " ");
					i++;
				}

				System.out.println();
			}




			}
		
		public void practice22() {

			String[] students = {"강건강","남나나","도대담","류라라","문미미",
					"박보배","송성실","윤예의","진재주","차천축","피풍표","홍하하"};

			String[][] str1 = new String[3][2];
			String[][] str2 = new String[3][2];



			int i = 0;
			int row = 0;
			int col = 0;
			System.out.println("==1분단==");
			for(row = 0 ; row<str1.length;row++) {

				for(col = 0 ; col < str1[row].length ; col++) {

					str1[row][col]=students[i];
					System.out.print( students[i]+ " ");
					i++;
				}

				System.out.println();
			}

			System.out.println("==2분단==");
			for(row = 0 ; row<str2.length;row++) {

				for(col = 0 ; col < str2[row].length ; col++) {
					str2[row][col]=students[i];
					System.out.print( students[i]+ " ");
					i++;
				}

				System.out.println();
			}

			Scanner sc = new Scanner(System.in);
			System.out.print("검색하실 학생 이름을 입력하세요 :");
			String name = sc.next();

			for( row = 0 ; row<str1.length;row++) {

				for(col = 0 ; col < str1[row].length ; col++) {

					if(str1[row][col].equals(name))  {

						if(col%2 == 0) {
						System.out.println("검색하신 " + name+" 학생은 1분단 "+ (row+1)+"번째 줄 왼쪽에 있습니다");
						} else {
						System.out.println("검색하신 "  + name+" 학생은 1분단 "+ (row+1)+"번째 줄 오른쪽에 있습니다");

						}
					} else if (str2[row][col].equals(name)){
						if(col%2 == 0) {
						System.out.println("검색하신 " + name+" 학생은 2분단 "+ (row+1)+"번째 줄 왼쪽에 있습니다");
						} else {
						System.out.println("검색하신 " + name+" 학생은 2분단 "+ (row+1)+"번째 줄 오른쪽에 있습니다");

						}

					} else {


					}

				}


			}




		}

		public void practice23() {

			Scanner sc = new Scanner(System.in);
			System.out.print("행 인덱스 입력 :");
			int hang = sc.nextInt();
			System.out.print("열 인덱스 입력 :");
			int yol = sc.nextInt();

			int[][] arr = new int [6][6];


			for(int row = 0; row<arr.length;row++) {
				 for (int col = 0; col<arr[row].length; col++) {
					 if (row == 0 && col!= 0) {

						 System.out.print(col-1);

					 }else {
						 System.out.print(" ");
					 }

					 if(col== 0 && row!=0 ) {

						 System.out.print(row-1);
					 } else {
						 System.out.print(" ");
					 }

					 if(row == hang+1 && col == yol) {

						 System.out.print("x");
					 }

				 }
				 System.out.println();
			}

		}

}
