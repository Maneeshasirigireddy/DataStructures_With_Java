package com.Queue;

public class Demo {
	public static void main(String [] args) {
		Queue q=new Queue();
		q.add(10);
		q.add(20);
		q.add(30);
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.isEmpty());
	}

}
