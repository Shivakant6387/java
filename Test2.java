package com.Inheritance.com;
abstract class Log{
	abstract long count();
	abstract Object get();
}
class CommunicationLog extends Log{
	long count() {
		return 20;
	}
	String get() {
		return "00";
	}
}
public class Test2 {
public static void main(String[]args) {
	Log log=new CommunicationLog();
	System.out.print(log.count());
	System.out.print(log.get());
}
}
