package edu.kh.variable.ex1;

public class VariableExample4 {

	public static void main(String[] args) {
		
		/* 형변환(Casting) : 값의 자료형을 변환하는 것.
		 * 
		 * 형변환은 왜 필요한가?
		 * -컴퓨터의 값 처리 원칙을 위배하는 경우 이를 해결하기 위해
		 * 
		 * 자동 형변환
		 * - 자료형의 [값의 범위]가 서로 다른 두 값의 연산 시
		 * 
		 * [컴파일러(번역기)]가 자동으로 
		 * 
		 * [값의 범위]가 작은 값을 큰 값으로 변환하는 것.
		 * 
		 * 
		 */
		
		// 자동 형변환 확인 1)
		
		int num1 = 10;
		long num2 = 100l;
		
		System.out.println("num1 + num2 = " + (num1 + num2) ); //이어쓰기 안 되도록 괄호 넣어주기
		// 110은 long타입의 자료형이다.
		
		
		// 자동 형변환 확인 2)
		
		int num3 = 300;
		double num4 = 1.1;
		
		
		// int result = num3 + num4 ; // 에러 : Type mismatch: cannot convert from double to int (더블형을 int형으로 할 수 없다.)
					// 300   + 1.1 
					// double 값이 더 크기 때문에 int가 형변환을 해야 함.
					// 300.0(double) + 1.1(double) 
					// = 301.1(double)
		
		//double값인데 int변수라서 에러난 것임.
		
		double result = num3 + num4;
		
		
		System.out.println(result);
		
		
		
		// 자동 형변환 확인 3) char -> int 자동 형변환
		
		
		int num5 = 'a'; //대입도 연산이다. 
		//  int  = char
		
		System.out.println(num5);
		
		char ch = 97;
		//예외	// 형변환 예외 사항(큰 -> 작은쪽으로 자동 형변환)
		System.out.println("ch : " + num5);
		
		
		char ch2 = '백';
		int result2 = ch2;
		
		System.out.println(ch2 + " Unicode Number :" + result2);
		
		
		System.out.println("----------------------------------------");
		
		
		System.out.println("***강제 형변환 ***");
		
		double temp = 3.14;
		// int result3 = temp; // 에러 : 그릇(int) < 값(double) 인데 대입 연산(=)을 통해 넣으려고 하는 거임... 자동 불가. 강제로만 가능.
		int result3 = (int)temp;
		
		System.out.println("result 3 : " + result3); // 3(소수점 버림 처리됨)
		
		int temp2 = 290;
		// byte result4 = temp2; //에러 이유 : 그릇(byte) < 값(int) 
		byte result4 = (byte)temp2;
		
		System.out.println("result 4 : " + result4); // 강제 형변환으로 290 > 34로 데이터 손실이 남.
		
		//강제 형변환의 다른 사용 예시
		
		// *** 강제 형변환은 값의 범위 관계 없이 원하는 자료형으로 변환 가능 ***
		
		int iNum1 = 1;
		int iNum2 = 2;
		
		System.out.println( iNum1 / iNum2 );
						// 1 / 2 = 0.5 인데 말이 안 됨. 
						// int/int = int니까 int결과 나오게 하려고 소수점 버림. = 0이 나오게 된다. 
						//  0.5가 나오게 하고 싶다면?
		
		// 강제 형변환과 자동 형변환의 동시 사용
		
		System.out.println( (double)iNum1 / iNum2 );  
							// 1.0 / 2 
							// double / int => 자동형변환으로 int가 double로 변하게 됨.
							// 1.0 / 2.0 = 0.5(값도 double)
		
		System.out.println(  (char) 65  );  //int를 char로 강제 형변환
		System.out.println((int) 'A' ); // char를 int로 강제 형변환
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
	
}
