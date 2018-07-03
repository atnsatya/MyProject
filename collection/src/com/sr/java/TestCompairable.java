package com.sr.java;

import java.util.Comparator;
import java.util.TreeSet;

public class TestCompairable {

	public static void main(String[] args) {
		TreeSet t=new TreeSet(new MyComparator());
		t.add(new StringBuffer("satya"));
		t.add("rahul");
		t.add("soumya");
		System.out.println(t);

	}

}
class MyComparator implements Comparator{
	public int compare(Object o1,Object o2){
		String i1=o1.toString();
		String i2=o2.toString();
		return -i1.compareTo(i2);
		
	}
	
}