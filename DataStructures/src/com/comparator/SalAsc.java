package com.comparator;

	import java.util.Comparator;
	public class SalAsc implements Comparator{
		public int compare(Object arg1,Object arg2) {
			Employee s1=(Employee)arg1;
			Employee s2=(Employee)arg2;
			if(s1.salary>s2.salary) return 1;
			if(s1.salary<s2.salary) return -1;
			else return 0;
		}
	}

