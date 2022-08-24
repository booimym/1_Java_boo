package edu.kh.poly.ex2.model.vo;

public class Person extends Animal {

	//필드
	private String name;
	private int age;
	
	//기본 생성자 // 미작성 시 컴파일러가 자동 추가
	public Person() {}
	
	//super(); //미작성 시 컴파일러가 자동 추가
	
	
	
	
	
	
	@Override
	
	//상속 받은 breath() 메서드를 오버라이딩
	
	public void breath() {
		
		System.out.println("코와 입으로 숨을 쉰다.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
