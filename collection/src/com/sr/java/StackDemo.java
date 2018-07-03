package com.sr.java;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.empty();
		s.push(1);
		s.push(5);
		s.push(6);
		//s.pop();
		s.peek();
		System.out.println(s.pop());
        System.out.println(s.peek()+"..."+s.search(1));
	}

}
