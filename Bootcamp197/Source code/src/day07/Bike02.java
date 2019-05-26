package day07;

public abstract class Bike02 {
	Bike02() {
		System.out.println("Bike Is Called");
	}

	abstract void run();

	void chengeGear() {
		System.out.println("Gear Changed");
	}
}
