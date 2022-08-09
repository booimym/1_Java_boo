package edu.kh.variable.ex1;

public class VariableExample3 {

	public static void main(String[] args) {
		
		
		// **** 변수 명명 규칙 **** (1,2,3,4는 강제(어기면 에러) / 5는 강제x(어겨도 에러는 안남. 관례임)
		
		// 1. 대소문자가 구분되며, 길이 제한이 없다.
		//(단, 띄어쓰기는 안 된다.)
		int num1;
		int Num1;
		// int Num1; // 에러 : Duplicate local variable Num1 (Num1 변수가 중복이다)
		
		int asdfasdfasfd;
		int showMeTheMoney;
		
		// int show Me The Money; // 에러 : 띄어쓰기하면 에러 발생
		
		// 2. 예약어 사용 금지
		
		// int int; // 에러 : 예약어 사용
		
		// 3. 숫자로 시작하면 안 된다.
		
		//int 2num ; // 에러 : Syntax error on token "2", delete this token 
					//(Syntax error : 문법 오류 - 2라고 하는 token(문자) 지워라.)
		int num2;
		
		// 4. 특수문자는 '$'와 '_'만을 허용한다.
		// -> $는 내부클래스 사용시 자동으로 붙는 기호임. 우리가 직접 사용은 하지 않는다.
		// -> _는 상수 단어 구분 외에는 사용하지 않는다.
		
		double $dNum;
		float _f_num;
		
		// 5. 여러 단어 이름은 단어의 첫 글자는 대문자로 한다.
		//		단, 첫 시작 글자는 소문자
		
		int userAge;
		
		// 참고 : 변수명은 언어 제한이 없다.
		// 단, 코드 공유 시 글자 깨짐이 발생할 수 있어서 권장X
		
		int 정수1; 
		
		// ** 변수는 한 개의 데이터만 보관 가능하다. **
		
		int iNum = 30 ;
		System.out.println(iNum);
		
		 iNum = 50 ;
		System.out.println(iNum); // 마지막 대입한 값만 보관됨.
		
		// 문자열 자료형 String
		// -> 기본 자료형 X. 참조형 o
		
		// String의 리터럴 = 문자열
		// String의 리터럴 표기법은 "쌍따옴표"
		
		String str1;
		str1 = "안녕하세요"; // str1 변수의 초기화 = 최초로 값 대입을 했다.
		
		System.out.println(str1);
		
		str1 = "스트링도 기본 자료형 변수처럼 값을 변경할 수 있습니다.";
		
		System.out.println(str1);
		
	
		// 변수 선언과 동시에 초기화
	
		String name = "이수연";
		
		int age = 30;
		
		char gender = '여';
		
		// 이수연님은 30세 여성입니다.
		
		System.out.println("---------------------------------------------------------");
		
		System.out.println(age + 10 ); // 숫자 + 숫자 = 합
		
		System.out.println(name + "입니다"); 	// String(문자열) + String(문자열) = 이어쓰기
		System.out.println(name + age); 		// String(문자열) + 숫자 = 이어쓰기
		System.out.println(age + 10 + name); 	// 숫자 + 숫자 + 문자열 =  숫자합 + 문자열  = 이어쓰기
		System.out.println(name + age + 10);	// 문자열 + 숫자 + 숫자 = 이어쓰기 + 숫자 = 이어쓰기
												// 왼->오 순서대로 더하기
		System.out.println(name + "님은 " +  age + "세 " + gender + "성입니다.");
		System.out.println("---------------------------------------------------------------------------------");
		
		//상수(final) : 항[상] 같은 [수]
		// -> java에서는 한번 값을 기록하면 값을 바꿀 수 없는 변수
		
		int num3 = 200;
		num3 = 300;
		
		//상수 (상수는 대문자로 표기, 여러 단어면 _로 구분한다)
		final int CONSTANT_NUMBER = 1000000000; // 1억
		// 마지막으로 값을 대입하는 변수 = 다시는 값을 대입 받지 않겠다.
		//= 변하지 않는 수(상수)
		
		//CONSTANT_NUMBER = 0; // 에러 : The final local variable CONSTANT_NUMBER cannot be assigned. It must be blank and not using a compound assignment
		
		
		System.out.println(CONSTANT_NUMBER);
		
		
		// 상수 예제
		final int UP = 10;
		final int DOWN = -10;
		final int INIT = 0; // INIT : 처음으로 되돌리겠다.
		
		int num4 = INIT;
		System.out.println(INIT);
		
		num4 = num4 + UP; // INIT( = 0) + 10 = 10
		
		System.out.println(num4);
		
		num4 = num4 + DOWN * 3; // 사칙연산 우선순위 = 곱하기 먼저 
		
		System.out.println(num4);
		
		// 상수는 기계를 다루는 c언어쪽에서 주로 사용한다. (+10, -10 대신 약속을 하는 거임)
		
		
		
		
		
		
		
		
		
		
		
	
	}
	
}
