package com.Queue;

import java.util.*;

public class Queue {
	private Node first=null;
	private int count=0;
	public void add(Object e) {
		if(first==null) {
			first=new Node(e,null);
			count++;
			return;
		}
		Node curr=first;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=new Node(e,null);
		count++;
	}
	public int size() {
		return count;
	}
	public boolean isEmpty() {
		return count==0;
	}
	public Object peek() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		return first.ele;
	}
	public Object poll() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		Object ele=first.ele;
		first=first.next;
		return ele;
	}
}
