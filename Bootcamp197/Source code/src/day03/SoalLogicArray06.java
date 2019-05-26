package day03;

import java.util.Scanner;

public class SoalLogicArray06 {
	public static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.print("Input N : ");
		int n = input.nextInt();
		System.out.print("Input M : ");
		int m = input.nextInt();

		// STEP #2 > manggil method
		int[] deret1 = deretEnam(n, m);
		
		// Cetak Deret
		for (int i = 0; i < n; i++) {
			System.out.print(deret1[i] + "\t");
		}

		// menggeser array ke kiri
		for (int i = 1; i <= m; i++) {
			System.out.println("");
			System.out.print("Geser ke " + i + "\t");
			int temp = deret1[0];
			for (int j = 0; j < n-1; j++) {
				deret1[j] = deret1[j + 1];
			}
			deret1[n-1] = temp;
			for (int a = 0; a < n; a++) {
				System.out.println(deret1[a] + "\t");
			}

		}

	}

	// membuat method deret step#1
	static int[] deretEnam(int n, int m) {
		// membuat array
		int deret[] = new int[n];
		int angka = 2;

		// membuat deret
		for (int i = 0; i < n; i++) {
			deret[i] = angka;
			angka = angka + (2 * (i + 1));

		}

		return deret;

	}

}
