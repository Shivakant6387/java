package com.Inheritance.com;
class Super2{
	final int NUM=-1;
	
}
class Sub1 extends Super2{
	int NUM=100;
}
public class Test9 {

	public static void main(String[] args) {
		Sub1 sb=new Sub1();
		sb.NUM=200;
		System.out.println(sb.NUM);

	}

}
