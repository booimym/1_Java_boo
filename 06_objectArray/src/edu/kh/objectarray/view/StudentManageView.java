package edu.kh.objectarray.view;

import java.util.Scanner;

import edu.kh.objectarray.model.service.StudentManagementService;
import edu.kh.objectarray.model.vo.Student;

//화면 제공용 클래스(입/출력 담당)
public class StudentManageView {
	
	//필드 == 멤버변수
	private Scanner sc = new Scanner(System.in);
	
	private StudentManagementService service = new StudentManagementService();
	
	//(커서 가져다 놓고) alt + shift + j : 툴팁용 주석
	
	/** 
	 * 메뉴 출력용 메서드
	 */
	public void displayMenu() {
		
		
	int input = 0; //메뉴 선택용 변수
	
	do {
		
		
		System.out.println("-----[학생 관리 프로그램]-----");
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 전체 정보 조회");
		System.out.println("3. 학생 1명 정보 조회(인텍스)");
		System.out.println("4. 학생 정보 조회(이름 검색) ");
		System.out.println("5. 학생 정보 수정(인덱스)");
		System.out.println("0. 종료");	
		System.out.println("-------------------------");
		
		System.out.print("메뉴 선택>> ");
		input = sc.nextInt();
		sc.nextLine();
		
		System.out.println(); //줄 바꿈
		
		switch (input) {
		
		case 1 : addStudent(); break;
		case 2 : printAll(); break;
		case 3 : selectIndex();break;
		case 4 : selectName() ;break;
		case 5 : updateStudent(); break;
		case 0 : System.out.println("프로그램을 종료합니다.");break;
		default : System.out.println("잘못 입력하셨습니다.");
		
		}
		
		System.out.println();
		
		
	} while(input != 0);  //줄 바꿈
		
	}
	
	
	/**
	 * 추가할 학생 정보 입력용 메서드
	 */
	public void addStudent() {
		
		System.out.println("[학생 추가]");
		
	System.out.print("학년 :");
	int grade = sc.nextInt();
	
	System.out.print("반 :");
	
	int classRoom = sc.nextInt();
	System.out.print("번호 :");
	
	int number = sc.nextInt();
	System.out.print("이름 :");
	String name = sc.next();
	
	//학생 추가 서비스 메서드 호출(서비스 class에 있는 addStudent가 호출된다)
	int result = service.addStudent(grade, classRoom, number, name);  //?
	
	if(result == 0 ) {
		System.out.println("더 이상 학생을 추가할 수 없습니다.");
	} else {
		System.out.println("학생 정보가 추가되었습니다.");
	}
	
	
	}
	
	/**
	 * 학생 정보를 모두 출력하는 메소드
	 */
	public void printAll() {
		
		System.out.println("[학생 전체 정보 조회]");
		
		
		// |  학년  |  반  |  번호  |  이름  |  국어  |  영어  |  수학  | (항상 위에 있어야 되니까, println으로)
		
		// ------------------------------------------------------ (항상 위에 있어야 되니까, println으로)
		
		// |   3  |  5  |   17  | 홍길동  |  100  |   30  |  70  |
		//   3  |  5  |   17  | 홍길동  |  100  |   30  |  70  |
		//   3  |  5  |   17  | 홍길동  |  100  |   30  |  70  |
		//   3  |  5  |   17  | 홍길동  |  100  |   30  |  70  |
		
		
		System.out.println("|  학년  |  반  |  번호  |  이름  |  국어  |  영어  |  수학  |");
		System.out.println("------------------------------------------------------");
		
		//학생정보 => stdArr
		
		// 서비스 객체 필드에 존재하는 stdArr의 값(Student[] 참조 주소)를 얻어와 대입
		// == 얕은 복사
		Student[] stdArr = service.getStdArr();
		
		for(int i = 0 ; i <stdArr.length ; i++) {
			
			if(stdArr[i] == null) { //Student 객체를 참조하지 않는 인덱스가 있을 경우,
				break; 				// 반복문을 종료시킨다.
			} 
		
			System.out.printf("|   %2d  |  %2d  |   %2d  | %3s  |  %3d  |   %3d  |  %3d  |\n",
								stdArr[i].getGrade(),stdArr[i].getClassRoom(),stdArr[i].getNumber(),
								stdArr[i].getName(),stdArr[i].getKor(),stdArr[i].getEng(),stdArr[i].getMath());
			
		}
		
		
		
		
		
	}

	/**
	 * 학생 1명 정보 조회(인덱스)
	 */
	public void selectIndex() {
		System.out.println("[학생 1명 정보 조회(인덱스)");
		
		System.out.print("인덱스 번호 :");
		int idx = sc.nextInt();
		
		// 학생 1명 조회 서비스 메서드를 호출하겠다!
		
		System.out.println(service.selectIndex(idx)); //view가 출력하는 곳이니깐.. 여기서 출력해야 됑
		
		
	}
	
	/**
	 * 학생 정보(점수) 수정 메서드
	 */
	public void updateStudent() {
		
		System.out.println("[학생 정보 수정(인덱스)]");
		
		System.out.print("인덱스 : ");
		int idx = sc.nextInt();
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("영어 : ");
		int math = sc.nextInt();
		
		//학생 정보 수정 서비스 메서드를 호출 후, 결과를 반환받을 꺼야!
		
		int result = service.updateStudent(idx,kor,eng,math);
		
		if (result == -1) {
			
			System.out.println("입력된 값이 인덱스 범위를 초과했습니다.");
			
		} else if (result == 0) {
			
			System.out.println("해당 인덱스에 학생 정보가 존재하지 않습니다.");
			
		} else {
			
			System.out.println("수정되었습니다.");
		}
		
	}
	
	
	/**
	 * 학생 정보 조회(이름) 메서드
	 */
	public void selectName() {
		
		System.out.println("[학생 정보 조회(이름)]");
		System.out.println("이름 : ");
		String name = sc.next();
		
		
		//학생 정보 조회(이름) 서비스 메서드 호출 후 결과 반환 받는다.
		Student[] resultArr = service.selectName(name);
		
		if(resultArr == null) {
			
			System.out.println("검색 결과가 없습니다.");
			
		} else {
			
			for(int i = 0 ; i<resultArr.length ; i++) {
				
				if(resultArr[i] == null) {
					
					break;
				}
				// 홍길동(3학년 5반 7번)
				System.out.printf("%s (%d학년 %d반 %d번)\n ", resultArr[i].getName(),
						resultArr[i].getGrade(),
						resultArr[i].getClassRoom(),
						resultArr[i].getNumber());
			
			}
			
			
		}
		
		
		
		
	}
}