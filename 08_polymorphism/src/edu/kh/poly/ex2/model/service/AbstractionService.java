package edu.kh.poly.ex2.model.service;

import java.util.Scanner;

import edu.kh.poly.ex2.model.vo.Animal;
import edu.kh.poly.ex2.model.vo.Fish;
import edu.kh.poly.ex2.model.vo.HGD;
import edu.kh.poly.ex2.model.vo.HSH;
import edu.kh.poly.ex2.model.vo.Person;
import edu.kh.poly.model.vo.Calculator;
import edu.kh.poly.ex2.model.vo.KH;
import edu.kh.poly.ex2.model.vo.LSYCalculator;


public class AbstractionService {

	
	public void ex1() {
		
		
		//추상 클래스는 정말로 객체 생성이 안 될까?
		
		
		//Animal a = new Animal(); 
		//에러: Cannot instantiate the type Animal
		
		
		//Animal을 상속 받은 자식 클래스를 이용해서 객체를 생성해야 한다.
		
		Fish f1 = new Fish();
		f1.setType("어류");		//자식 객체에 부모 부분이 있음을 확인할 수 있다.
		f1.breath();			
		
		
		
		Person p1 = new Person();
		p1.setType("포유류");		//자식 객체에 부모 부분이 있음을 확인할 수 있다.
		
		//추상 클래스는 부모 타입의 참조 변수로 사용할 수 있다!
		// -> 다형성의 업 캐스팅
		
		Animal a1 = new Fish();
		Animal a2 = new Person();	//업캐스팅 확인
		
		//추상 메서드였던 breath() 호출 가능 여부도 확인해보겠다.
		
		a1.breath();
		a2.breath();
		//실행 전에는 Animal의 breath()와 연결된 것으로 보임
		//void edu.kh.poly.ex2.model.vo.Animal.breath()
		//실행 중에는 오버라이딩한 자식의 breath()로 연결됨(동적 바인딩)
		//-> 동적 바인딩에 의해 정상 수행될 것을 알기 때문에 에러가 나지 않는다.
		
		
	//객체 배열 + 추상 클래스
		
		Animal[] arr = new Animal[3]; //Animal 참조 변수 3개 묶음
		
		
		arr[0] = new Person();
		arr[1] = new Person();
		arr[2] = new Fish();
		
		System.out.println("------------");
		//arr[i] 인덱스에 어떤 Animal 자식 객체가 있는지는 모르지만
		//다들 강제 오버라이딩한 breath()라는 공통적인 메서드를
		//가지고 있으므로, arr[i].breath(); 작성 가능
		
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			arr[i].breath();
			
		}
		
		
	}
	
	public void ex2() {
		
		//인터페이스는 미완성 메서드로만 이루어져 있어서, 직접 객체 생성이 불가능하다.
		//KH k1 = new KH();
		
		
		//상속받은 자식 클래스를 이용해서 생성한다.
		HSH sh1 = new HSH();
		HGD gd1 = new HGD();
		
		sh1.lesson();
		gd1.lesson();
		
		
		//클래스, 추상 클래스를 상속한 자식 객체는
		//내부에 부모 객체를 포함하고 있으나, 
		//인터페이스를 상속한 자식 객체는
		//부모 객체를 포함하지 않는다.
		
		//인터페이스 + 다형성 + 동적 바인딩
		KH[] arr = new KH[2];
		
		arr[0] = new HSH(); //업캐스팅
		arr[1] = new HGD(); //업캐스팅
		//부모 타입 참조 변수 = 자식 객체를 대입;
		//부모 : KH 인터페이스 == 인터페이스도 부모 참조 변수로 사용이 가능하다.
		
		for(int i = 0 ;i<arr.length;i++) {
			
			arr[i].lesson();
			
			//정적 바인딩 : KH.lesson() (추상 메서드)
			//동적 바인딩
			//arr[0] ->HSH.lesson();
			//arr[1] ->HGD.lesson();
		}
		
		
		
	}
	
	
	
	public void ex3() {
		
		Calculator cal = new LSYCalculator(); //이 LSY를 다른이름으로만 바꾸면 다른 자식꺼 바로 교체 됨(장점)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[사칙연산]");
		System.out.print("정수1 :");
		int num1 = sc.nextInt();
		System.out.print("정수2 :");
		int num2 = sc.nextInt();
		
		System.out.println(cal.plus(num1, num2));
		System.out.println(cal.minus(num1, num2));
		System.out.println(cal.multiple(num1, num2));
		

		if (num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");	
		} else {
			System.out.println(cal.divide(num1,num2));
		}
	
		System.out.println("--------------------------");
		System.out.print("반지름 입력 :");
		double r = sc.nextDouble();
		System.out.println("원의 넓이 :"+ cal.areaOfCircle(r));
		
		System.out.println("--------------------------");
		
		System.out.println("[a의 b제곱]");
		
		System.out.print("0 이상의 실수 a 입력 :");
		double a = sc.nextDouble();
		System.out.print("b 입력(정수) :");
		int b = sc.nextInt();
		System.out.println("결과 :" +  cal.pow(a, b));
		
		
	}
	
}
