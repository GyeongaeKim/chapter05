package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PhoneDBApp {

	public static void main(String[] args) throws IOException{
		
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\PhoneDB_원본.txt");
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		
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
		for(PhoneDB pd : dbList) {
			pd.showInfo();
		}
		
		
		br.close();
		
	}

}
