package com.Inheritance.com;
class Rectangle{
	int lenght;
	
	int breadth;
	public char[] x;
	Rectangle(int l,int b){
		this.lenght=l;
		this.breadth=b;
	}
	void display(){
		System.out.println("Length:"+this.lenght);
		System.out.println("Breagth :"+this.breadth);
	}
}
class Cuboid extends Rectangle{
	int height;
	int x=30;
	Cuboid(int l,int b,int h){
		super(l,b);
		height=h;
	}
	void displays() {
		System.out.println(super.x);
		System.out.println(x);
	}
}
public class Test11 {
public static void main(String[]args) {
//	Rectangle obj =new Rectangle(10,20);
//	obj.display();
	Cuboid obj1 =new Cuboid(30,40,50);
	obj1.displays();
}
}
