package boo.baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_11721 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
		
			StringBuilder sb = new StringBuilder(br.readLine());

			for(int i = 10; i<=100 ; i+=11) {
				
				if(sb.length()>=i) {
					
					sb.insert(i,"\n");
				}
			}
			System.out.println(sb.toString());
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
