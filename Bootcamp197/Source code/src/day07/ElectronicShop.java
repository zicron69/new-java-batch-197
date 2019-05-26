package day07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ElectronicShop {

	public static void main(String[] args) {
		System.out.println(getMoneySpent(new int[] { 3, 1 }, new int[] { 5, 2, 8 }, 1));
		System.out.println(getMoneySpent(new int[] { 4 }, new int[] { 5 }, 5));
	}

	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		int a = 0;
		List<Integer> x = new ArrayList<Integer>();
		for (int i = 0; i < keyboards.length; i++) {
			for (int j = 0; j < drives.length; j++) {
				if (keyboards[i] + drives[j] <= b) {
					x.add(keyboards[i] + drives[j]);
				}
			}
		}
		if (x.size() == 0) {
			a = -1;
		} else {
			a = Collections.max(x);

		}
		return a;
	}

}
