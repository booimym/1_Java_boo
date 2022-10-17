package boo.baek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1292 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
//		for(int i = 1 ; i <= 9 ; i++) {
//			
//			for(int j = 1 ; j <= 9 ; j++) {
//				
//				System.out.println(i + " x "+ j +" = " +i*j);
//			}
//		}
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1 ; i < 40 ; i++) {
			
			for(int j = 1 ; j <= i ; j++) {
				
				sb.append(i);
			}
		}
//		System.out.println(sb.toString());
//		System.out.println(sb.length());
		String extract = sb.toString().substring(Integer.parseInt(st.nextToken())-1,Integer.parseInt(st.nextToken()));
	
		int extracti = Integer.parseInt(extract);
		int sum = 0;
		while(extracti != 0) {
//			System.out.println(extracti % 10);
			sum += extracti % 10;
			extracti /= 10;
			
		}
	
		System.out.println(sum);
	
	}

}
