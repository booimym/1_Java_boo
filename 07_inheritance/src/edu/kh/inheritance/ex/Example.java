package edu.kh.inheritance.ex;

import edu.kh.inheritance.model.vo.Person;
import edu.kh.inheritance.model.vo.Student;

public class Example {

	
	public void ex1() {
		
		//상속 확인
		
		//Student 자식 객체 생성( 자동완성으로 import구문 추가하기)
		
		Student s1 = new Student();
		
		//자식만의 기능/필드 (grade, classRoom)
		
		s1.setGrade(2);//setGrade(int grade) : void  - Student(Student의 메서드)
		s1.setClassroom(3); // - Student(Student의 메서드)
		s1.setName("김개똥"); // setName(String name) : void - Person(person의 메서드) <- 상속관계. 부모인 person으로부터 상속받은 메서드라는 뜻
		s1.setAge(15); // - Person(person의 메서드) 
		
		
		//int edu.kh.inheritance.model.vo.Student.getGrade()
		System.out.println(s1.getGrade());
		System.out.println(s1.getClassroom());
		
		//int edu.kh.inheritance.model.vo.Person.getAge()
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		
		
		//Object
		
		
		Person p1 = new Person(); 
		
//		hashCode에 커서 대면 : int java.lang.Object.hashCode()
//		(상속 안 했는데도 뜸.)
//		Object 클래스는 모든 클래스의 최상위 부모이다.
//		== 모든 클래스는 Object의 후손이다.
		System.out.println(p1.hashCode());
		
		//상속은 누적된다 Object -> Person -> Student
		System.out.println(s1.hashCode());
	
		Student s2 = new Student("김학생", 17,1,5);
		
		System.out.println(s2.getName());
		System.out.println(s2.getAge());
		System.out.println(s2.getGrade());
		System.out.println(s2.getClassroom());
		
		
	}
	
	public void ex2() {
		
		//오버라이딩 : 재정의
		
		Person p1 = new Person("홍길동",15);
		
		Student s1 = new Student("김학생",17,1,5);
		
		p1.introduce();
		
		s1.introduce();//person상속받음 -> 오버라이딩 진행 시 이제 student 메서드로 인식됨다.
		
		
	}
}
