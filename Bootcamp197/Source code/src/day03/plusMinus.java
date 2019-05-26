package day03;

public class plusMinus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static void plusMinus(int[] array) {
		double a = 0;
		double b = 0;
		double c = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				a++;
			} else if (array[i] < 0) {
				b++;
			} else {
				c++;
			}

		}
		System.out.println(a / array.length);
		System.out.println(b / array.length);
		System.out.println(c / array.length);
	}

}
