package edu.kh.poly.ex1.model.vo;


//toString() 오버라이딩 확인

public class Temp {

	
	public static void main(String[] args) {
		
		Car c = new Car(4,4,"경유");
		
		System.out.println(c);
		
		//참조변수 c의 주소값이 나와야 되는데
		// 알아서 컴파일러가 toString을 호출함. 
		
		System.out.println(c.toString());
		
		
		
	}
}
