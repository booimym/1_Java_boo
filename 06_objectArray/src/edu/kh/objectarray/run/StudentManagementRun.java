package edu.kh.objectarray.run;

import edu.kh.objectarray.view.StudentManageView;

//실행용 클래스
public class StudentManagementRun {

	public static void main(String[] args) {
	
		
//		StudentManageView view = new StudentManageView();
//		view.displayMenu();
		//이 방식은 변수를 1번만 쓰는 거니까 아깝
		
		new StudentManageView().displayMenu();
		//객체 생성함 -> 참조할 주소가 반환되었다는 뜻 -> 바로 메서드 호출
		// == 객체 1회성으로만 사용함
		
		// ** Heap 영역에 생성된 객체를 
		// 	  어떤 참조 변수도 참조하지 않으면(==더이상 안쓰는 거니까)
		// (GC-Garbage collector)에 의해서 Heap영역에서 지워지게 된다 - java특징인 자동 메모리 관리    
		
		
		
		
		
	}
}
