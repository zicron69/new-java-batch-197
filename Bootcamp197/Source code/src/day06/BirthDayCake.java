package day06;

public class BirthDayCake {

	public static void main(String[] args) {
		int case1 = birthdayCakeCandles(new int[] { 1, 3, 2, 5, 7, 4, 7, 6, 8, 9, 6, 9 });
	System.out.println(case1);
	}

	static int birthdayCakeCandles(int[] ar) {
		int hasil = 1;
		int max = ar[0];
		for (int i = 1; i < ar.length; i++) {
			if (ar[i] == max) {
				hasil++;
			}
			if (ar[i] > max) {
				max = ar[i];
				hasil = 1;
			}
		}
		return hasil;
	}
}
