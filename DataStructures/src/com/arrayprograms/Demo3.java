package com.arrayprograms;

class pen{
	String color;
	
	pen(String color){
		this.color=color;
	}
	
	public String toString() {
		return "color:"+color;
	}
}

public class Demo3 {

	public static void main(String[] args) {
		pen [] arr=new pen[3];
		arr[0]=new pen("Black");
		arr[1]=new pen("blue");
		arr[2]=new pen("red");
		
		for(pen n:arr) {
			System.out.println(n);
		}

	}

}
