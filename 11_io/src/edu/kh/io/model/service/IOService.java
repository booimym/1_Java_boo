package edu.kh.io.model.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOService {
	
	// 스트림 : 데이터가 이동하는 통로
	
	// 바이트 기반 스트림 : 1byte 단위로 데이터를 입/출력하는 스트림.
	// -> 문자가 아닌 파일(이미지,영상, exe 등) 입/출력
	
	// 문자 기반 스트림 : 문자 단위(2byte)로 데이터를 입/출력하는 스트림.
	// -> 문자 데이터(채팅, 코드, 데이터) 입/출력
	
	
	public void output() {
		
		String content = "Hello World\n"
						+ "1234567890\n"
						+ "오늘은 금요일 입니다."
						+ "점심 어떤 게 좋을까요?" ;
		
		
		// * 스트림 객체 생성 시 예외처리가 필요하다.
		
		//바이트 기반 파일 출력 스트림
//		FileOutputStream fos = new FileOutputStream("");
		//예외: Unhandled exception type FileNotFoundException
		
		FileOutputStream fos = null; //메서드의 지역변수니까 메서드 어디서든 사용 가능
									//finally에서도 사용 가능
		
		//문자 기반 파일 출력 스트림
		FileWriter fw = null;
		
		
		try {
			
			fos = new FileOutputStream("byte/byteTest.txt",true);
				//new FileOutputStream("여기다가 출력할 파일의 경로를 적으면 됨.",이어쓰기 여부임.);
			// -> 파일이 없으면 생성됨.
			//새롭게 실행될 때마다 파일/내용이 덮어쓰기된다.
			//이어쓰기 여부를 true로 하면 이전 내용에다가 이어쓰기가 됨.(log 작성 시 많이 사용한대)
			
			
			//1byte씩 파일로 출력
			
			for(int i = 0 ; i <content.length() ;i++) {
				
				fos.write(content.charAt(i));
				
				
			}
			System.out.println("바이트 스트림 출력 완료");
			
			//------------
			
			
			
			fw = new FileWriter("char/charTest.txt",true);
				//new FileOutputStream("여기다가 출력할 파일의 경로를 적으면 됨.");
			
			
				fw.write(content);
			
			
			System.out.println("문자 스트림 출력 완료");
			
		}catch(FileNotFoundException e) {
			e.printStackTrace(); //예외가 발생한 메서드까지의 모든 메서드 출력
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				
				//스트림.close()  -> 스트림 통로를 닫아버리는 거임.
				//					스트림 내부에 존재하는 데이터를 모두 밀어낸 후
				//					스트림 객체 자원(메모리)를 반환한다
				// -> 필수 작성해야됨~!
				
				
				fos.close();
				fw.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		

		
		
	}
	
	
	public void input() {
		
		FileInputStream fis = null;
		
		FileReader fr = null; //문자 기반
		
		try {
			
										//파일 경로
			fis = new FileInputStream("char/charTest.txt");
			// throws FileNotFoundException
			
			int value = 0; //파일에서 읽어온 값을 저장할 변수
			
			
			//fis.read() : 다음 1byte를 읽어와 int형으로 반환한다.
			//				단, 읽어올 내용이 없으면 -1을 반환한다.
			//두개의 방식으로 만들 수 있는데, 첫번째꺼 처음 배움. 1줄이라 더 간단함.
			//1)
//			while( (value = fis.read()) != -1 ) System.out.print((char)value);
			
			//2)
			while(true) {
				
				value = fis.read();
				
				if(value == -1) break;
			
				System.out.print((char)value);
			}
			
			
			
			System.out.println("\n-------------------------------------------------");
			
			fr = new FileReader("char/charTest.txt");
			// throws FileNotFoundException
			
				while(true) {
				
				value = fr.read();
				
				if(value == -1) break;
			
				System.out.print((char)value);
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			
			try { //스트림 객체 자원 반환
				
				if(fis != null) fis.close(); //참조하는 스트림이 있을 때만 닫아줌.
				if(fis != null) fr.close();  //참조하는 스트림이 있을 때만 닫아줌.
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	//어떤 형식의 파일이든지 복사하기(인풋과 아웃풋을 동시에 진행)
	public void fileCopy() {
		
		
		Scanner sc = new Scanner(System.in);
		
		//보조스트림(혼자 생성되어서 입출력을 할 수 없는 스트림)
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			
			System.out.print("복사할 파일의 경로 :");
			String input = sc.nextLine();
			
			bis = new BufferedInputStream(new FileInputStream(input));
			//new BufferedInputStream(여기에는 기반스트림이 필요하다.)
			
			System.out.print("복사할 파일의 위치 + 파일명 : ");
			String output = sc.nextLine();
			bos = new BufferedOutputStream(new FileOutputStream(output));
			
			
			//Buffered 보조 스트림
			// -> 버퍼를 이용해서 1byte/1문자씩이 아닌
			// 	  한번에 많은 내용을 입/출력할 수 있게 하는 보조 스트림(속도 upup)
			
			int value = 0;
			
			while(true) {
				
				value = bis.read();
				//바이트 스트림이기 때문에 1byte씩 읽어오지만
				//한글 같은 2byte문자가 버퍼에 쌓이면서 깨졌던 모양이 복구됨.
				
				
				if(value == -1) break;
				
				bos.write(value);
				// 1byte씩 출력되는 것 같으나
				// 내부 버퍼에 출력되는 내용이 모여서 한번에 출력됨.
				
				
			}
			
			System.out.println("복사완료");
			
		}catch(FileNotFoundException e){
			System.out.println("파일을 찾을 수 없슴니다.");
			e.printStackTrace();
			
			
		}catch(IOException e){
			System.out.println("입출력과정에서 오류가 발생했습니다.");
			e.printStackTrace();
			
			
		}finally {
			
			try {
				if(bis != null)bis.close();
				if(bos != null)bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
