package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex02 {
	
	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\byteBuffImg.jpg");
		
		byte[] buff = new byte[1024];
		
		
		System.out.println("복사시작~");
		while(true) {
			
			int data = in.read(buff);		//위에 만든 buff를 여기에다 주기
			if(data== -1) {
				System.out.println("복사끈!" + data);
				break;
				
			}
			out.write(data);
			
		}
		
		
		out.close();
		in.close();
		
	}

}
