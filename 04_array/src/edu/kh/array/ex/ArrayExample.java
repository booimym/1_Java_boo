package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {

	
	/*
	 * 배열 ( 자료구조 )
	 * - 같은 자료형의 변수를 하나의 묶음으로 다루는 것.
	 * - 묶여진 변수들은 하나의 이름(배열명)으로 불러지고
	 *   각 변수들은 index를 이용하여 구분함.
	 * 
	 * 
	 * 
	 */
	
	
	
	 
	public void ex1() {
		
		//배열 맛보기
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		//배열 이용
		int [] arr = new int[4]; //[]: 배열기호
		//int형 변수 4개를 묶음으로 다룰 수 있는 배열을 생성하고, 이를 arr이라고 부름.
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		
		int sum2 = 0;
		for(int i = 0 ; i <4 ; i++) { //i = 0,1,2,3
			System.out.println(arr[i]);
			
			sum2 += arr[i];
			
		}
		
		System.out.println(sum2);
		
		
		
		int sum1 = num1 + num2 + num3 + num4;
		
		System.out.println("합계 : " + sum1);
				
		
	}
	
	public void ex2() {
		
		//int[]을 참조하는 변수 arr을 선언해보자
		int [] arr; //배열 시작 주소를 저장하는 변수임.(참조형임. 참조형은 4byte)
		
		arr = new int[4];
		//heap 영역에 int 4칸짜리 배열을 할당(생성)하고  -> new int[4];
		//할당된 배열의 시작주소를 arr에 대입 
		
		//배열 길이(크기) : 4
		
		System.out.println("배열 길이 :" + arr.length);
		//의미 : arr이 참조하고 있는 배열의 길이
		
		
		System.out.println("컴파일러가 정말로 0으로 다 초기화 해줬을까?");
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]); // 사실 확인
		

		//stack영역은 컴파일러가 알아서 초기화 안 해줌.
		//heap영역은 컴파일러가 알아서 초기화를 해줌.
//		int a;
//		System.out.println(a); a가 초기화가 되지 않아서 출력할 수 없다고 에러 뜸.
		
	
		System.out.println("========================");
		
		//배열 초기화
		
		// 1) 인덱스를 이용한 초기화
		arr[0] = 100; //arr라고 하는 int[] 참조형 변수가 참조하고 있는 배열의
					  // 0번 인덱스에 100을 대입.
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		
		// ** for문을 이용한 배열에 저장된 모든 값 출력 **
		
		//for(int i = 0 ;  i <= 3 ; i++) {
		//가 아니고..length이용하기
		
		for(int i = 0 ;  i < arr.length ; i++) {
			//i는 index를 뜻하는 거임. for문은 배열과 궁합이 잘 맞아.
			System.out.printf("arr[%d] = %d \n", i,arr[i]);

			
		}
		
		
		
		System.out.println("========================");
		
		//for문을 이용한 초기화
		// ->배열의 각 인덱스에 대입되는 값이 일정한 규칙성이 있을 경우 사용한다.
		
		// int 10개를 저장하는 배열의 각 요소에
		// 10,20,...10까지 대입을 하겠다.
		
		//1)배열만들기
		
		int[] arr2 = new int[10]; //선언 & 할당 & arr2에 대입 //index는 0~9
		
		//arr2[0]= 10; 이런식으로 쓰는게 인덱스를 이용한 초기화. 
		
		for(int i =0 ;i < arr2.length;i++) {
			arr2[i] = 10 * (i +1);
			System.out.printf("arrr2[%d] = %d \n",i,arr2[i]);
			
		}
		
		
		
	}

	
	public void ex3() {
		//2) for문을 이용한 초기화
		
		// 5명의 키(cm)를 입력 받고 평균을 구하자

	      // 1번 키 입력 : 170.5
	      // 2번 키 입력 : 165.7
	      // 3번 키 입력 : 184.3
	      // 4번 키 입력 : 190.2
	      // 5번 키 입력 : 174.4
	      
	      // 입력 받은 키 : 170.5  165.7  184.3  190.2  174.4
	      // 평균 : 177.02cm
		
		Scanner sc = new Scanner(System.in);
		
		double[] heightArr = new double[5]; //선언할 때, 배열이라는 것을 뜻하게 s를 붙인다든지 Arr를 붙인다든지 이런게 좋다.
		
		//규칙성 : 지속적으로 입력을 받는 거.
		
		for (int i = 0; i < heightArr.length ; i++) {
		//index는 정수니까 배열선언에 상관없이 int임.
		System.out.print( (i +1) + "번 키 입력 : ");
		//증가하는 거와 더하는 걸 구분하라? (강의)
		
		heightArr[i] = sc.nextDouble();
		
		}
		
		//배열에 값이 잘 입력되었는지 임시 확인
		System.out.println(heightArr); //배열의 주소가 출력된다. [D@6442b0a6
		//이유: heightArray 참조 변수에는 배열의 시작 주소가 저장되어 있기 때문에.
		
		System.out.println(Arrays.toString(heightArr)); //외우기!!(arrays하고 ctrl+space누른다음에)
		//배열에 저장된 모든 값을 한 줄로 간단히 출력.
		
		System.out.println();//줄 바꿈
		
		double sum = 0 ; //합계 (평균 구할 때 사용)
		
		System.out.print("입력받은 키 :");
		
		for(int i = 0 ; i < heightArr.length ; i++) {
			
			sum+= heightArr[i]; //우리가 입력받은 키를 다 저장한 배열임. 이걸 꺼내서 이제 누적하는 거야.
			System.out.print(heightArr[i] + " ");
		}
		
		System.out.printf("\n 평균 : %.2f \n ", sum / heightArr.length );
		
		
	}

	public void ex4() {
		
		int[] arr = new int[3];
		
		for ( int i = 0 ; i < arr.length ; i++ ) {
			System.out.println(arr[i]);
				
		} // 컴파일러가 0으로 초기화중...
		
		//에러 :  i <=arr.length라고 치면 ArrayIndexOutOfBounds라고 에러 뜸. 배열 인덱스 범위 초과.라는 뜻
		

//질문: System.out.println(Arrays.toString(heightArr));
//		System.out.print(heightArr[i])
//		둘의 차이는 무엇인가요??		

//		toString(heightArr) : 배열에 저장된 모든 값을 한 줄로 간단히 출력 (확인용으로 출력하고 싶을 때 쓴다)
//		System.out.println(Arrays.toString(heightArr)); //
//		System.out.print(heightArr[i])
		

	}
	
	public void ex5() {
		
		//3) 배열 선언과 동시에 (할당 및) 초기화
		
		int[] arr = {10,20,30,40};
		
		// 1. int[] 을 참조하는 변수 arr 를 먼저 선언함.
		// 2. int형 4칸짜리 배열을 heap영역에 할당(생성) 후 
		//	  각각의 인덱스를 10,20,30,40으로 초기화
		// 3. 할당된 배열의 시작 주소를 arr에 대입
		
		System.out.println("배열 길이 : " + arr.length);//확인 - 4칸 있다.
		System.out.println(Arrays.toString(arr)); //확인
	
	}

	public void ex6() {
		
		//점심 메뉴 뽑기 프로그램
		
		String[] menuArr = {"김밥 + 라면","KFC","맘스터치","서브웨이","백반","순대국","곰탕","파스타","삼겹살","빵"};
		
		//난수 발생
		int ran = (int)(Math.random() * menuArr.length);//배열의 길이만큼 곱하겠다.
		//Math.random은 0.0<=ran<1.0이니까
		//배열 index범위 내의 난수가 발생함.
		
		System.out.println("오늘 점심 메뉴 :" + menuArr[ran]);
		
		
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////
	// 배열 응용
	public void ex7() {
		
		//인원 수를 입력 받아 그 크기만큼의 정수 배열을 선언 및 할당
		//인원 수만큼 점수를 입력 받아
		//합계, 평균, 최고점, 최저점을 출력
		
		// ex)
	      // 입력 받을 인원 수 : 4
	      // 1번 점수 입력 : 100
	      // 2번 점수 입력 : 80
	      // 3번 점수 입력 : 50
	      // 4번 점수 입력 : 60
	      
	      // 합계 : 290
	      // 평균 : 72.5
	      // 최고점 : 100
	      // 최저점 : 50
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력받을 인원 수 : " );
		int size = sc.nextInt();
		int sum = 0;
		
		int[] scoreArr = new int [size];
		
		for(int i = 0;i<scoreArr.length;i++) {
			System.out.print((i+1)+"번 점수 입력 :");
			scoreArr[i] = sc.nextInt(); // ????????????
		
			
			sum += scoreArr[i]; //점수를 입력 받자마자 sum에 누적.
			
		}
		
		//최고, 최저점 구하기
		
		int max = scoreArr[0];
		int min = scoreArr[0];
		
		//1. 배열의 첫 번째 인덱스값을 최고,최저의 비교 기준으로 삼는다.
		
		//맨 앞을 제외하고 나머지를 반복하는 for문을 만든다.
		
		//breakpoint를 지정한 라인 이전에 멈춘다.
		//for문에 break point를 지정하면, 증감식이 해석되기 전에 멈춘다.(debug mode)
		
		for(int i = 1; i < scoreArr.length ; i++) {
			
			if(scoreArr[i] > max) { //기존 최고점보다 scoreArr[i]  값이 더 큰 경우
				max = scoreArr[i];
			} 
			if(scoreArr[i] < min) { //기존 최저점보다 scoreArr[i] 값이 더 작은 경우
				min = scoreArr[i];
				
			}
			
		// if문을 각각 쓰는 것과 if(max비교) - else if(min비교)로 했을 때  다르나요?
		// 지금 당장을 위해서는 else if가 낫지만(근데 어차피 속도차이 별로 없음), 유지보수를 위해서는 요즘 else if를 잘 안 쓴대.... 
			
		}
		
		
		
		
		
		
		System.out.println();//줄바꿈
		
		System.out.println("합계 :" + sum );
		System.out.println("평균 :" + (double)sum / scoreArr.length);
		System.out.println("합계 :" + max);
		System.out.println("합계 :" + min );
		
		

	}

	
	public void ex8() {
		
		//배열 내 데이터 검색
		
		//입력 정수가 배열에 존재하면 몇 번 인덱스에 존재하는지 출력
		//단, 없다면 "존재하지 않습니다" 출력
		
		int[] arr = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int search = sc.nextInt();
		
		boolean flag = true;
		//for문이 종료된 후에 true : 존재하지 않는다.
		//for문이 종료된 후에 false : 존재한다.
		
		
		
		//arr 배열 순차 접근(반복 접근)
		for( int i = 0 ; i < arr.length ; i++ ) {
			
			
			if(arr[i] == search ) { //arr[i] 값이 입력 받은 값과 같다면
				System.out.println(i + "번째 인덱스에 존재합니다.");
				flag = false;
				break; //break를 쓰는 이유 : 중복 데이터가 없으면 추가 검색을 하지 않아도 된다.
				
			}
			
			}
			
			if(flag) {
			System.out.println("존재하지 않습니다.");
			
			//else쓰면 안 돼.
			//

			
		}
		

	}
	
	
	//로또 번호 생성기
	public void createLottoNumber() {
		
		//배열을 이용한 중복 데이터 제거 + 정렬
		
		//1. 1에서 45번 사이의 중복되지 않은 난수 6개 
		//2. 생성된 난수를 오름 차순 정렬
		
		System.out.println("*****로또 번호 생성기 ******");
		
		//난수 6개를 저장할 배열 선언 및 할당
		int[] lotto = new int[6];
		
		//난수를 생성하여 lotto배열에 추가하기
		for( int i = 0; i < lotto.length ; i++ ) {
			
			int ran = (int)(Math.random() * 45 +1); //1~45사이 난수
			lotto[i] = ran; // 난수값을 배열 요소에 대입.
	
			//현재 인덱스(i) 이전의 요소를 순차 접근
			for(int x = 0 ; x < i ; x++) {
				
			if(lotto[x] == ran) {
				
				i--; //i값을 인위적으로 감소시켜
					// 바깥쪽 for문의 증감식(i++)이 실행 되었을 때
					//i값이 현재 값을 유지하도록 만든다.
					// (화살표를 왼쪽1칸 + 오른쪽 1칸 == 제자리)
				
				break; //추가 검사가 불필요하기 때문에 멈춤.
				
				}
				
				
			}
			
			
			
			
			
		}
		
		//Arrays.sort(배열명) : 배열 내 값을 오름 차순으로 정렬
		//-> Java가 미리 만들어서 제공.
		Arrays.sort(lotto);		
		//lotto 배열에 저장된 모든 값 출력
		System.out.println(Arrays.toString(lotto));
		
		
		
		
		
		
		
	}
	
	public void ex9() {
		
		//얕은 복사
		//- 참조하는 주소만을 복사하여 
		// 서로 다른 참조 변수가 하나의 배열(또는 객체)를 참조하게 하는 복사 방법
		
		//특징 : 하나의 배열을 참조하기 때문에 값을 공유하게 된다.
		
		int[] arr = {99, 70, 50, 43, 80};
		
		//arr변수에 저장된 배열의 시작 주소를 copyArr에 대입(얕은 복사)
		int[] copyArr = arr;
	
	//주소 확인 -> 같음
		System.out.println("arr :" + arr);
		System.out.println("copyArr :" + copyArr);
		
	System.out.println("[변경 전]");
	System.out.println("arr : " + Arrays.toString(arr));
	System.out.println("copyArr : " + Arrays.toString(copyArr));
	
	//복사본의 값을 변경 -> 원본도 변함 == 둘이 값을 공유하고 있다는 뜻 (얕은 복사 특징)
	copyArr[2] = 10000;
	
	
	
	System.out.println("[변경 후]");
	System.out.println("arr : " + Arrays.toString(arr));
	System.out.println("copyArr : " + Arrays.toString(copyArr));
	
	}
	
	
	public void ex10() {
		
		//깊은 복사
		// - 원본과 같은 자료형, 크기의 새로운 배열을 만들어
		// 원본의 데이터를 모두 복사하는 방법
		// == 복제
		
		
		//-> 원본 데이터를 보존하면서
		// 복사본의 데이터 가공을 진행하는 경우에 많이 사용한다.
		
		int[] arr = {99, 70, 50, 43, 80};
		
		// 깊은 복사를 위한 배열 선언 및 할당
		int[] copyArr = new int[arr.length];
		
		//원본 데이터를 모두 복사
		
		// 1) for문을 이용한 방법 (index가 동일하다는 특징을 이용한다.
//		
//		for(int i = 0 ; i <copyArr.length ; i++) {
//			
//			copyArr[i] = arr[i];
//			
//		}
		
		
	      // 2. System.arraycopy(원본배열, 원본 복사 시작 인덱스, 
	      //               복사배열, 복사배열의 삽입 시작 인덱스, 복사길이);
		
		//System.arraycopy(arr, 0, copyArr, 0, arr.length );
		
		//3. 복사할 배열 참조변수 =  Arrays.copyOf(원본배열,복사할 길이)
		
		copyArr = Arrays.copyOf(arr, arr.length);
		
		
		
		
		//주소 확인 -> 다름
				System.out.println("arr :" + arr);
				System.out.println("copyArr :" + copyArr);
				
			System.out.println("[변경 전]");
			System.out.println("arr : " + Arrays.toString(arr));
			System.out.println("copyArr : " + Arrays.toString(copyArr));
			
			//복사본의 값을 변경 -> 데이터를 공유하지 않는 서로 다른 배열이 됨.
			copyArr[2] = 10000;
			
			
			System.out.println("[변경 후]");
			System.out.println("arr : " + Arrays.toString(arr));
			System.out.println("copyArr : " + Arrays.toString(copyArr));
			
		
	}

	public void ex11() {
		
		//null 의미
		// - 참조하는 것(배열,객체)이 없다를 의미하는 값
		
		int[] arr1 = new int[3];
		
		System.out.println(arr1 == null);
		//arr1 == null -> false == arr1 참조 변수가 무언가를 참조하고 있다.
		
		if(arr1 != null ) { //arr1이 참조하는 배열이 있을 때에만 수행.
			
			System.out.println(arr1[0]);
		}
		
		System.out.println("=================================================================================");
	
	
		//int[] arr2 ; // 배열 참조 변수 선언만 하면 에러난다. 초기화 안 했다고....(=저장된 값이 없다)
		int[] arr2 = null ;
		//배열 참조 변수 선언 및 null 초기화 == 값은 있으나 참조하는 게 없다는 뜻. (값이 있으니까 에러가 나지 않는다)
		
		System.out.println(arr2);
		
		
		//arr2가 참조하는 배열이 없을 때
		//새로운 배열을 생성하여 그 시작 주소를 arr2에 대입
		if(arr2 == null) {
			arr2 = new int[4];
		}
		System.out.println(arr2);
		
	}
	
	
	
	
	
}
