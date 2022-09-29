package edu.kh.emp.view;


import java.util.Scanner;

import edu.kh.emp.model.vo.Employee;
import edu.kh.emp.service.EmployeeService;

public class EmployeeView {

	
	Scanner sc = new Scanner(System.in);
	EmployeeService service = new EmployeeService();
	
	
	
	public void display() {
		
		int input = 0;
		
		do {
		System.out.print("번호 입력 :");
		input = sc.nextInt();
		
		switch(input) {
		
		case 1 : addEmployee();break;
		case 2 : printAll(); break;
		case 3 : break;
		case 4 : break;
		case 5 : break;
		case 6 : break;
		case 7 : break;
		case 8 : break;
		default: break;
		}
		
		System.out.println("1. 새로운 사원 정보 추가");
		
		System.out.println("2. 전체 사원 정보 조회");
		
		System.out.println("3. 사번이 일치하는 사원 정보 조회");
		
		System.out.println("4. 사번이 일치하는 사원 정보 수정");
		
		System.out.println("5. 사번이 일치하는 사원 정보 삭제");
		
		System.out.println("6. 입력 받은 부서와 일치하는 모든 사원 정보 조회");
		
		System.out.println("7. 입력 받은 급여 이상을 받는 모든 사원 정보 조회");
		
		System.out.println("8. 부서별 급여 합 전체 조회");
		
		System.out.println("0. 프로그램 종료");
		
		}while(input != 0 );
	}

	public void addEmployee() {
		
		System.out.print("사원 번호 :");
		int empId = sc.nextInt();
		System.out.print("이름 :");
		String name = sc.next();
		System.out.print("이메일 :");
		String email = sc.next();
		System.out.print("전화번호 :");
		String phone = sc.next();
		System.out.print("부서명 :");
		String departmentTitle = sc.next();
		System.out.print("직급명 :");
		String jobname = sc.next();
		
		int result = service.addEmployee(empId, name, email, phone, departmentTitle, jobname);
		
		if (result == 1) {
			System.out.println("추가 완료");
		}else {
			System.out.println("자리 없음");
		}

	}

	public void printAll() {
		
		// 사원번호 이름  이메일  전화번호 부서명  직급명  급여
		//-------------------------------------------
		
		Employee[] emp2 = service.getEmp();
		
		for(int i = 0 ; i < emp2.length ; i++) {
			
			if( emp2 [i] == null) {
				break;
			}
			
			System.out.printf("%d,%s,%s,%s,%s,%s,%d\n",
								 emp2[i].getEmpId(),
								 emp2[i].getEmpName(),
//								2 emp2[i].getEmpNo(),
								 emp2[i].getEmail(),
								 emp2[i].getPhone(),
								 emp2[i].getDepartmentTitle(),
								 emp2[i].getJobName(),
								 emp2[i].getSalary());
								 
								
		}
		
		
		
		
	}

//public void selectEmployee() {
//		
//		System.out.print("사번 입력 : ");
//		int input = sc.nextInt();
//		
//		service.selectEmployee(input);
//		
//	}
	
}
