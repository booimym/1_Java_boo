package edu.kh.variable.ex2;

public class VariableExample2 {
	
	public static void main(String[] args) {
		
		// 변수 선언 : 메모리에 값을 저장할 공간을 할당
		boolean booleanDate; 
		// 논리값(true/false)을 저장할 공간 1byte를 메모리에 할당하고,
		// 그 공간을 booleanDate라고 부르겠다.
		
		int iNum;
		// 정수 값을 저장할 공간 4byte를 메모리에 할당하고
		// 그 공간을 iNum 이라고 부르겠다
		
		long longNum;
		// 정수 값을 저장할 공간 8byte를 메모리에 할당하고
				// 그 공간을 longNum 이라고 부르겠다 
		
		
		byte bNum;
		bNum = 1;
		
		short sNum;
		sNum = 1000;
		
		// -> byte/short 는 거의 사용되지 않는 자료형으로
		// 별도의 리터럴 표기법이 없음 -> 즉 int 표기법을 같이 사용
		
		
		float fNum; // 실수형 변수 4byte 할당
		
		
		double dNum; // 실수형 변수 8byte 할당
		
		char ch1; // 문자형 변수 2byte 할당
		char ch2; // 문자형 변수 2byte 할당
		
		
		
		
		
		// 값 대입 : 선언된 변수에 값(리터럴)을 대입 하는 것
		
		booleanDate = true;
		// boolean 자료형 변수는 true / false 만 저장할 수 있다.
		// -> boolean 의 리터럴 표기법은 true / false 만 가능하다.
		
		iNum = 1000000; // 100만
		// - > int의 리터럴 표기법은 기본적으로 정수 표기법 (왜? 소수점이없잖아)
		
		//iNum = 10000000000;
		
		longNum = 10000000000L;
		// 10000000000은 정수인 int 표기법이므로 int의 최대 크기를 넘어 설 수 없다.
		// - > long 자료형의 리터럴 표기법은 정수 뒤에 L 또는 l 작성.
		
		
		fNum = 3.14F;
		// float의 리터렬 표기법은 F 또는 f 를 사용한다
		
		dNum = 1.23;
		// double의 리터럴 표기법은 기본 실수 표기법
		
		
		ch1 = 'a';
		// char의 리터럴 표기법은 ''(홀따옴표)
		
		ch2 = 66; // 'b'
		// char 자료형은 숫자-문자 형태의 문자표에서는
		// 일치하는 문자나 숫자의 문자 부분만 출력
		
		
		// syso + 컨트롤 + space -> println() 자동완성
		System.out.println(booleanDate);
		System.out.println(iNum);
		System.out.println(longNum);
		System.out.println(sNum);
		System.out.println(fNum);
		System.out.println(bNum);
		System.out.println(ch1);
		System.out.println(ch2);
		
		// 출력 시 L, F 같은 리터럴 표기법은 생략된다
		
		
	}

	
			

}
