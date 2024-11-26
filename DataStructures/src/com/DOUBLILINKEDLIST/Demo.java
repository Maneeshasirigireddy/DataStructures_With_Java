package com.DOUBLILINKEDLIST;

public class Demo {
	public static void main(String [] args) {
		DoubleLinkedList d=new DoubleLinkedList();
		d.add(3);
		d.add(2);
		d.add(1);
		d.add(0, 4);
		System.out.println("Size="+d.size());
		for(int i=0;i<d.size();i++) {
			int n=(Integer)d.get(i);
			System.out.println(n);
		}
		d.reverse();
		for(int i=0;i<d.size();i++) {
			int n=(Integer)d.get(i);
			System.out.println(n);
		}
	}

}
