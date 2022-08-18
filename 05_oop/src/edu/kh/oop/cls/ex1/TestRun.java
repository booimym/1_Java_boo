package edu.kh.oop.cls.ex1;

import edu.kh.oop.cls.ex2.Test2; //데려오겠다.
// The type edu.kh.oop.cls.ex2.Test2 is not visible
// default class: 다른 패키지의 클래스에서 import가 불가능하다.

public class TestRun {

	
	public static void main(String[] args) {
		
		//Test1 클래스를 이용해서 객체를 생성하겠다라는 의미
		// ==Test1 클래스에 정의된 내용을 이용해서
		// heap영역에 새로운 객체를 생성(할당)하겠다.
	
		Test1 t1 = new Test1();
		
		Test2 t2 = new Test2(); //public으로 해도 ,,, Test2에 접근이 안되네?
								//import 이용 = 다른 패키지에 존재하는 클래스를 해당 클래스로 가져오는 것		
		
		//import해야지만 에러가 발생하지 않음.
		// -> public은 어디서든지 접근 가능.
		// == 어디서든지 import가 가능하다는 뜻.
		//public class Test2에서 public 지워버리면,, 에러뜸. 
		//default class: 다른 패키지의 클래스에서 import가 불가능하다.
		
		//  클래스 접근제한자의 사용처 
		//	public : 언제 어디서든지 사용 가능한 클래스를 만들 때 사용한다.
		// 			(기본적으로 public 사용)
		//
		// (default) : 설계적인 이유로 사용함
		// => 같은 클래스명인데 다른 기능, 사용처가 다름
		//    이를 구분하는 용도로 쓰임.
		// => 내부 클래스를 만드는데 쓰임
		// => 하나의 java파일에 여러 클래스 작성 시 사용한다.
		

	
	}
}
