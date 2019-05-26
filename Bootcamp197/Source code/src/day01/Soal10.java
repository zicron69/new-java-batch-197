package day01;

import java.util.Scanner;

public class Soal10 {

	public static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		System.out.println("Input : ");

		int n = Integer.parseInt(input.nextLine());
		int number = 3;

		for (int i = 1; i <= n; i++) {
			if (i % 4 == 0) {
				System.out.println("XXX");
			} else {
				System.out.println(number);
			}
			number = number * 3;
		}

	}

}
