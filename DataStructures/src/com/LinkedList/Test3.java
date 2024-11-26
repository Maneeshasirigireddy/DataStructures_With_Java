package com.LinkedList;

public class Test3 {
	public static void main(String [] args) {
		LinkedList l=new LinkedList();
		l.add(10);
		l.add(50);
		l.add(30);
		l.add(40);
		for(int i=0;i<l.size();i++) {
			int n=(Integer)l.get(i);
			System.out.println(n);
		}
	}
}
