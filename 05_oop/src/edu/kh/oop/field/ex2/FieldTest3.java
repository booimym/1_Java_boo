package edu.kh.oop.field.ex2;

import edu.kh.oop.field.ex1.FieldTest;
//다른 클래스를 현재 클래스에서 사용할 수 있도록 가져오기
//???

public class FieldTest3 extends FieldTest {
//[접근 제한자][예약어]class 클래스명 [상속관계]
	
	
	public void ex() {
		
		FieldTest f = new FieldTest();
	
		
		System.out.println("다른 패키지");
		System.out.println(f.v1); //public
		
//		System.out.println(f.v2); //protected, 에러
//		//- 다른 패키지, 상속x
		
		System.out.println(v2);
		//int edu.kh.oop.field.ex1.FieldTest.v2
		//상속관계에서는 protected 직접 접근이 가능하다.
		
		//System.out.println(f.v2)랑은 다른게 상속받은 걸 쓰겠다는 게 아니라 import를 통해 가져와서 새로 만든 걸 쓰겠다는 뜻. 상속관계가 아니니까 v2가 인식이 되지 않음.
//		
//		System.out.println(f.v3); //(default) 에러
//		// - 다른 패키지
		
		
		
	}
}
