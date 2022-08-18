package edu.kh.oop.cls.ex1;

import edu.kh.oop.cls.ex1.Test100;

public class Test1 {

	/* 접근 제한자 : 다른 클래스에서 해당 클래스로 접근할 수 있는 범위를 제한하는 키워드
	 * 
	 * 총 4가지 종류가 있다.
	 * public	 	: 같은 프로젝트 내 어디서든지 접근이 가능하다.
	 * protected 	: default 범위 + 상속 관계만 접근 가능 (같은 패키지가 아니어도 접근 가능하다)
	 * (default) 	: 같은 패키지 내에서 접근 가능
	 * 				: default라는 단어를 직접 작성하지 않고 생략하는 거임.
	 * private 		: 해당 클래스 내부에서만 접근이 가능하다.(다른 클래스는 절대 직접 접근 불가)
	 */
	
	/* 클래스 : 객체의 속성, 기능을 정의한 문서(설계도)
	 * 
	 * [작성법]
	 * 
	 * [접근 제한자][예약어] class 클래스명 [상속관계]
	 * []의 의미 == 선택적으로 작성 가능하다(== 있어도 되고, 없어도 된다)는 뜻.
	 * 
	 * 클래스는 public이랑 (default) 두 접근 제한자만 작성 가능하다.
	 * protected 등으로 썼을 시 에러 : Illegal modifier for the class Test1; only public, abstract & final are permitted
	 * 
	 * 
	 */
	
	
	public void ex() {
		
		Test100 t100 = new Test100();
		
		System.out.println(t100.a);
	}
	

	
	
}
	

