package edu.kh.poly.ex1.model.service;

import edu.kh.poly.ex1.model.vo.Car;
import edu.kh.poly.ex1.model.vo.Spark;
import edu.kh.poly.ex1.model.vo.Truck;

public class Example1 {

	
	
		
	// 다형성 : 상속을 이용한 기술로
	// 		  부모 타입의 참조 변수 하나가
	// 		  여러 타입의 자식 객체를 참조할 수 있다.
	
	
	public void ex1(){
		// 업 캐스팅 : 부모참조변수 = 자식 객체
		
		
		Car c1 = new Car();
		//부모 참조변수 = 부모 객체
		
		
		//**업 캐스팅 확인**
		Car c2 = new Truck();
		//부모 참조변수 = 자식 객체(부모 부분만 참조)
		
		// Truck이 Car로부터 상속받은 메서드
		c2.setWheel(0);
		c2.setSeat(0);
		c2.setFuel("휘발유");
		
		//c2.setWeight(1.5); //에러
		//The method setWeight(double) is undefined for the type Car
		//Car에는 setWeight()이 정의되지 않음.
		// 참조변수가 부모 타입이기 때문에
		// 참조하는 객체가 자식이어도 부모 부분만 참조 가능
		
		//System.out.println(c1.toString());
		//정적 바인딩 : toString에 커서놓고 엔터치면 car클래스의 toString이 실행된다
		//정적 바인딩 : 프로그램 실행 전 [메서드 호출부]랑 [실제 메서드 코드]랑 연결하는 것.
		//					부모타입으로 메서드 호출 -> 부모 클래스 메서드 연결
		
		//동적 바인딩 : 프로그램 실행 중
		//			 참조하는 객체의 실제 타입의 오버라이딩된 메서드 연결
		System.out.println(c2.toString());
		
	}
	
	 public void ex2() {
		 
		 //다형성(업캐스팅), 동적 바인딩, 객체 배열
		 
		 
		 Car[] arr = new Car[3];
		 			//Car 부모 타입 참조 변수 3개짜리 배열
		 
		 arr[0] = new Car(4,9,"경유"); //Car객체 
		 //arr 타입은 Car임
		 //Car type 참조변수임.
		 
		 arr[1] = new Truck(8,3,"경유",5.0); // Truck 객체(업캐스팅)
		 //Car type 참조변수임.
		 
		 arr[2] = new Spark(4,4,"휘발유",0.5); //Spark 객체(업캐스팅)
		 //Car type 참조변수임.
		 
		 for(int i = 0;i<arr.length;i++) {
			 
			 System.out.println(arr[i]);
			 
			 
			 //arr[i] == 참조 변수
			 //print() method레 ...?ㅁㅁ마저 필기해
			 //
		 }
		 
		 
		 //업캐스팅 + 동적 바인딩 장점
		 // 코드 재사용성 증가, 코드 길이 감소
		 printCar(arr[0]); //car
		 printCar(arr[1]); //truck
		 printCar(arr[2]); //spark

	 }
	
	 
	 public void printCar(Car c) {
		 
		 System.out.println("자동차 정보 :"+c.toString());
		 
		 //전달 받은 객체가 자식 객체이고
		 //toString()을 오버라이딩했다면
		 //동적 바인딩을 이용해서 자식toString() 호출

		 
		  
	 }
	 
	 // 업캐스팅 + 동적바인딩을 사용해 이런 코드의 중복을 방지할 수 있다
//   public void printTruck(Truck c) {
//      System.out.println("자동차 정보 : " + c);
//   }
//   
//   public void printSpark(Spark c) {
//      System.out.println("자동차 정보 : " + c);
//   }
   

//	 public void printCar(Truck c) {
//		 
//		 System.out.println("자동차 정보 :"+c);
//	 }
	 
	 
	 
	public void ex3() {
		
		//다운 캐스팅
		//- 업캐스팅이 적용된 상황에서(부모 참조변수 = 자식객체) 이 상황에서
		// 부모 참조 변수를 자식 타입으로 바꿔(방법 : 강제 형변환, 얕은 복사)
		// 자식 객체를 온전하게 참조할 수 있게 만듦.
		
		Car c1 = new Spark(4,4,"휘발유",0.5); //업캐스팅 중...
		
		Car c2 = new Truck(12,3,"형유", 20); //업캐스팅 중...
		
		Car c3 = new Car(4,5,"휘발유");
		
		
		//강제형변환
		((Spark)c1).dc();
		//()를 넣어서 형변환 먼저 진행 후 dc()를 호출한다.
//		-> 다운캐스팅
		
		
		//얕은 복사
		Truck t2 = (Truck)c2;
		
		t2.loading();
	
		
		System.out.println("----");
		
		
		//instanceof 연산자
		//- 참조하는 객체의 타입을 검사하는 연산자
		// 맞으면 true, 아니면 false
		
		
		
		System.out.println( c1 instanceof Spark); //true
		System.out.println( c2 instanceof Spark); //false
		
		
		check(c1);
		check(c2);
		check(c3);
		
		
		// 다운 캐스팅을 잘못한 경우
		
		//((Truck)c3 ).loading();
		//코드상의 오류는 발생하지 않지만(빨간줄x)
		//실행시키면...
		//Exception in thread "main" java.lang.ClassCastException
		//형변환예외 - 다운 캐스팅이 잘못된 경우에 발생함.
		
		//*해결방법 : instanceof 연산자로 다운캐스팅 할 타입이 맞는지 검사를 먼저 하면 됨.
		
		if (c3 instanceof Truck) {
			((Truck)c3 ).loading();
		} else {
			System.out.println("c3는 Truck객체가 아닙니다.");
		}
		
	}
	
	public void ex4() {
		
		// instanceof 연산자 사용 시 검사 순서에 대한 문제점
		
		// - instanceof 연산자
		// 1. 참조하는 객체의 타입을 검사하는 연산자
		// 2. 참조하는 객체가 특정 타입을 상속 받았는지 검사
		
		Car c = new Spark();// 업캐스팅 사용중
		
		if (c instanceof Car) {
			//c가 참조하는 객체는 Spark이지만
			//업캐스팅 상태이기 때문에 Car로도 인식된다.(다형성)
			System.out.println("부모 Car 타입입니다!");
			
		} else {
			
			((Spark)c).dc();
		}
		
		
	}
	
	
	
	public void check(Car c) {
		//전달받은 c의 타입을 검사해서 
//		고유한 메서드(truck이나 spark만 가지고 있는 dc,loading같은 메서드)를 호출
		
		if( c instanceof Spark ) { //참조하는 객체가 Spark인 경우,
			
			 ( (Spark)c ).dc();
			
		} else if ( c instanceof Truck) {
			((Truck)c ).loading();
		
		} else { // 참조하는 객체가 car인 경우 - 고유 기능 x
			System.out.println("Car는 고유 기능이 없습니다.");
		}
	}
	
	
	
	
}

