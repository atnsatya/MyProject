package com.sr.fileIO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class ThreadTest  {
	public static  void find(String word){
		char[] ch=word.toCharArray();
		ArrayList al=new ArrayList();
		for(char s:ch){
			al.add(s);
		}
		Set<Character> se= new TreeSet<>(al);
		for(char c1:se){
			System.out.println(c1+":"+Collections.frequency(al, c1));
		}
		
	}
	public static void main(String[] args){
		ThreadTest.find("satya");	}
	

}
