package com.arrayprograms;

public class demo2 {

	public static void main(String[] args) {
		int[] arr= {10,20,30};
		m1(arr);
		for(int n:arr) {
			System.out.println(n);
		}

	}
	static void m1(int[] a) {
		for(int i=0;i<a.length;i++) {
			a[i]++;
		}
		System.out.println("M1 executed");
	}

}
