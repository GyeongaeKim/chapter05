package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\img.jpg");
		BufferedInputStream bin = new BufferedInputStream(in);
		
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\bufferedImg.jpg");
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		
		System.out.println("복사시작");
		while(true) {
			int data = bin.read();	//data를 읽고
			
			
			
			
			if(data==-1) {		//data가 -1이 되면 break!
				System.out.println("복사끝!" + data);
				break;
			}
			bout.write(data);	//data를 쓰고
			
		}
		
		
		
		
		
		
		
		bout.close();
		bin.close();
		//in.close();
	}

}
