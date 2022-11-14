package com.Inheritance.com;
class A3{
	private int x=50;
	void m1() {
		System.out.println(x);
	}
}
class b3 extends A3{
	
}
public class Test15 {

	public static void main(String[] args) {
		
		A3 a=new A3();
		a.m1();

	}

}
