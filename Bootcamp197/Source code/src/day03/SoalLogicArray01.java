package day03;

import java.util.Scanner;

public class SoalLogicArray01 {
	public static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		System.out.print("Input N : ");
		int n = Integer.parseInt(input.nextLine());

		// membuat array
		int arr[][] = new int[n][n];

		// membuat deret awal
		int deret[] = new int[n];
		int awal = 1;

		// mencari deret
		for (int i = 0; i < deret.length; i++) {
			deret[i] = awal;
			awal = awal + (i + 2);
		}
		// mencari deret2
		int deret2[] = new int[n];
		int awal2 = 2;

		for (int j = 0; j < deret2.length; j++) {
			deret2[j] = awal2;
			awal2 = awal2 + (2 * (j + 1));
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				// membuat print diagonal (\)
				if (i == j) {
					arr[i][j] = deret[i];
				} else if (i + j == n - 1) // membuat print diagoal (/)
					arr[i][j] = deret2[j];

				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
