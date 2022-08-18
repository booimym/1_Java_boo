package edu.kh.oop.field;

import edu.kh.oop.field.model.vo.Student; //다른 패키지니까 import문 필요함.
import edu.kh.oop.field.model.vo.Trainee;

public class FieldRun {

	public static void main(String[] args) {
		
		//Student 객체 생성
		
		Student std1 = new Student();
		
		//std1은 참조변수임.
		//std1이 참조하는 객체에 있는 name필드에 "홍길동"을 대입하겠다는 뜻.
		std1.name = "홍길동"; 
		
		
		//Student 객체를 또 생성할 거임.
		
		Student std2 = new Student();
		
		std2.name = "이순신";
		
		
		System.out.println("[std1]");
		System.out.println("이름 : " + std1.name); //std1이 참조하는 name필드 값을 출력.
		System.out.println("학교명 :" + std1.schoolName);
		std1.study();
		System.out.println("[std2]");
		System.out.println("이름 : " + std2.name); //std1이 참조하는 name필드 값을 출력.
		System.out.println("학교명 :" + std2.schoolName);
		std2.study();
		
		System.out.println("---------------------");
		
		//모든 학생 객체의 학교명 변경(static미사용)
//		std1.schoolName = "KH대학 부속 고등학교";
//		std2.schoolName = "KH대학 부속 고등학교";
		
		
		//static(==공유 영역) 사용
		//std1.schoolName = "KH대학 부속 고등학교";
		//충고 : The static field Student.schoolName should be accessed in a static way
		//*static 방식으로 접근하기*
		// -> 클래스명.static 필드명/메서드명으로 작성하면 해결!
		Student.schoolName = "KH 정보교육원";
		
		
		System.out.println(std1.schoolName);
		System.out.println(std2.schoolName);
		
		//ctrl+space누르면 import자동완성됨
		Trainee t1 = new Trainee(); //훈련생 객체 생성
		
		System.out.println(t1.name);
		System.out.println(t1.phone);
		System.out.println(t1.email); //초기화 되어 있는가?
		System.out.println(t1.salary);//초기화 되어 있는가?
		System.out.println(t1.classRoom);//초기화 되어 있는가?
		
		Trainee t2 = new Trainee(); //훈련생 객체 생성
		
		System.out.println(t2.name);
		System.out.println(t2.phone);
		System.out.println(t2.email); //초기화 되어 있는가?
		System.out.println(t2.salary);//초기화 되어 있는가?
		System.out.println(t2.classRoom);//초기화 되어 있는가?
		
		
		
	}
	
}
