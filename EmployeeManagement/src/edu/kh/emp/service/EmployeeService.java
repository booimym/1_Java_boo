package edu.kh.emp.service;

import edu.kh.emp.model.vo.Employee;

public class EmployeeService {
	
	
	private Employee[] emp = new Employee[4];
	
	 
	 
	public EmployeeService() {
		
		emp[0]= new Employee(1,"가부장","641010","aaa@naver.com","1234","재무","부장",100);
		emp[1]= new Employee(2,"나대리","880101","bbb@naver.com","5678","재무","대리",50);
		emp[2]= new Employee(3,"다사원","930203","ccc@naver.com","9012","재무","사원",20);
		
		
		
		
	}

	public int addEmployee(int empId, String name, String email, String phone, 
							String departmentTitle, String jobname) {
		
		
		int idx = -1;
		for(int i = 0 ; i < emp.length ; i++) {
			
			if(emp[i] == null) {
				
				idx = i;
				
				break; //이거 위치 머가 중요한데? 왜 밖에 안됨?
				
			}
			
		}
		
		if(idx == -1) {
			return 0;
		}
		emp[idx] = new Employee(empId, name, email, phone, departmentTitle, jobname);
		return 1;
	}
	
	
	public Employee[] getEmp() {
		
		return emp;
	}
	
//	public void selectEmployee(int empId) {
//		
//		Employee[] resultArr = new Employee[emp.length];
//		
//		if(emp[i].getEmpName().equals(empId)) {
//			
//			
//		}
//		
//	}
	
}
