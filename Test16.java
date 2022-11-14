package com.Inheritance.com;
class A21{
	int x=50;
	protected int y=100;
	int z=200;
}
class B21 extends A21{
	
}
public class Test16 {
public static void main(String[]args) {
	B21 b=new B21();
	System.out.println(b.x);
	System.out.println(b.y);

	System.out.println(b.z);

}
}
