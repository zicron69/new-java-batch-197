package day02;

import java.util.Scanner;

public class Soal03 {
	public static Scanner input;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Input N1 : ");
		int n1 = Integer.parseInt(input.nextLine());
		System.out.println("Input N2 : ");
		int n2 = Integer.parseInt(input.nextLine());
		System.out.println("Input N3 : ");
		int n3 = Integer.parseInt(input.nextLine());

		// banyak deret
		int[] deret = new int[n1];
		int awal = n2;
		int tengah = n1 / 2;

		for (int i = 0; i < n1; i++) {
			deret[i] = awal;
			// merubah nilai dari tengah
			if (i < tengah) {
				awal = awal * n3;
			} else {
				awal = awal / n3;
			}
			System.out.print(deret[i] + "\t");
		}
		System.out.print("Perhitungan : " + deret[tengah]);

		int hasil = deret[tengah];
		for (int a = tengah + 1; a < tengah + 3; a++) {
			hasil = hasil - deret[a];
			System.out.print("-" + deret[a]);
		}
		System.out.print("=" + hasil);
	}
}
