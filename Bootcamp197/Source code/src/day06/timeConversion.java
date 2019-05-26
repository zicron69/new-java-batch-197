package day06;

public class timeConversion {

	public static void main(String[] args) {
		System.out.println(timeConversion("07:05:45PM"));
	}

	static String timeConversion(String s) {
		String hasil = "oke";
		String waktu = s.substring(8);
		int jam = Integer.parseInt(s.substring(0, 2));
		if (waktu.equals("PM")) {
			if (jam < 12)
				jam = jam + 12;
			hasil = String.format("%02d", jam) + s.substring(2, 8);
		} else {
			if (jam == 12) {
				jam = 0;
				hasil = String.format("%02d", jam) + s.substring(2, 8);
			} else {
				hasil = s.substring(0, 8);
			}

		}
		return hasil;
	}
}
