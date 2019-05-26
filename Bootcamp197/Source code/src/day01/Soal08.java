package day01;

import java.util.Scanner;

public class Soal08 {
	public static java.util.Scanner input;
	
	public static void main(String[] args) {
	
		input = new Scanner(System.in);
	System.out.println("input your number : ");
		int n = Integer.parseInt(input.nextLine());

		int number=3;
		
		for(int i = 1; i <= n; i++) {
			{
			System.out.println(number +"\t");
			number=number*3;
		}
	
		}
	}

}
