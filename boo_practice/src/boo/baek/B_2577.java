package boo.baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2577 {

	public static void main(String[] args) {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int multiple = a*b*c;
		System.out.println(multiple);
		int zero = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;
		int nine = 0;
		
		while(multiple>0) {
			
			switch(multiple%10) {
			case 0 : zero++; break;
			case 1 : one++;break;
			case 2 : two++;break;
			case 3 : three++;break;
			case 4 : four++;break;
			case 5 : five++;break;
			case 6 : six++;break;
			case 7 : seven++;break;
			case 8 : eight++;break;
			case 9 : nine++;break;
			}
			multiple /= 10;
		}
		System.out.println(zero);
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);
		System.out.println(six);
		System.out.println(seven);
		System.out.println(eight);
		System.out.println(nine);
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
