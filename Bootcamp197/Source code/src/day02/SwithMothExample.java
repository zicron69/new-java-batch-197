package day02;

public class SwithMothExample {

	public static void main(String[] args) {
		int month = 7;
		String monthstring = " ";
		
		switch (month) {
		case 1:
			monthstring = "1 - Januari";
			break;
		case 2:
			monthstring = "2 - Februari";
			break;
		case 3:
			monthstring = "3 - Maret";
			break;
		case 4:
			monthstring = "4 - April";
			break;
		case 5:
			monthstring = "5 - Mei";
			break;
		case 6:
			monthstring = "6 - Juni";
			break;
		case 7:
			monthstring = "7 - Juli";
			break;
		case 8:
			monthstring = "8 - Agustus";
			break;
		case 9:
			monthstring = "9 - September";
			break;
		case 10:
			monthstring = "10 - Oktober";
			break;
		case 11:
			monthstring = "11 - November";
			break;
		case 12:
			monthstring = "12 - Desember";
			break;
		default:
			System.out.println("Invalid Month");
		} System.out.println(monthstring);
	}

}
