package com.Inheritance.com;
class Pq{
	Pq(){
		System.out.println("Non-Param of Parent");
	}
	Pq(int x){
		System.out.println("Param of Parent");
	}
}
class Ch extends Pq{
	Ch(){
		System.out.println("Non-Param of Child");
	}
	Ch(int y){
		System.out.println("Param of Child");
	}
}
public class TEST10 {
public static void main(String []args) {
	Ch cd=new Ch(20);
}
}
