package com.sr.fileIO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class LogicalTest {
	public static void find(){
	String s="satyayt";
	ArrayList l=new ArrayList();
	char[] ch=s.toCharArray();
	for(char c:ch){
		l.add(c);
	}
	TreeSet<Character> t=new TreeSet<>(l);
	int count=0;
	for(char c1:t){
		if(Collections.frequency(l, c1)>1){
			count++;
			System.out.println(c1);
			
			System.out.println(c1+""+count);
		}
	}
	
	}
	public static void main(String[] args) {
		LogicalTest.find();
	}
       
}
