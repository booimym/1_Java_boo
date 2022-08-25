package edu.kh.collection.model.service;

import java.util.ArrayList;
import java.util.List;

import edu.kh.collection.model.vo.Student;

public class StudentService {
	
			//부모타입 참조변수 List(업캐스팅ing)
	private List<Student> stdList = new ArrayList<Student>(); //list는 객체생성은 못하지만 arraylist참조변수 가능
															//Student 타입으로 제한된 ArrayList객체 생성

	
	
	public StudentService() {
		
		stdList.add(new Student("홍길동",18,"서울시 강남구",'M',80));
		stdList.add(new Student("김길동",19,"서울시 마포구",'M',70));
		stdList.add(new Student("이길동",12,"서울시 강남구",'M',60));
	
	
	
	
	
	}
	
	/**
	 * @param name
	 * @param age
	 * @param address
	 * @param gender
	 * @param score
	 * @return
	 * true  : 학생 정보 추가 성공 시
	 * false : 학생 정보 추가 실패 시
	 */
	public boolean addStudent(String name, String age, String address, char gender, int score) {
		
		
		
		//제네릭 확인 테스트
		
//		List test1 = new ArrayList();
//		List<String> test2 = new ArrayList<String>();	//타입 제한됨
//		List<Integer> test3 = new ArrayList<Integer>(); //타입 제한됨.
//		
		
		//List.add(E e)		=> 제네릭 <E>에 작성되는 타입으로 모든 <E>가 변화함.
		
		//test1.add(Object e) => ArrayList가 object 배열같은 거니까 / 타입 제한 x &  모든 참조변수가 object타입
		
		//test2.add(String e) -> 타입 제한 o, 모든 참조 변수가 String 타입
		
		//test3.add(Integer e) -> 타입 제한 o, 모든 참조 변수가 Integer 타입
		
		
		Student std = new Student(name, gender, address, gender, score);

		//boolean add(Student e) -> add()결과로 boolean이 반환이 된다.
		return stdList.add(std);
		
		
		
		
	}
	
	
	/**
	 * @return
	 */
	public List<Student >getStdList() {
		return stdList;
	}
	
	/**
	 * @param idx
	 * @param address
	 * @param score
	 * @return
	 * true :	인덱스가 일치하는 학생 정보 수정 성공시 
	 * false :	인덱스가 일치하는 학생이 없을 경우
	 */
	public boolean updateStudent(int idx, String address, int score) {
		
		
		//입력 받은 idx가 stdList에 실제 존재하는 요소의 인덱스 범위를 넘어선 경우
		if(idx<0 || idx >= stdList.size()) {
		return false;
		
		} else {
			
			
			stdList.get(idx).setAddress(address);
			stdList.get(idx).setScore(score);
			
			return true;
		}
	}

	public Student removeStudent(int idx) {
		
		//일치하는 인덱스가 있으면
		//해당 학생 정보를 stdList에서 제거하고
		//제거된 학생 정보를 반환
		
		//일치하는 인덱스가 없다면 null반환
		
		if(idx<0 || idx >= stdList.size()) {
			
			return null;
			
			} else {
				
				//리스트에서 제거된 요소를 반환
				return stdList.remove(idx);
				
				
			}
	}

	/**일치하는 이름 검색
	 * @param name
	 * @return
	 */
	public List<Student> selectStudent1(String name) {
		
		List<Student> resultList = new ArrayList<Student>();
		
		//향상된 for문
		for(Student s : stdList ) {
			
			if(s.getName().equals(name)) { //검색한 이름과, 학생 이름이 같은 경우
				
				resultList.add(s); //s가 참조하고 있는 것을 resultlist로 추가하겠다.
				
				
			}
			
			
		}
		
		
		
		return resultList;
	}
	
	
	
	/**포함하는 이름검색
	 * @param name
	 * @return
	 */
	public List<Student> selectStudent2(String name) {
		
		List<Student> resultList = new ArrayList<Student>();
		
		//향상된 for문
		for(Student s : stdList ) {
			
			
			
			if(s.getName().contains(name)) { //검색한 이름이 학생 이름에 포함되어 있는 경우
				//String.contains(값)
				// -문자열에 값이 포함되어있으면 true
				
				resultList.add(s); //s가 참조하고 있는 것을 resultlist로 추가하겠다.
				
				
			}
			
			
		}
		
		
		
		return resultList;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
