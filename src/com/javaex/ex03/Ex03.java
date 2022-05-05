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
import java.util.ArrayList;

public class Ex03 {

	public static void main(String[] args) throws IOException{
		
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\PhoneDB_원본.txt");
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\PhoneDB_사본2.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out);
		BufferedWriter bw = new BufferedWriter(osw);
		
		
		
		ArrayList<PhoneDB> dbList = new ArrayList<PhoneDB>();
		
		while(true){
			String str = br.readLine();
			
			if(str == null) {
				break;
			}
			String[] phoneArray = str.split(",");
			
			PhoneDB db = new PhoneDB(phoneArray[0], phoneArray[1], phoneArray[2]);
			dbList.add(db);
		}
		
		PhoneDB newDB = new PhoneDB("홍길동", "010-1234-5678", "02-987-6543");
		dbList.add(newDB);
		
		
		//////
		/////
		
		
		
		bw.close();
		br.close();
		
	}

}
