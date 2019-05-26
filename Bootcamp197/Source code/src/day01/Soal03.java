package day01;

import java.util.Scanner;

public class Soal03 {
	public static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		System.out.print("input N : ");
		int n = Integer.parseInt(input.nextLine());
		int number = 1;

		for (int i = 0; i < n; i++) {
			System.out.println(number + "\t");
			number = number + 3;
		}

	}

}
