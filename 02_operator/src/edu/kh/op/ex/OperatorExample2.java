package edu.kh.op.ex;

public class OperatorExample2 {

	public static void main(String[] args) {
		
		// 증감 연산자 : ++ , --
		
		// -> 피연산자를 1 증가 또는 감소시키는 연산자 
		
		//전위 연산 : ++a , --a
		// -> a를 먼저 1 증가시키고 다른 연산을 수행한다.
		
		//후위 연산 : a++ , a--
		// -> 다른 연산을 먼저 다 수행한 후 마지막에 a를 1 증가/감소시킨다.
		
		
		int num1 = 10;
		int num2 = 10;
		
		num1++; //11
		num2--; //9
		
		System.out.println("num1++ : " + num1); //11
		System.out.println("num2-- : " + num2); //9
		
		
		System.out.println("------------------------------------------------------------------------------");
		
		
		//전위 연산
		System.out.println("++num1 + 10 : " + (++num1 + 10)); 
		
							// ++num1 : 12 + 10 = 22
		
		System.out.println("num1 : " + num1 );//12
		
		// 후위 연산 (9와 10을 먼저 더한다음 --를 하는 거임)
		
		System.out.println("num2-- + 10 : " + (num2-- + 10 )); //19
		System.out.println("num2 : " + num2); //8 (후위연산이니까 마지막에 연산됨)
		
		//연습문제
		int a = 3;
		int b = 5;
		int c = a++ + --b;
		
		//최종적으로 a,b,c는 각각 얼마인가? 
		//a는 후위연산
		//b는 전위연산
		//c는 3++(a) + --5(b)
		//c는 3++(a) + 4(b)
		//c는 7
		//a는 마지막에 연산 = 4
		
		
		
		System.out.printf("a = %d, b = %d, c= %d \n", a,b,c);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
