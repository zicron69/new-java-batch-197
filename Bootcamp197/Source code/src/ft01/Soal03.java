package ft01;

import java.util.Scanner;

public class Soal03 {
	public static Scanner input;

	public static void main(String[] args) {
input = new Scanner(System.in);
// input data menggunakan String
System.out.print("Input Data : ");
String n = input.nextLine();
	// untuk merubah string menjadi array menggunakan method split
		String[] arrayString = n.split(" ");
		int[] arrayInput = new int[arrayString.length];
	
		for (int i = 0; i < arrayString.length; i++) {
			arrayInput[i] = Integer.parseInt(arrayString[i]);
			
		}
		sortManual(arrayInput);
	}

	// sort manual
	// membuat methot sort manual
	static void sortManual(int[] sort) {
		int n = sort.length;
		// temp sebagai tempat penampungan nilai sementara
		int temp = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				
				if (sort[j - 1] > sort[j]) {
				//swap
					temp = sort[j - 1];
					sort[j - 1] = sort[j];
					sort[j] = temp;
				}
			}
		}
		for (int j = 0; j < sort.length; j++) {
			System.out.print(sort[j] + " ");
		}
	}

}
