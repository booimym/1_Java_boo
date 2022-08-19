package edu.kh.oop.method.view;

import java.util.Scanner;

import edu.kh.oop.method.model.service.UserService;
import edu.kh.oop.method.model.vo.User;


//입출력용 클래스
public class UserView {

	private Scanner sc = new Scanner(System.in);
	
	private UserService service = new UserService();
	
	//User 참조변수를 선언함(아직 참조하는 객체가 없다.)
	//회원가입했을 때 참조하게 만들 것임.
	private User user = null; // 회원가입정보를 담고 있는 User 객체 참조
	
	//로그인한 User 객체의 주소를 참조할 변수
	private User loginUser = null;
	//null인 경우 == 로그인 안 했다는 뜻
	//null이 아닌 경우 == (어딘가를 참조하고 있으니까) 로그인o
	
	//메뉴 출력 기능(메서드)
	public void displayMenu() {
		
int input = 0; //메뉴 입력용 변수
		
		do {
			System.out.println("---사용자 기능 메뉴---");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 로그아웃");
			System.out.println("4. 회원 정보 출력");
			System.out.println("5. 회원 정보 수정");
			System.out.println("0. 프로그램 종료");
			
			System.out.println("-------------------");
			
			System.out.print("메뉴 선택 >>");
			input = sc.nextInt();
			sc.nextLine(); //입력 버퍼 개행문자 제거
			
			System.out.println();//줄바꿈
			
			switch(input) {
			
			case 1 : this.signUp(); break;
			case 2 : this.login(); break;
			case 3 : this.logout();break;
			case 4 : printUser(); break;
			case 5 : updateUser(); break;
			case 0 : System.out.println("프로그램을 종료합니다...."); break;
			default : System.out.println("잘못 입력햇슈");
			}
			
			
			
			
		}while(input !=0);
		
	
	}
	
	
	//회원 가입 정보를 입력 받을 메서드를 생성해보겠다.
	
	public void signUp() {
		
		System.out.println("[회원 가입]");
		
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String pw = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이  : ");
		int age = sc.nextInt();
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		
		//회원 가입 서비스 호출
		user =service.signUp(id, pw, name, age, gender); // User객체의 주소가 반환된다.
		
		//필드에 존재하는 user참조변수에 반환된 User객체의 주소를 저장한다.
		//
		
		System.out.println("<회원가입 완료>");
		
		
	}
	
	
	//로그인 화면
	
	public void login() {
		
		System.out.println("[로그인]");
		
		//로그인이 되어 있지 않은 경우 -> 이 때만 아이디 비번 입력 받기를 할 수 있게 함
		if(loginUser != null) {
			
			System.out.println("이미 로그인 상태입니다.");
			
		} else { // loginUser == null(로그인 x)
			
			System.out.print("아이디 : ");
			String id = sc.next();
			
			System.out.print("비밀번호 : ");
			String pw = sc.next();
			
			int result = service.login(id, pw, user);
			//회원가입 저보를 토대로 로그인서비스를 호출한다.
			//그걸 result(-1,0,1)에 
			
			if(result == -1) {
				
				System.out.println("회원가입 후 시도해주세요");
			}else if (result == 0) {
				
				System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
			} else { //1
				System.out.println("<로그인 성공>");
				loginUser = user; //user변수가 참조하는 객체의 주소를 
//									 loginUser에 대입(얕은 복사)
				
				
				
			}
			
			
		}
		
	}
	
	
	//로그아웃
	public void logout() {
		
		if(loginUser != null) { //로그인이 되어있을 경우,
			
			loginUser = null; // 로그아웃 시키기
			System.out.println("<로그아웃 되었습니다>");
			
		} else { //로그인이 안 된 경우
			
			System.out.println("로그인 후 이용해주세요");
			
			
		}
		
	}
	
	//(로그인되어 있는) 회원 정보 출력
	public void printUser() {
		
		System.out.println("회원 정보 출력");
		if(loginUser != null){ //로그인이 되어있을 경우,
			
			// loginUser가 참조하는 객체에서 getter를 이용해 필드값을 얻어와 출력하면 된다.
			
			System.out.println("아이디 : " + loginUser.getUserId());
			System.out.println("이름 : " + loginUser.getUserName()); 
			System.out.println("나이 : " + loginUser.getUserAge());
		
			String gender = null;
			
			if(loginUser.getUserGender() == 'M'){
				gender = "남성";
			}else {
				gender = "여성";
			}
			
			
			
		} else { //로그인x
			
			System.out.println("로그인 후 이용해주세요.");
			
		}
	}
	
	
	//회원 정보 수정
	public void updateUser() {
		
		System.out.println("[회원 정보 수정]");
		
		if(loginUser != null) {
			
			System.out.print("수정할 이름 :");
			String name = sc.next();
			System.out.print("수정할 나이 :");
			int age = sc.nextInt();
			System.out.print("수정할 성별 :");
			char gender = sc.next().charAt(0);
			
			service.updateUser(name,age,gender,loginUser);
			
			System.out.println("회원정보가 수정되었습니다.");
		
		}
		
		if(loginUser != null) { //로그인 o
			
		} else { //로그인 x
			System.out.println("로그인 후 이용해주세요");
		}
		
	}
	
	
	
	
	
}
