package com.Inheritance.com;
class Super {
	public String num="10";
}
class Sub extends Super{
	protected int num=20;
}
public class Test8 {

	public static void main(String[] args) {
		Super obj=new Sub();
		System.out.println(obj.num+=2);

	}

}
