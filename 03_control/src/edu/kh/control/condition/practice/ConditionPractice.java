package edu.kh.control.condition.practice;

import java.util.Scanner;

public class ConditionPractice {


	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요. : ");
		int input = sc. nextInt();
		
		if (input>0) {
			
			if(input%2 == 0 ) {
				System.out.println("짝수입니다");
				
			}else {
				System.out.println("홀수입니다");
				
			} 
		}else {
				System.out.println("양수만 입력해주세요");
				
			}
			
		}
		
		
		// 강의 point
		// 입력받은 수가 양수일 경우에만, 짝/홀 구분하면 됨.
	
	//다른 방법 (범위를 이용해보세요)
	
//	if (input<=0) {
//		result = "양수만";
//		
//	} else if(input %2 ==0 ) {
//		result = "짝수";
//	} else {
//		result = "홀수";
//	}
	
	
	
	
	public void practice2() {
		
			Scanner sc = new Scanner(System.in);
			System.out.print("국어 : " );
			int kor = sc.nextInt();
			System.out.print("수학 : " );
			int math = sc.nextInt();
			System.out.print("영어 : " );
			int eng = sc.nextInt();
			
			int sum = (kor + math + eng);
			double avg = sum / 3.0 ;
			// int / int 해버리면 값이 int가 나오니까 소숫점을 못 나타냄.
			// 방법1 (double)sum -> 강제 형변환 해버리기
			// 방법2 (double)3 -> 강제 형변환 해버리기
			// 방법3 3 -> 3.0
			
			
			
			
			if (kor>=40 && math >=40 && eng >=40 && avg >=60) { //합격
				System.out.println("국어 : " + kor);
				System.out.println("수학 : " + math);
				System.out.println("영어 : " + eng);
				System.out.println("합계 : " + sum);
				System.out.println("평균 : " + avg);
				System.out.println("축하합니다, 합격입니다!");
			} else { //불합격
				
				System.out.println("불합격입니다.");
					
			}
					

		}
	
	//강의 point
	
	
	
	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc. nextInt();
		int result;
		
//		if (month>12 && month<1) {
//			switch (input%2) {
//			
//			case 1 : 
//				if (month<=7) {
//				result = 31 ; 	
//				} else {
//					result = 30  ; 
//				};break;
//			case 2 : 
//				if(month<=6) {
//					if(month ==2) {
//						result = 28;
//					} else {
//						result = 30; 
//						
//					}
//				}else {
//						result = 31; 
//					};break;
//				}
//		} else {
//			
//		}
		
		
		// 강의
		
		switch(month) {
		
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month + "월은 31일 까지 있습니다.");break;
		case 2:case 4:case 6:case 9:case 11:
			System.out.println(month + "월은 30일 까지 있습니다.");break;
			default: System.out.println(month + "월은 잘못 입력된 달입니다.");break;
		
		}
		
		
	}	
		
			
			
			
		
		
		
	
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double BMI = weight / (height * height);
		System.out.println("BMI지수 : " + BMI );
		
		if (BMI < 18.5) {
			System.out.println("저체중");
		} else if (BMI < 23) {
			System.out.println("정상체중");
		} else if (BMI < 25) {
			System.out.println("과체중");
		} else if (BMI < 30) {
			System.out.println("비만");
		} else {
			System.out.println("고도비만");
			
		}
		
		// print구문 자주 쓰는 거 느려짐. result변수 지정해서 쓰자.
		
		
	}
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수(20) : ");
		double midd = sc.nextInt(); //int로 입력 받아도 대입 연산 시 double 자동 형변환
		System.out.print("기말 고사 점수(30) : ");
		double finall = sc.nextInt();
		System.out.print("과제 점수(30) : ");
		double assign = sc.nextInt();
		System.out.print("출석 점수(20) : ");
		double num = sc.nextInt();
		
		//각각의 점수를 비율에 맞게 변경하는 작업을 해보자.
		//재활용할 거야.
		//midd = midd * 0.2 이렇게...
		//midd *=0.2;를 쓰면 훨씬 간단하지
	
		midd *=0.2;
		finall *=0.3;
		assign *=0.3;
		//20회에다가 *5를 해서 100기준으로 만들고, 0.2를 곱해 =1이니까 따로 재정의 안해도 됨.
		
		
		
		
		
		
		
		
		//70퍼이상 출석 시
		
		// ---------내방법---------------		
//		
//		if (sum >= 70 && num >= 14) {
//			System.out.println("=========결과==========");
//			System.out.println("중간 고사 점수(20) : " + midd );
//			System.out.println("기말 고사 점수(30) : " + finall );
//			System.out.println("과제 점수(30) : " + assign );
//			System.out.println("출석 점수(20) : " + num);
//			System.out.println("총점 : " + sum);
//			System.out.println("Pass");
//			
//		} else if (sum <70 && num >= 14) {
//			System.out.println("=========결과==========");
//			System.out.println("중간 고사 점수(20) : " + midd );
//			System.out.println("기말 고사 점수(30) : " + finall );
//			System.out.println("과제 점수(30) : " + assign);
//			System.out.println("출석 점수(20) : " + num);
//			System.out.println("총점 : " + sum);
//			System.out.println("Fail [점수 미달]");
//		
//		} else  {
//			System.out.println("=========결과==========");
//			System.out.println("Fail [출석 횟수 부족 (" + num + "/20)]");			
//		}

		//---------강의--------------
		
		if (num <= 14 ) { //14이하 출석했을 경우 = 6번 이상 결석 
			System.out.println("[출석 횟수 부족] (" +(int) num + "/20)" );
												// 강제 형변환해서 소수점 버림 처리 해야됨.
		} else { //출석은 만족한 경우
			System.out.println("=========결과==========");
			System.out.printf("중간 고사 점수(20) : %.1f \n", midd);
			System.out.printf("기말 고사 점수(30) : %.1f \n", finall);
			System.out.printf("과제 점수(30) : %.1f \n", assign);
			System.out.printf("출석 점수(20) : %.1f \n", num);
			System.out.printf("중간 고사 점수(20) : %.1f \n", midd);
			double sum = (midd  + finall  + assign  + num);
			System.out.printf("총점 : %.1f \n", sum);
			
			if((sum>=70.0)) {
				
				System.out.println("PASS");
			} else {
				System.out.println("Faill [점수 미달]");
				
			}
			
			
			
			
		}
		
		

		System.out.println("한 번 더");
		
	}
	
	
}
