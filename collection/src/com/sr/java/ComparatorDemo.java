package com.sr.java;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
		Employee e1=new Employee(101,"raja");
		Employee e2=new Employee(191,"rmba");
		Employee e3=new Employee(105,"arjun");
		Employee e4=new Employee(107,"vima");
		Employee e5=new Employee(154,"karna");
		TreeSet t=new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
		TreeSet t1=new TreeSet(new Satya());
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
System.out.println(t);
	}

}
class Employee implements Comparable{
	int id;
	String name;
	public Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
		public String toString(){
			return id+"   "+name ;
		}
		public int compareTo(Object o){
			int id1=this.id;
			Employee e=(Employee)o;
			int id2=e.id;
			if(id1<id2)
				return -1;
			else
				
			return +1 ;
		}
	
}
class Satya implements Comparator{
	public int compare(Object o1,Object o2){
		Employee e=(Employee)o1;
		Employee e1=(Employee)o2;
		String s=e.name;
		String s1=e1.name;
		return s.compareTo(s1);
	}
}