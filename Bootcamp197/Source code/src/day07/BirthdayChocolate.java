package day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class BirthdayChocolate {

	public static void main(String[] args) {
		System.out.println(birthday(new ArrayList<Integer>(Arrays.asList(2,2,1,3,2)),4,2));

	}

	static int birthday(List<Integer> s, int d, int m) {
		int result = 0;
		for (int i = 0; i < s.size(); i++) {
			int c = 0;
			for (int j = 0; j < m; j++) {
				if (i + j < s.size()) {
					c += s.get(i + j);
				}
			}
			if (c == d) {
				result++;
			}

		}

		return result;
	}
}