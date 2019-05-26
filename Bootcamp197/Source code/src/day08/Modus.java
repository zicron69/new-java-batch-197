package day08;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class Modus {
	public static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		System.out.print("Masukkan Data : ");
		String n = input.nextLine();
		String[] arrayString = n.split(" ");
		
		// split untuk merubah string ke int
		int[] arrayInput = new int[arrayString.length];

		for (int i = 0; i < arrayString.length; i++) {
			arrayInput[i] = Integer.parseInt(arrayString[i]);
		}
// panggil method untuk di cetak
		modus(arrayInput);
		median(arrayInput);
		mean(arrayInput);
		urutManual(arrayInput);
	}

	// modus
	public static void modus(int[] array) {
		HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
		// mencari modus
		for (int i = 0; i < array.length; i++) {
			if (data.containsKey(array[i])) {
				int value = data.get(array[i]);
				value++;
				data.put(array[i], value);
			} else {
				data.put(array[i], 1);
			}
		}

		int key = Collections.max(data.entrySet(), Map.Entry.comparingByValue()).getKey();
		int value = Collections.max(data.values());
		System.out.println("Modus : " + key + " || Value : " + value);
		
	}

	// median
	public static void median(int[] array) {
		Arrays.sort(array);
		float med = 0;

		if (array.length % 2 == 0) {
			med = (float) (array[(array.length - 1) / 2] + array[((array.length - 1) / 2) + 1]) / 2;
		} else {
			med = (float) (array[array.length / 2]);
		}
		System.out.println("Median : " + med);
	}

	// mean
	public static void mean(int[] array) {

		double sum = 0;
		double mean = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		mean = (double) (sum / array.length);
		System.out.println("Mean : " + mean);
	}

	// sort
	public static void urutManual(int[] urut) {
		int n = urut.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n-1); j++) {
				if (urut[j - 1] > urut[j]) {
					// tuker urutan
					temp = urut[j - 1];
					urut[j - 1] = urut[j];
					urut[j] = temp;
				}
			}
		} // cetak sort
		for (int i = 0; i < urut.length; i++) {
			System.out.print(urut[i] + " ");
		}		

	}


}