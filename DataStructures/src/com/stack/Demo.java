package com.stack;

public class Demo {
	public static void main(String [] args) {
		Stack s=new Stack();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.isEmpty());
	}
}
