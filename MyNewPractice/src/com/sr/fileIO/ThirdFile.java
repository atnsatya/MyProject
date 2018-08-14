package com.sr.fileIO;

import java.io.File;

public class ThirdFile {

	public static void main(String[] args) {
		File f=new File("satyaFile");
		String[] s=f.list();
		int count=0;
		for(String s1:s){
			File f1=new File(f,s1);
			if(f1.isDirectory()){
				System.out.println(f1);
				count++;
			}
			
		}
		System.out.println(count);
	}

}
