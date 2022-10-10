package boo.baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_8958 {

	public static void main(String[] args)  {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder answer = new StringBuilder();
			int num = Integer.parseInt(br.readLine());
			
			for(int i = 0 ; i < num ; i++) {
				
				StringTokenizer st = new StringTokenizer(br.readLine(),"X");
				int sum = 0;
				
				while(st.hasMoreTokens()) {
					int length= st.nextToken().length();
					for(int number=0;number<=length;number++) {
						sum += number;
					}
					
				}
				
				answer.append(sum).append("\n");
			}
			
			System.out.println(answer);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
