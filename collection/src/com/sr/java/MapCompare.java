package com.sr.java;

import java.util.Comparator;
import java.util.TreeMap;

public class MapCompare {

	public static void main(String[] args) {
		TreeMap t =new TreeMap(new MyComparator1());
		 t.put(111,"satya");
		 t.put(222,"aditya");
		 t.put(333,"atuna");
		 System.out.println(t);
	}

}
class MyComparator1 implements Comparator{
	public int compare(Object obj1,Object obj2){
		String i1=obj1.toString();
		String i2=obj2.toString();

		return i2.compareTo(i1);
	}
}