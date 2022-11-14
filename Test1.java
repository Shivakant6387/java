package com.Inheritance.com;
 abstract class Food{
	 protected abstract double getCalories();
 }
 class junkFood extends Food{

	@Override
	protected double getCalories() {
		return 200.0;
	}
	 
 }
public class Test1 {

	public static void main(String[] args) {
	Food jf=new junkFood();
	System.out.println(jf.getCalories());

	}

}
