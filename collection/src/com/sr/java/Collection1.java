package com.sr.java;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

class Collection1 extends Thread{
	static CopyOnWriteArrayList a=new CopyOnWriteArrayList();
	public void run(){
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("child class trying to modification");
		a.add("f");
		
	}

	

	public static void main(String[] args)throws InterruptedException {
		a.add("a");
		a.add("b");
		a.add("c");
		Collection1 s=new Collection1();
		s.start();
		Iterator i=a.iterator();
		while(i.hasNext())
		{
			String c=(String)i.next();
			System.out.println("main thread iterating list and current object is"+c);
			Thread.sleep(1000);
		}
		System.out.println(a);
		
		

	}

}
