package com.Inheritance.com;
class Super4{
	public void display() {
		System.out.println("Super class Display");
	}
}
class Sub2 extends Super4{
	public void display() {
		System.out.println("Sub class Display");
	}
}
public class Test12 {
public static void main(String[]args) {
	Super4 sp=new Super4();
	sp.display();
	Sub2 sb=new Sub2();
	sb.display();
}
}
