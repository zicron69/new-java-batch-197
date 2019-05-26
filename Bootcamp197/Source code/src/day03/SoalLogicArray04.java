package day03;

import java.util.Scanner;

public class SoalLogicArray04 {
	public static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		System.out.print("Input N : ");
		int n = Integer.parseInt(input.nextLine());

		System.out.print("Input M : ");
		int m = Integer.parseInt(input.nextLine());

		// STEP #2
		int[] deret1 = deretEmpat(n, m);

		for (int i = 0; i < n; i++) {
			System.out.print(deret1[i] + "\t");
		}
		// format untuk menggeser array ke kanan
		for (int i = 1; i <= m; i++) {
			System.out.println("");
			System.out.print("Geser Ke " + i +"\t");
			int temp = deret1[n - 1];
			for (int j = n - 1; j > 0; j--) {
				deret1[j] = deret1[j - 1];
			}
			deret1[0] = temp;
			for (int k = 0; k < n; k++) {
				System.out.print(deret1[k] + "\t");
			}
		}

	}

// membuat method deret #1 untuk step #2
	static int[] deretEmpat(int n, int m) {
		// buat array
		int deret[] = new int[n];
		int angka = 1;

		// buat deret
		for (int i = 0; i < n; i++) {
			deret[i] = angka;
			angka = angka + m;
		}

		return deret;
	}
}
