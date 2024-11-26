package com.comparator;

import java.util.Comparator;
public class IdDesc implements Comparator{
	public int compare(Object arg1,Object arg2) {
		return ((Employee)arg2).id-((Employee)arg1).id;
	}

}
