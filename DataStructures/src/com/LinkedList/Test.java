package com.LinkedList;

public class Test {
	public static void main(String [] args) {
		ArrayList1 l1=new ArrayList1();
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);
		l1.add(70);
		l1.add(80);
		l1.add(3, 200);
		System.out.println("Size="+l1.size());
		for(int i=0;i<l1.size();i++) {
			int n=(Integer)l1.get(i);
			System.out.println(n);
		}
	}
}
