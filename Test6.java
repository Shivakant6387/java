package com.Inheritance.com;
class Currency{
	String notation ="-";
	String getNotation() {
		return notation;
	}
}
class USDollar	extends Currency{
	String notation="$";
	String getNotation() {
		return notation;
	}
}
class Euro extends Currency{
	protected String notation="&";
	protected String getNotation() {
		return notation;
	}
}
public class Test6 {
public static void main(String[]args) {
	Currency c1=new USDollar();
	System.out.println(c1.notation+":"+c1.getNotation());
	Currency c2=new Euro();
	System.out.println(c2.notation+":"+c2.getNotation());
}
}
