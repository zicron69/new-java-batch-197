package day03;
import java.util.Scanner;
public class SoalLogicArray05 {
	public static Scanner input;
	public static void main(String[] args) {

		input = new Scanner(System.in);
		System.out.println("Input N : ");
		
		
		
		
	}

	// membuat method deret#1
	static int[] deretLima(int n) {
		// buat array
		int deret[] = new int[n];
		int angka = 1;
		
		//buat deret
		for(int i = 0; i < n; i++) {
			deret[i]=angka;
			angka=angka+1;
		}
		return deret;
	}
	
	
	
}
