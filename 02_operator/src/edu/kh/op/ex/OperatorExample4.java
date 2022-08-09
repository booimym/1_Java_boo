package edu.kh.op.ex;

public class OperatorExample4 {

	public static void main(String[] args) {
		
		
		// 논리 연산자 : &&(AND), ||(OR) 
		
		// &&(AND) 연산자 : 둘 다 true이면 true, 나머진 false
		//~와, 그리고(~이고), ~이면서(~면서), ~부터 ~까지, ~사이

		
		int a = 101;
		
		//a는 100 이상이면서 짝수인가?
		
		boolean result1 = a >= 100 ; //a는 100이상인가? true
		boolean result2 = a % 2 == 0 ; //a는 짝수인가? false
		
		System.out.println("a는 100 이상이면서 짝수인가? " + (result1 && result2) ); // +가 &&보다 우선순위가 먼저 있기 때문에, 에러가 난다. String과 boolean 더해짐.(  result1 && result2 ) 해줘야해.
		
		 
		int b = 5;
		
		// b는 1부터 10 사이의 정수인가? 
		
		//boolean result3 = 1 <= b <=10 ; 이렇게 쓰면 에러남. 컴퓨터는 두 개의 연산을 한번에 못해..... 1<=b는 true 이고, true <= 10이 되니까 에러남.
		
		
		
		
		boolean result3 = 1<= b  ; //b는 1 이상인가? 			//true
		boolean result4 = b <= 10 ;  //b는 10 이하인가? 		//true
		
		System.out.println("b는 1부터 10 사이의 정수인가? " + (result3 && result4) ); //true
		
		
		
				
		// ||(OR) 연산자 :  둘 다 false이면 false, 나머진 true
		// 또는 , ~거나(~이거나), 
		
		int c = 10;
		
		// c는 홀수이거나 10을 초과한 숫자인가?
		
		System.out.print("c는 홀수이거나 10을 초과한 숫자인가? : ") ;
		System.out.println( (c%2 ==1) || (c>10));
				
		
		int d = 20;
		
		
		// d는 1부터 100 사이 숫자 또는 음수인가?
		
		boolean result5 = 1<= d && d<=100 || d <0 ; // ( true and true = true ) or false = true 임 
		//헷갈리면 괄호치기 (1<= d && d<=100) || (d <0) ; 
		
		System.out.println(result5);
	
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		
		//논리 부정 연산자 : ! (NOT)
		//논리 값을 반대로 바꾸는 연산자
		
		
		
		System.out.println("!result5 : " + !result5); // !true -> false
		
		int e = 3;
		
		
		boolean result6 = e  >= 1 && e <5; //e는 1이상이고 5미만인가? true
		
		
		
		
		// 반대 :  e는 1미만이거나 5이상인가?
		boolean result7 = 1> e || 5<= e ;
		
		//반대를 논리부정을 이용하면 쉽다.
		
		System.out.println(!result6 == result7);
		// result6의 반대가 result 7과 같은가?
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
