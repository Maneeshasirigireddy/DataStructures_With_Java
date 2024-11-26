package com.comparator;
import java.util.Comparator;
public class NameDesc implements Comparator {
	
	public int compare(Object arg1,Object arg2) {
		Employee s1=(Employee)arg1;
		Employee s2=(Employee)arg2;
		return s2.name.compareTo(s1.name);
		
	}
}
