package com.ylw.ele;

public class Dog extends Animal{
public void say() {
	System.out.println("wang wang");
}
@Override
public void walk() {
	// TODO Auto-generated method stub
	System.out.println("four leg");
}
@Override
public void eat() {
	// TODO Auto-generated method stub
	System.out.println("dog's way:tete");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog g=new Dog();
		g.eat();
		g.walk();
		g.say();
	}

}
