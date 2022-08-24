package edu.kh.poly.ex2.model.vo;

import edu.kh.poly.model.vo.Calculator;

public class LSYCalculator implements Calculator {

	@Override
	public int plus(int num1, int num2) {
		
		int result = num1 + num2;
		return result;
	}

	@Override
	public int minus(int num1, int num2) {
		
		int result = num1 - num2;
		return result;
	}

	@Override
	public int multiple(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}

	@Override
	public double divide(int num1, int num2) {
		double result = num1 / num2;
		return result;
	}

	@Override
	public double areaOfCircle(double r) { //r * r * 
		double result = r*r*Calculator.PI; //Calculator는 직접접근이 가능한 상태고, 상속받았으니까 접근 가능(걍 pi가능)
		return result;
	}

	@Override
	public double pow(double a, int b) {
//		double result = Math.pow(a,b); //자바가 기본으로 제공해주는 수학 함수.
//		return result;
		
		double result = 1;
		for (int i = 1 ; i < b ; i++) {
			result *=a; //result = result * a;
			
		}
		return result;
		
	}

	
}
