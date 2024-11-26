package com.arrayprograms;

public class demo {
	public static void main(String [] args) {
		int[] a1= {10,20,30};
		int[] a2= {1,2,3};
		display(a1);
		display(a2);
	}
	public static void display(int[] a) {
		for(int n:a) {
			System.out.print(n+" ");
		}
		System.out.println();
	}

}
