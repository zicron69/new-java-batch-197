package day07;

public class Yamaha01 extends Bike01 {
	
	void run() {
		System.out.println("Yamaha Memanggil");
		
	}
	public static void main(String[] args) {
		Bike01 b = new Yamaha01();
		b.run();

	}
}
