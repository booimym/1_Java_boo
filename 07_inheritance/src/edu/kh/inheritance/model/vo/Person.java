package edu.kh.inheritance.model.vo;

public class Person extends Object { //자식이 공통적으로 가지고 있는 필드/메서드를 작성함( 추상화 )

	
	//extends Object -> 상속 구문이 작성되지 않으면
	//					컴파일러가 자동으로 추가해줌.
	
	
	
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

	
	//자기 소개 기능
	public void introduce() {
		System.out.println("이름 :" + name);
		System.out.println("나이 :" + age);
		
		
	}
	
}
