package com.DOUBLILINKEDLIST;

public class Node {

	Object ele;
	Node next;
	Node prev;
	public Node(Object e,Node p,Node n) {
		ele=e;
		prev=p;
		next=n;
	}
}
