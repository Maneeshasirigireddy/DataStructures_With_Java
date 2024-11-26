package com.comparator;

import java.util.comparable
public class Student implements Comparable{
	int marks;
	String name;
	Student(String n,int m){
		name=n;
		marks=m;
	}
	public int compareTo(Object arg) {
		String s1=name;
		String s2=(String)arg.name;
		return s1.compareTo(s2);
	}
	@Override
	public String toString() {
		return "Student[Name :"+name+" Marks:"+marks+"]";
	}



}
