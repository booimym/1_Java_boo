package boo.practice;

public class StringBuffer_Builder_practice {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("돌고래는");
		
		sb.append(" 초등학교 1학년 2반 8번이다.");
		
		System.out.println(sb.toString());
		
		sb.insert(17,"1"); //17번째 '뒤'에 문자열을 삽입한다.
		
		System.out.println(sb.toString());
		
		sb.setCharAt(17, '2'); //17번째 '뒤'의 문자를 변경한다.(int형, char형) 한 글자만 변경 가능
		
		System.out.println(sb.toString());
		
		sb.replace(0, 3, "토끼"); //0번째 문자 '뒤'부터 3번째 문자까지를 "토끼"문자열로 대치한다.
		
		System.out.println(sb.toString());
		
		sb.delete(15,19); //15번째 문자의 '뒤'부터 19번까지의 문자를 삭제한다.
		
		System.out.println(sb.toString());
		
		sb.deleteCharAt(17); //17번째 문자 '뒤'를 삭제
		
		System.out.println(sb.toString());
		
		System.out.println(sb.length());
		
		sb.reverse();
		
		System.out.println(sb.toString());
		
		

	}

}
