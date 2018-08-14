package com.sr.fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args)throws IOException {
		BufferedReader bf=new BufferedReader(new FileReader("sy.txt"));
		String s=bf.readLine();
		while(s!=null){
			System.out.println(s);
			s=bf.readLine();
		}

	}

}
