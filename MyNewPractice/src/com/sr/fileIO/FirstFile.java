package com.sr.fileIO;

import java.io.IOException;
import java.io.PrintWriter;

public class FirstFile {
	

	public static void main(String[] args)throws IOException {
		//File f=new File("abc.txt");
		//f.createNewFile();
		//System.out.println(f.exists());
		PrintWriter pw=new PrintWriter("y.txt");
		pw.println("sditya");
		pw.println("sankar");
		pw.println("ramboo");
		pw.println("lakur");
		pw.println("sonam");
		pw.flush();
		pw.close();

	}

}
