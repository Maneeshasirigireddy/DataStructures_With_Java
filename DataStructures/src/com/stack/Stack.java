package com.stack;

import java.util.*;

public class Stack {
	private Node first=null;
	private int count=0;
	public int size() {
		return count;
	}
	public void add(Object e) {
		if(first==null) {
			first=new Node(e,null);
			count++;
			return;
		}
		Node n=new Node(e,first);
		first=n;
		count++;
	}
	public boolean isEmpty() {
		return count==0;
	}
	public Object pop() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		Object ele=first.ele;
		first=first.next;
		count--;
		return ele;
	}
	public Object peek() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		 return first.ele;
	}

}
