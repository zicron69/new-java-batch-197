package day02;

public class MethodOverloadingExample {

	public static void main(String[] args) {
		// Calling method add
		System.out.println(add(11, 11));
		//calling method add
		System.out.println(add(11,11,11));
	}

	static int add(int a, int b) {
		
		return a+b;
	}
	
	static int add(int a, int b, int c) {
		return a+b+c;
	}
}
