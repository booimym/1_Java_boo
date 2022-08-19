package edu.kh.oop.method.view;

import java.util.Scanner;

import edu.kh.oop.method.model.service.MethodExampleService;

//콘솔에 보여지는 내용을 출력하거나 입력받는 용도의 클래스
public class MethodExampleView {
	
	//클래스 내 어디서든 사용 가능한 Scanner 객체를 생성했다.
	//(지역변수가 아니라 필드로 변경,,, 그래서 {}내에서 위로 올려줌)
	//(캡슐화 원칙에 따라서 private) 
	private Scanner sc = new Scanner(System.in);
	
	private MethodExampleService service = new MethodExampleService();
	
	
	
	//void : 반환값이 없음.
	public void displayMenu() {
		
		
		int input = 0; // 메뉴 번호를 입력 받을 변수
		
		do {
			
			
			System.out.println("------------------------");
			System.out.println("1.매개변수, 리턴값이 없는 메소드");
			System.out.println("2.매개변수 O, 리턴값 X");
			System.out.println("3.매개변수 X, 리턴값 O");
			System.out.println("4.매개변수 O, 리턴값 O");
			System.out.println("0. 종료");
			System.out.println("------------------------");

			System.out.print("메뉴 선택>>>");
			input = sc.nextInt();
			sc.nextLine(); //입력 버퍼 개행문자 제거...
			
			System.out.println();//줄바꿈
			
			switch(input) {
			
			//1이 입력되었을 때, service가 참조하는 객체의 method1() 메서드를 호출함.
			case 1 : service.method1() ; break;
			case 2 : //service.method2(60 ,76 ,88 );; 
				
				menu2(); //현재 객체가 가지고 있는 menu2메서드를 호출한다.
				
				
				break;
			case 3 : String result = service.method3() ;
			//service.method3() => method3() 호출 후 String 값을 반환받음.
			// 그 값을 result 변수에 저장하자.
			
			System.out.println(result); break; 
			case 4 :
				
				menu4();
				
				; break;
			case 0 : System.out.println("프로그램 종료"); break;
			default : System.out.println("잘못 입력하셨습니다.");
			
			}
			
			
		}while(input !=0); // input이 0이면 (false가 나오면서) 반복 종료
		
		
	}
	
	
	//정수 3개를 입력 받고, service.method2()를 호출하는 메서드 작성.
	
	public void menu2() {
		
		System.out.print("입력1 :");
		int input1 = sc.nextInt();
		System.out.print("입력2 :");
		int input2 = sc.nextInt();
		System.out.print("입력3 :");
		int input3 = sc.nextInt();
		
		service.method2(input1, input2, input3); //호출할 때 이름은 중요한 게 아님. 자료형이 중요함.
												//int3개인 
	}

	public void menu4() {
		
		
		System.out.print("정수입력1 :");
		int input1 = sc.nextInt();
		System.out.print("연산자 입력 :");
		String op = sc.next();
		System.out.print("정수입력2 :");
		int input2 = sc.nextInt();
		
		
//		1+2+3
		System.out.printf("%d %s %d = %.1f \n", 
						input1,op,input2,
						service.method4(input1, input2, op));
						//
		
		
		
	}
	
	
	
}
