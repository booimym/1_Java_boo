package edu.kh.oop.basic;

public class BasicRun {
	
	public static void main(String[] args) {
		
		LSY 이수연 = new LSY(); // HEAP영역에 LSY 클래스에 정의된 내용을 이용하여
				//LSY 객체를 생성(할당)

		//객체가 가지고 있는 속성 출력
		
		System.out.println("이름 : " + 이수연.name);
		System.out.println("나이 : "+ 이수연.age);
		System.out.println("나이 : "+ 이수연.birthday);
//		System.out.println("비밀번호 : "+ 이수연.password); //private 쓰면 에러 : The field LSY.password is not visible
		//기능 수행
		
		
		이수연.eat();
		이수연.study();
		이수연.plus(50, 100); //plus누르고 ctrl누르면 어떤 기능인지 보여줌. 
		
		
		//비밀번호를 볼 수 있는 기능을 호출(== 간접 접근 방법)
		이수연.showPassword();
		
		
		
	}

}
