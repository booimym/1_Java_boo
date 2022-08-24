package edu.kh.poly.ex2.model.vo;

public class Fish extends Animal {
	//Animal 상속 시 오류 발생
	// -> The type Fish must implement(구현해야 한다)
	//	the inherited abstract method Animal.breath()
	// -> 이렇게 에러나게 해서 오버라이딩을 강제하는 거임.
	
	
	private int fin; //지느러미 개수
	
	//기본 생성자 : 객체를 이걸 보고 만듦.
	public Fish() {
		
		super(); //super()생성자
				//자식 객체 내부의 부모 부분을 만들 때
				//부모의 생성자를 참조해서 생성.
		
	}
	
	
	
	//상속 받은 breath() 메서드를 오버라이딩
	
	@Override
	
	public void breath() {
		
		System.out.println("아가미 호흡을 한다.");
		
		
		
	}



	public int getFin() {
		return fin;
	}



	public void setFin(int fin) {
		this.fin = fin;
	}




}

