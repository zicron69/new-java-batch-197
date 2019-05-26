package day07;

public class A02 implements Printable01 {
	public void print() {
		System.out.println("Print Is Called From Class A02");
	}

	public static void main(String[] args) {
A02 a = new A02();
a.print();
	}

}
