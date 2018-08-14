package com.sr.fileIO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Logical {
	static String  reverse="";
	public static void run(String s){
		char[] i=s.toCharArray();
		List<Character> l=new ArrayList<>();
		for(char c:i){
			l.add(c);
		}
		Set<Character> st=new HashSet<>(l);
		for(char c1:st){
			System.out.println(c1+"  "+Collections.frequency(l, c1));
		}
	}
	public static void main(String[] args) {
		run("sssssaaaak");

	}

}
