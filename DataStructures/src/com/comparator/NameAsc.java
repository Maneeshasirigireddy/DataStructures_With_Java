package com.comparator;

import java.util.Comparator;

public class NameAsc implements Comparator {
	
	public int compare(Object arg1,Object arg2) {
		Employee s1=(Employee)arg1;
		Employee s2=(Employee)arg2;
		return s1.name.compareTo(s2.name);
		
	}
}
