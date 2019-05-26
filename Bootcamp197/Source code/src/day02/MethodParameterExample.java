package day02;

public class MethodParameterExample {

	public static void main(String[] args) {
	int a = 30;
	int b = 45;
	System.out.println("Before swaping, a = " + a + "and b = " + b);
	// invoke the swap method
	swapFunction(a, b);
	System.out.println("\n**Now, Befor and After swaping values will be same here** :");
	System.out.println("After swapping, a = " + a + " and b is = " + b );
	}

	public static void swapFunction(int a, int b) {
		System.out.println("Before Swapping(inside), a = " + a + "b = "+ b);
	// swap n1 with n2
		int c = a;
		a= b;
		b = c;
		
		System.out.println("After swapping(inside), a = " + a + " b = " + b);
	
	}
}
