package day01;

import java.util.Scanner;

public class Soal07 {
	public static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		System.out.println("Input Your Number : ");
		int n = Integer.parseInt(input.nextLine());
		int number = 2;

		for (int i = 1; i <= n; i++) {
			System.out.println(number);
			number = number * 2;

		}
	}
}