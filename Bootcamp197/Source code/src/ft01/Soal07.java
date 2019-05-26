package ft01;

import java.util.Arrays;

import java.util.Scanner;

public class Soal07 {

	public static Scanner input;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Input kalimat");

		String kalimat = scanner.nextLine();
		// buat nampung hasil string yg dipisah
		String[] tempArray;
		// misahin string
		String delimiter = "";

		tempArray = kalimat.split(delimiter);// pemisahan

		int n = tempArray.length;

		for (int i = (n - 1); i >= 0; i--) {
			for (int a = 0; a < (n / 2); a++) {
				System.out.print("*");
			}

			System.out.print(tempArray[i]);
			for (int a = 0; a < (n / 2); a++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}
}