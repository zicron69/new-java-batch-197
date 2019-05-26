package day08;

import java.util.Arrays;

public class MinMaxSum {

	public static void main(String[] args) {
		// input array
		int[] arrayInput = new int[] { 4, 1, 3, 2, 5, 6 };
		// urutkan deret array dengan sort 
		Arrays.sort(arrayInput);
		
		for (int i = 0; i < arrayInput.length; i++) {
			System.out.print(arrayInput + " ");
		}
		miniMaxSum(arrayInput);	
	}
	static void miniMaxSum(int[] arr) {
		int max = 0;
		int min = 0;
		
		//cari nilai max
		for (int i = 0; i < arr.length; i++) {
			max = max + arr[i];
		}
	}
}
