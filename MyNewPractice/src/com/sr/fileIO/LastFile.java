package com.sr.fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class LastFile {

	public static void main(String[] args)throws IOException {
		BufferedReader bf=new BufferedReader(new FileReader("s.txt"));
		BufferedReader bf1=new BufferedReader(new FileReader("y.txt"));
		PrintWriter pw=new PrintWriter("sy.txt");
		String s=bf.readLine();
		String s1=bf1.readLine();
		while(s!=null||s1!=null){
			if(s!=null){
				pw.println(s);
				s=bf.readLine();
			}
			if(s1!=null){
				pw.println(s1);
				s1=bf1.readLine();
			}
		}
		pw.flush();
		bf.close();
		bf1.close();
		pw.close();

	}

}
