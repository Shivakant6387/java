package com.Inheritance.com;
class Parent {
	public Parent() {
		System.out.println("Parent constructor");
	}
}
class Child extends Parent
{
	public Child() {
		System.out.println("Child constructore");
	}
}
class GrandChild extends Child
{
	public GrandChild() {
		System.out.println("Grand Child constructore");
	}
}

public class ConVsIn {

	public static void main(String[] args) {
		
		GrandChild ch=new GrandChild();
		//Parent p=new Child();
	}

}
