package com.Inheritance.com;
class X{
	void A() {
		System.out.println("A");
	}
}
class Y extends X{
	void A() {
		System.out.println("-A");
	}
	void B() {
		System.out.println("B-");
	}
	void C() {
		System.out.println("C-");
	}
	
}

public class Test10 {

	public static void main(String[] args) {
		Y obj=new Y();
		obj.A();
		obj.B();
		obj.C();

	}

}
