package com.comparator;
import java.util.Comparator;
public class IdAsc implements Comparator{
	public int compare(Object arg1,Object arg2) {
		return ((Employee)arg1).id-((Employee)arg2).id;
	}

}
