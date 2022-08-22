package edu.kh.objectarray.model.vo;


//값 저장용 클래스
//-> 객체로 만들어진 후 값을 저장하는 용도의 객체로 사용한다.(데이터 관리)
public class Student {

// 필드	
 private int grade; //학년
 private int classRoom; //반
 private int number; //번호
 private String name; //이름
 
 private int kor; //국어 점수
 private int eng; //영어 점수
 private int math;//수학 점수
 
 
 //기본 생성자 
 public Student() {}
 
 //매개변수 생성자
// (오버로딩~~)
 public Student(int grade,int classRoom,int number,String name) {

	 //this참조변수: 숨겨져있는 자기꺼 참조하는 변수
	 //대입하는 오른쪽 값은 가까운 거
	 this.grade = grade;
	 this.classRoom = classRoom;
	 this.number = number;
	 this.name = name;
 }


 public Student(int grade,int classRoom,int number,String name,
		 		int kor,int eng,int math) {
	 
	//this참조변수: 숨겨져있는 자기꺼 참조하는 변수
	//대입하는 오른쪽 값은 가까운 거
	 
	 //중복없애기(this 생성자)
	 this(grade,classRoom,number,name);
	 
	 this.kor = kor;
	 this.eng = eng;
	 this.math = math;
	 
 }
 
 //getter / setter
 //get : 여기서 얻어가는 겨(return해줄게) 
 
 public int getGrade() { //얻어가는 자료형이 int라서 int라고 자료형을 쓰는 거임.
	 
	 return grade; //반환형
 }
 
 //외부에서 들어온 걸, 여기에 세팅할겨 (반환하는 거 없으니 void)
 public void setGrade(int grade) {
	 
	 this.grade = grade; //현재 grade(this)에다가 매개변수로 가져온 grade값을 대입할게
	
 }
 
 public String getName() {
	 
	 return name;
 }
 
 public void setName(String name) {
	 
	 this.name = name;
 }
	//alt + (shift) + s 또는 위에 Source 메뉴
 	// -> r(Generate Getters and Setters...)

 //------------------------------------------------------//
public int getClassRoom() {
	return classRoom;
}

public void setClassRoom(int classRoom) {
	this.classRoom = classRoom;
}

public int getNumber() {
	return number;
}

public void setNumber(int number) {
	this.number = number;
}

public int getKor() {
	return kor;
}

public void setKor(int kor) {
	this.kor = kor;
}

public int getEng() {
	return eng;
}

public void setEng(int eng) {
	this.eng = eng;
}

public int getMath() {
	return math;
}

public void setMath(int math) {
	this.math = math;
}
 
 
 
 
}
