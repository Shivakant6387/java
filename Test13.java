package com.Inheritance.com;
 class A1{
	int x=10;
}
 class B1 extends A1{
	int x=20;
}
public class Test13 {
public static void main(String args[]) {
	B1 obj=new B1();
	System.out.println(obj.x);
	
	A1 obj1=new A1();
	System.out.println(obj1.x);
	
	A1 obj2=new A1();
	System.out.println(obj2.x);
	
}
}
