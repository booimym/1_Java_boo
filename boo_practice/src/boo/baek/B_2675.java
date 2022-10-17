package boo.baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2675 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int num = Integer.parseInt(br.readLine());
			StringBuilder sb = new StringBuilder();
			for(int i = 0 ; i < num ; i++) {
				
				StringTokenizer st = new StringTokenizer(br.readLine()," ");
				int repeat = Integer.parseInt(st.nextToken()); //반복해야되는 길이
				String str2 = st.nextToken();
				int length = str2.length(); //반복할 문자열의 길이

				for(int j = 0; j<length;j++) {
					for(int l = 0 ; l < repeat ; l++) {
						
						sb.append(str2.charAt(j));
					}
				}
				
				sb.append("\n");
			}
			
			System.out.println(sb);
		}catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
