package edu.kh.collection.model.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import edu.kh.collection.model.vo.Student;

public class MapService {

	/*
	 * Map : key와 Value 한 쌍이 데이터가 되어 이를 모아둔 객체
	 * 
	 * - key : Map에 저장된 데이터를 구분하는 용도
	 * 		 	-> set의 특징을 지님.
	 *            (순서 x 중복허용 x equals(),hashCode() 오버라이징이 필요함.)
	 *            
	 * -value: Map에 실제 저장된 값을 의미함.
	 * 			-> List의 특징을 지님( 중복 허용 o)
	 * 

	 */
	
	public void ex1() {
		
		
		Map<Integer,String>  map = new HashMap<Integer,String>();
		
		
		//Map.put(key, value) : Map에 추가
		map.put(1, "가길동");
		map.put(2, "나길동");
		map.put(3, "다길동");
		map.put(4, "라길동");
		map.put(5, "마길동");
		map.put(6, "바길동");
		
		
		//key 중복 -> 덮어쓰기
		map.put(1, "홍홍홍");
		
		//value 중복
		map.put(6, "최길동");
		
		System.out.println(map.toString()); //map은 참조형임. 자동으로 to.String붙음
	}
	
	public void ex2() {
		
		//Map은 언제 사용하면 좋아?
		
		//1) 재사용이 적은 VO를 대체하는 경우
		//2) 한번에 다량의 데이터를 전달하는 경우
		//   데이터의 명확한 구분을 위해서 사용함.
		
		
		//Student를 Map으로 변경해서 사용
		
		Map<String, Object> student = new HashMap<String,Object>();
		Student std = new Student();
		
		
		//값 추가
		std.setName("홍길동");
		student.put("name","홍길동"); //map
		//값 추가
		std.setAge(15);
		student.put("age",15); //map
		//값 추가
		std.setAddress("서울시");
		student.put("address","서울시"); //map
		//값 추가
		std.setGender('남');
		student.put("gender",'남'); //map
		//값 추가
		std.setScore(100);
		student.put("score",100); //map
		
		System.out.println(std);
		System.out.println(student);
		
		//value 각각 얻어와서 출력하기
		//std
		//vo는 이렇게 쓸 수밖에 없음. 물론 Map도 이렇게 쓸 순 있음 ㅋ
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getAddress());
		System.out.println(std.getGender());
		System.out.println(std.getScore());
		
		System.out.println("-------------");
		
		// student(map)
		
		
		//keySet() : map에서 key부분만을 추출하여 set형태로 반환하는 것
		
		for(String key : student.keySet()) System.out.println(student.get(key));
						//set<String>형태로 반환될 것임.
		
				//{} 안묶는 경우, 문장 한 줄에만 영향을 미칠 때 중괄호를 쓰지 않는다.
		
		//for/while/if문 작성시, {}이 없다면,
		//다음 한 줄(다음 세미콜론까지)에만 영향을 미친다.
		
	
	}
	
	
	public void ex3() {
		
		//제네릭 안에 제네릭이 있을 때, 
		Map< String, Set<Integer> > map = new TreeMap<>();
		//타입 추론 : 참조변수의 제네릭을 보고 생성되는 컬렉션 객체의 제네릭을 추측함.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("횟수 입력 : ");
		int count = sc.nextInt();
		
		for( int i = 1; i <=count ; i++) {
			
			//TreeSet을 이용해서 로또번호생성하기
			Set<Integer> lotto = new TreeSet<>();
			
			while(lotto.size() < 6) {
				
				int ran = (int)(Math.random() * 45 + 1); //1~45 난수
				

				lotto.add(ran);
			}
			
			map.put(i+"회", lotto);
		}
		
		//출력
		for( String key : map.keySet()) {
			
			System.out.println(key + " : " + map.get(key));
		}
		
		
	}
}
