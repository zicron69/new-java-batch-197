package day03;

import java.util.Scanner;

public class SoalLogicArray02 {
	public static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		System.out.print("Input N : ");
		int n = input.nextInt();

		System.out.print("input M : ");
		int m = input.nextInt();

		System.out.print("input O : ");
		int o = input.nextInt();
		
		//step #2
		int arr[][] = new int[n][n];

		int[] array = deretTiga(n * 4, m, o);
		int indeks = 0;

		// cetak deret diagonal (/)
		for (int i = 0; i < n; i++) {
			arr[n - 1 - i][i] = array[indeks];
			indeks++;
		}

		// cetak deret atas bawah
		for (int i = 1; i < n; i++) {
			arr[i][n - 1] = array[indeks];
			indeks++;

		}
		// cetak deret bawah kanan kiri
		for (int i = n - 2; i > 0; i--) {
			arr[n - 1][i] = array[indeks];
			indeks++;

		}

		// cetak array deret
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}

// membuat method deret #1
	static int[] deretTiga(int n, int m, int o) {
		// buat array
		int arr[] = new int[n];
		int temp = m;
		int angka = o;// nilai awal
		// buat deret
		for (int i = 0; i < n; i++) {

			if (i % (m + 1) == m)// mencari nilai modulus
			{
				arr[i] = temp;
				temp = temp * m;

			} else {
				arr[i] = angka;
				angka += m;
			}

		}
		return arr;

	}

}
