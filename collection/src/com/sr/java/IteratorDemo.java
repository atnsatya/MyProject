package com.sr.java;

import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("lala");
		al.add("satya");
		System.out.println(al);
		ListIterator i=al.listIterator();
		while(i.hasNext()){
			String s=(String)i.next();
			System.out.println(s);
			if(s.equals("lala")){
				i.set("pl");}
			
		}
		System.out.println(al);
	}

}
