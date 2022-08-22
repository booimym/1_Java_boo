package edu.kh.inheritance.model.vo;

public class Person {

	private String name;
	private int age;
	
	// ctrl + space bar + enter(기본생성자 단축기 = 이 위치에서만 된다)
	public Person() {}

	// alt + s -> o  또는 alt + shift + s -> o
	
	
	// Generate constror using Fields...
	// 매개변수 생성자
	
	
	

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name= name;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age= age;
	}

	
	
}