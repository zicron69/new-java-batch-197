package day02;

import java.util.Scanner;

public class Soal01 {
	public static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		System.out.print("input N1 : ");
		int n1 = Integer.parseInt(input.nextLine());
		System.out.print("input N2 : ");
		int n2 = Integer.parseInt(input.nextLine());
		System.out.print("");
		int angka = 1;

		table(n1, angka);
		test(n2, angka);
	}

	public static void table(int tab, int tes) {
		for (int i = 0; i < tab; i++) {
			System.out.print(i + "\t");
		}
		System.out.println("");
		for (int j = 0; j < tab; j++) {
			System.out.print(tes + "\t");
			tes = tes * 3;
		}
	}

	public static void test(int a, int b) {
		int c = 0;
		System.out.println("");
		for (int i = 0; i < a; i++) {
			if (i < a - 1) {
				c = c + b;
				System.out.print(b + " + ");
				b = b * 3;

			} else {
				System.out.print(b + " = ");
				c = c + b;
				System.out.print(c);
			}
		}

	}

}
