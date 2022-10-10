package boo.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	private Scanner sc = new Scanner(System.in);
	
	
	
	public  void baekJoon_9093_1() throws IOException {
	        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
		int n = Integer.parseInt(br.readLine());  //n 입력받기
	       
		StringBuilder answer = new StringBuilder();  //최종 출력할 StringBuilder
	       
		for (int i = 0; i < n; i++) {
	        StringTokenizer st = new StringTokenizer(br.readLine());
	            while (st.hasMoreTokens()) {
	                StringBuilder sb = new StringBuilder(st.nextToken());
	                answer.append(sb.reverse() + " ");  //각 단어를 뒤집고 answer에 붙이기
	            }
	        answer.append("\n");
	    }
	        
		System.out.print(answer);
	}
	
	
	
	
	
	public void baekJoon_9093() throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		String[] arr = new String[num];
		for(int i = 0; i<num ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			System.out.println(st.countTokens());
			String[] arr2 = new String[st.countTokens()];
			StringBuilder sb = new StringBuilder();
			for(int ne = 1; ne<= st.countTokens();ne++) {
			
				StringBuilder sb2 = new StringBuilder(st.nextToken());
				arr2[ne] = sb2.reverse().toString();
				sb.append(arr2[ne]+" ");
				
			}
			
			System.out.println(sb.toString());
			arr[i] = sb.toString();
			 
			
		}
		
		for(String s : arr) {
			System.out.println(s);
		}
	}
	public void backJoon_1357() throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		int revX = 0;
		int revY = 0;
		while(x > 0) {
			
			revX = revX * 10 + (x % 10);
			x /= 10 ;
		}
		while(y > 0) {
			
			revY = revY * 10 + (y % 10);
			y /= 10 ;
		}
		
		int sum = revX + revY;
		int revS = 0;
		
		while(sum > 0) {
			
			revS = revS * 10 + (sum % 10);
			sum /= 10 ;
		}
		
		System.out.println(revS);
	}
	
	
	public void backJoon_10820() {	
	
	}
	
	public void baekJoon_1475() {
	
	}
	
	
	public void baekJoon_8958() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try{
			
			int num = Integer.parseInt(br.readLine());
			
			
			int[] arr = new int[num];
			
			for(int ii = 0 ; ii < num ; ii++) {
			
				String str = br.readLine();
				String[] result = str.split("X");
				int sum = 0;
				for(String s : result) {
					
					for(int i = 1;i<=s.length();i++) {
						sum += (i);
					}
				}
				arr[ii] = sum;
			}
			
			for(int iii : arr) {
				bw.write(String.valueOf(iii)+"\n");
			}
			bw.flush();
			bw.close();
		}catch(Exception e) {
			
		}
	}
	
	
	public void baekJoon_25372() throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		String input = null;
		for (int i = 0 ; i < num ; i++) {
			input = br.readLine();
			
			if (input.length()>=6 && input.length()<=9 ) {
				bw.write("yes\n");
			}else bw.write("no\n");
		}
		
		/*
		 * 
		 * */
		
		
		
		
		bw.flush();
		bw.close();
		
		
	}
	
	public void baekJoon_25314() throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int input = Integer.parseInt(br.readLine());
		
		
		for(int i = 0 ;i<(input/4) ;i++) {
			
			bw.write("long ") ;
		}
		
		bw.write("int");
		
		bw.flush();
		bw.close();
		
		
	}
	
	
	public void baekJoon_1110() throws Exception{
		
		
		
		
		
	}
	
	public void baekJoon_10951() throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		while(true) {
			
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int input1 = Integer.parseInt(st.nextToken());
			int input2 = Integer.parseInt(st.nextToken());
			
			bw.write(String.valueOf(input1 + input2));
			bw.flush();
			bw.close();
		}
//			System.out.println(input1+input2);
			
			
		
		
		
		
		
		
		
	}
	
	public void baekJoon_25304() throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int total = Integer.parseInt(br.readLine());
		int num =Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		int sum = 0;
		
		for(int i = 0; i < num ; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			arr[i] = (Integer.parseInt(st.nextToken())*
					Integer.parseInt(st.nextToken()));
			
			
			sum += arr[i];
		}
	
		if (total == sum) {
			
			bw.write("Yes");
			
		}else {
			
			bw.write("No");
		}
		
		bw.flush();
		bw.close();
		
		
		
		
		
	}
	
	public void baekJoon_15552_2() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int num = Integer.parseInt(br.readLine());
			int[] arr = new int[num];
			
			for(int i = 0; i< num ; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine()," ");
				
				arr[i] = (Integer.parseInt(st.nextToken())+
						Integer.parseInt(st.nextToken()));
				
			}
			for(int i = 0; i< num ; i++) {
				bw.write(String.valueOf(arr[i])+"\n");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bw.flush();
				bw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void baekJoon_15552() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int num = Integer.parseInt(br.readLine());
			int[] arr = new int[num];
			
			for(int i = 0; i< num ; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine()," ");
				
				arr[i] = (Integer.parseInt(st.nextToken())+
						Integer.parseInt(st.nextToken()));
				
			}
			for(int i = 0; i< num ; i++) {
				System.out.println(arr[i]);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			
		}
		
		
	}
	
	
	
	public void baekJoon_2884() {
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		if (M <45 ) { 
			
			if(H == 0) {
				System.out.println((H+23) + " "+ (M+15));
			}else {
				System.out.println((H-1) + " "+(M+15) );
			}
			
		} else {
			System.out.println((H) + " "+ (M-45));
		}
		
	}
	
	
	public void baekJoon_no18108() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
		
//			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			int input = Integer.parseInt(br.readLine());
			
			
			bw.write(String.valueOf(input-543));
		
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bw.flush();
				bw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}
	
	
	
	public void baekJoon_no3003() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
		
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			int input1 = Integer.parseInt(st.nextToken());
			int input2 = Integer.parseInt(st.nextToken());
			int input3 = Integer.parseInt(st.nextToken());
			int input4 = Integer.parseInt(st.nextToken());
			int input5 = Integer.parseInt(st.nextToken());
			int input6 = Integer.parseInt(st.nextToken());
			
			bw.write(String.valueOf((1-input1)+" "+ (1-input2)+" "+(2-input3)
					+" "+(2-input4)+" "+(2-input5)+" "+(8-input6)));
		
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bw.flush();
				bw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}
	
	
	
	public void baekJoon_no1000() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try{
			
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int input1 = Integer.parseInt(st.nextToken());
			
			int input2 = Integer.parseInt(st.nextToken());
			
			bw.write(String.valueOf(input1 + input2));
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {	
			bw.flush();
			bw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	public void baekJoon_no10926() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try{
			
			
			bw.write(br.readLine() + "??!");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {	
			bw.flush();
			bw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	public void baekJoon_no10718() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try{
			
			
			bw.write("강한친구 대한육군\n강한친구 대한육군");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {	
			bw.flush();
			bw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
}
