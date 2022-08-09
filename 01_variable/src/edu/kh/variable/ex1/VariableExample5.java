package edu.kh.variable.ex1;

public class VariableExample5 {

	public static void main(String[] args) {
		
	
		
	//ctrl + alt + 방향키 위 / 아래	
		
	/* 출력 메서드
	 * System.out.print("내용")
	 * -> () 안의 내용 출력 ( 줄바꿈x)
	 * 
	 * System.out.println("내용")
	 *  -> () 안의 내용 출력 ( 줄바꿈o)
	 * 
	 * System.out.printf("내용 + 패턴", 패턴에 들어갈 값)
	  
	 */
		
		System.out.print("aaa\n");
		
		String name = "이수연";
		
		int age = 30;
		
		char gender = '여';
		
		double height = 163.4;
		
		boolean tf = true;
		
		// 이수연님은 30세 여성, 키는ㄴ 163.4cm입니다 (true)
		
		
		System.out.println(name + "님은 " 
							+ age + "세 " 
							+ gender + "성, 키는 " 
							+ height + "cm입니다 (" +tf +")");  // ;전까지를 한 줄로 칩니다.
		
		
		System.out.printf("%s님은 %d세 %c성, 키는 %.1fcm입니다 (%b)\n" , name , age , gender, height, tf );
		
		//%.1f = 소수점 첫째 자리까지
		// \n: 줄바꿈(개행)을 나타내는 탈출(escape)
		
		
		
		
		
		System.out.println("추가");
		
		//주석
		System.out.println("학원에서 추가한 내용");
		
		System.out.println("하나 더 추가");
		
		
		
		
	}
}
