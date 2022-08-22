package edu.kh.inheritance.ex;

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
		
		
		
	}
	
	
}
