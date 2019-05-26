package ft01;

import java.util.Arrays;

public class Soal06 {

	public static void main(String[] args) {
		// input array
		int[] arrayInput = new int[] { 1, 2, 4, 7, 8, 6, 9 };

		// urutkan deret array dengan sort
		Arrays.sort(arrayInput);
		minMax(arrayInput);
	}

	// membuat method
	static void minMax(int[] arr) {
		// menggunakan long agar bisa input data lebih banyak
		long min = 0;
		long max = 0;

		int n = 3;

		for (int i = 0; i < n; i++) {
			min += arr[i];
			max += arr[arr.length-1-i]; // menjumlah angka di mulai dari 4 angka terakhir
		}
		System.out.println("Minimal " + min + "|| Maksimal " + max);
	}

}