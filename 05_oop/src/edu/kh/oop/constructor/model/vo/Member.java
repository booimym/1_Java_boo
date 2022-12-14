package edu.kh.oop.constructor.model.vo;

public class Member {

	//추상화 -> 아이디, 비밀번호, 전화번호, 나이
	
	// 캡슐화 -> 추상화 결과를 묶고, 데이터 직접 접근을 제한(private 사용함)
	
	
	//필드 (==멤버변수) 그리고 인스턴스 변수
	private String memberId;
	private String memberPw;
	private String memberPhone; //int(숫자)로 취급할 때 제일 먼저 0은 없어지기 때문에 string을 써야됨
	private int	memberAge;
	
	
	//	생성자(기능) - 객체를 생성할 때 사용하는 기능
	
	// 	생성자 작성 규칙 1. 클래스명 == 생성자명
	//	생성자 작성 규칙 2. 반환형 x -> public void에 void지우나봄
	
	
	//기본 생성자 : () 내에 아무것도 없는 생성자
	//			---> 매개변수가 없는 생성자
	
	public Member() {}
	
//	public Member() {
//		
//		// 생성자 사용 목적 1. 필드 초기화
//		memberId = "member01";
//		memberPw = "pass01!";
//		memberPhone = "010-1234-1234";
//		memberAge = 25;
//		
//		// 생성자 사용 목적 2. 객체 생성 시 특정 기능 수행
//		System.out.println("Member 객체가 생성되었습니다.");
//		
//		// 한번 만들어둔 생성자를 계속 재사용
//		// -> 코드 길이 감소, 재사용성 증가
//		
		
//	}

	//기본 생성자가 없어도 Member() 구문에서 에러가 발생하지 않는다.
	// -> 클래스에 생성자가 하나도 작성되지 않으면 
	//    컴파일러가 자동으로 기본생성자를 추가해준다.
	// public Member(){} //Member 클래스에 자동 추가
	
	
	// 매개변수 생성자
	public Member(String memberId, String memberPw, String memberPhone, int memberAge) {
					// -> 매개 변수(Parameter)
					// * 매개 : 둘 사이의 관계를 형성한다. (즉, 관계 형성 변수)
					
		// 필드와 매개변수의 변수명이 같을 경우
		// 변수명 호출 시 가까운 필드 또는 매개 변수가 호출된다.
		
		
		//this 참조 변수
		// - 생성된 객체(인스턴스)에 숨겨진 참조 변수로 
		// 현재 객체의 시작 주소를 참조함.
		//     (==현재 객체를 참조함)
		
		//생성된 객체의 필드를 매개변수 초기화
//				(필드 = 매개변수)
		this.memberId = memberId; // 매개변수값 대입.
		this.memberPw = memberPw;
		this.memberPhone = memberPhone;
		this.memberAge = memberAge;
		
		
		System.out.println(memberId);		
		System.out.println(memberPw);		
		System.out.println(memberPhone);		
		System.out.println(memberAge);		
		
	}
	
	//오버 로딩 (Over Loading, 과적)
	
	// -> 이름 하나로 여러 기능을 수행할 수 있게 하는 것
	// == 동일한 메서드(또는 생성자)명으로 여러 메서드를 작성하는 것
	
	// 오버로딩의 조건
	// 1. 메서드(생성자) 이름이 같아야 한다.
	// 2. 매개변수가 타입, 개수, 순서 중 하나라도 달라야 한다.
	// 
	
	public Member(String memberId, String memberPw) { 
		
		// 매개 변수 개수가 달라서 오버로딩 성립
	
	}
	
//	*오버로딩 주의사항
	
//	public Member(String memberPw, String memberId) {
		//에러: Duplicate method Member(String, String) in type Member
		//매개 변수 자료형의 (타입, 개수, 순서) 중 하나라도 달라야 한다.
		//매개변수명은 사용자가 보기 편하게 하기 위해 의미를 부여하는 것일 뿐, 
		//컴퓨터한테는 불필요한 요소라서 오버로딩 검사 시 인식되지 않음.
		
	
	//this() 생성자 (많이 안쓰이니까 참고 정도만 알아두기)
	//- 생성자를 이용한 필드 초기화 구문의 중복을 없애고, 재사용성을 늘리기 위한 기능
	//- 주의사항 : 반드시 생성자의 첫 줄에 작성되어야 한다!
	
	
	public Member(int memberAge, String memberPhone ) {
		
		//전달받은 매개변수로 현재 객체 필드 초기화
		
//		(현재객체가 가지고 있는 거에 매개변수값 대입하겠다.)
		this.memberAge = memberAge; 
		this.memberPhone = memberPhone;
		
		
	}
	
	public Member(String memberId, int memberAge, String memberPhone) {
		
		//int,String순서인 객체를 호출하겠다는 뜻.
		this(memberAge,memberPhone); //this()생성자 호출
		this.memberId = memberId;
//		this.memberAge= memberAge;
//		this.memberPhone = memberPhone;
		
		
	}
	
	
	//메서드(기능)
	}
	
	
	
	

