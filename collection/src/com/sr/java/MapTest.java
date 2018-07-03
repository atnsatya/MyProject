package com.sr.java;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MapTest {

	public static void main(String[] args) {
		ConcurrentHashMap m=new ConcurrentHashMap();
		m.put(102,"satya");
		m.put(11,"aditya");
		m.put(123, "atuna");
		System.out.println(m);
		Set s=m.keySet();
		Iterator i=s.iterator();
		while(i.hasNext()){
			Integer m1=(Integer) i.next();
			//Integer i1=(Integer)i.next();
			System.out.println(m1+"..."+m.get(m1));
			if(m1.equals(11)){
				m.put(142,"lala");
			}
			System.out.println(m);
		}

	}

}
