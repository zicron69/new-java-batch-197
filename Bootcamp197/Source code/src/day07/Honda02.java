package day07;

public class Honda02 extends Bike02 {
	void run() {
		System.out.println("Running Safety.....");
	}

	public static void main(String[] args) {
//create object
		Bike02 obj = new Honda02();
		// call method run
		obj.run();
		// call method changerGar
		obj.chengeGear();
	}

}
