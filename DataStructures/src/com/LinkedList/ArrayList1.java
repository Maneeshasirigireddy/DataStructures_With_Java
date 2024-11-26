package com.LinkedList;

public class ArrayList1 {

	private Object[] a;
	private int p;
	public ArrayList1() {
		a=new Object[5];
	}
	public void add(Object e) {
		if(p>a.length) increase();
		a[p++]=e;
	}
	private void increase() {
		Object[] temp=new Object[a.length+3];
		System.arraycopy(a, 0, temp, 0, a.length);
		a=temp;
		
	}
	public int size() {
		return p;
	}
	public Object get(int index) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		return a[index];
	}
	public void remove(int index) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		for(int i=index+1;i<size();i++) {
			a[i-1]=a[i];
		}
		p--;
		a[p]=null;
	}
	public void add(int pos,Object e) {
		if(pos<=-1||pos>=size()) {
			throw new IndexOutOfBoundsException();
		}
		if(p>=a.length) increase();
		for(int i=size()-1;i>=pos;i--) {
			a[i+1]=a[i];
		}
		a[pos]=e;
		p++;
	}
}
