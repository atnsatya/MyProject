package com.sr.fileIO;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class ColHash {

	public static void main(String[] args) {
		HashMap m=new HashMap();
		m.put(444, "hshhs");
		m.put(555, "hhh");
		m.put(222, "kdhdj");
		Set s=m.entrySet();
		ArrayList<Entry> al=new ArrayList<Entry>(s);
		for(Entry e:al){
		System.out.println(e.getKey()+"..."+e.getValue());
		
		}
	}

}
