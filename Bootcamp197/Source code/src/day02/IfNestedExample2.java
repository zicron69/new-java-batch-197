package day02;

public class IfNestedExample2 {

	public static void main(String[] args) {
		int age = 25;
		int weight = 48;
		
		if (age >= 18) {
			if (weight > 30) {
				System.out.println("Diizinkan Donor Darah");
			} else {
				System.out.println(" Tak Memenuhi Syarat");
			}
		} else {
			System.out.println("Harus Berusia 18");
		}
	}

}
