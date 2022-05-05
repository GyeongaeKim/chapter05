package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\PhoneDB_원본.txt");
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\PhoneDB_사본.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String name;
		String hp;
		String company;
		
		while(true){
			String str = br.readLine();
			
			if(str == null) {
				break;
			}
			String[] phoneArray = str.split(",");
				name=phoneArray[0];
				hp=phoneArray[1];
				company=phoneArray[2];
			bw.write("이름: " + name);
			bw.newLine();  		//줄바꿈!
			bw.write("핸드폰: " + hp);
			bw.newLine();  		//줄바꿈!
			bw.write("회사: " + company);
			bw.newLine();  		//줄바꿈!
		}
		
		bw.close();
		br.close();
		
	}

}
