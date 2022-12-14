package edu.kh.oop.method.model.service;

import edu.kh.oop.method.model.vo.User;

public class UserService {

	
	//회원가입 서비스 메서드
	
	//반환형이 클래스명(User)임. 
	// ==반환되는 값이 해당 클래스를 이용해서 만들어진 객체의 주소 값.
	
	
	public User signUp(String userId, String userPw, String userName,
				int userAge, char userGender) {
		
		//기본 생성자를 이용하여 User객체를 생성
		User u = new User();
		
		
		//setter를 이용해서 매개변수로 전달받은 값을 세팅
		
		u.setUserId(userId);
		u.setUserPw(userPw);
		u.setUserName(userName);
		u.setUserAge(userAge);
		u.setUserGender(userGender);
		
		
		return u; //u는 객체의 시작 주소를 참조하고 있음.
				// 즉, User객체의 시작 주소를 반환하는 거임.
	
	}
	
	//로그인 Service
	
	
	//반환형을 int로 한다.
	public int login(String id, String pw,User user) {
										//가입한 회원정보도 가지고 와야 됨.
					// 입력된 id,pw & 가입된 회원 정보를 가지고 있는 객체의 주소
		
		//회원 가입을 안 하고 로그인을 시도하는 경우
		if(user == null) {
			
			return -1; //
			
			
		} else {
			//id와 pw를 비교해보자
			if(user.getUserId().equals(id) && user.getUserPw().equals(pw)) {
				
				//아이디와 비번이 같음 -> 로그인 성공!
				return 1;
			} else { 
				//하나라도 다름 == 로그인 실패
				return 0;
			}
			
		}
		
		
		
	}
	
	
	//회원 정보 수정 Service
	
		//반환하는 거 없으니까 void
	public void updateUser(String name, int age, char gender, User loginUser2) {
		
		loginUser2.setUserName(name);
		loginUser2.setUserAge(age);
		loginUser2.setUserGender(gender);
		
		
	}
	
}
