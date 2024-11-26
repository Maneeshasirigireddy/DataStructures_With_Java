package com.arrayprograms;

interface Animal{
	void makeSound();
}

class Dog implements Animal{

	@Override
	public void makeSound() {
		System.out.println("bow bow");
		
		
	}
	public void jump() {
		System.out.println("Jumping....");
	}
	
}
class Cat implements Animal
{
	
	@Override
	public void makeSound() {
		System.out.println("meow meow");
		
	}
	public void killRat() {
		System.out.println("Killing Rat");
	}
}
public class Demo4 {
	

	public static void main(String[] args) {
		Animal [] arr=new Animal[4];
		arr[0]=new Dog();
		arr[1]=new Cat();
		arr[2]=new Dog();
		arr[3]=new Cat();
		
		for(Animal a:arr) {
			a.makeSound();
			if(a instanceof Dog) {
				((Dog)a).jump();
			}
			System.out.println("______________");
		}

	}

}

