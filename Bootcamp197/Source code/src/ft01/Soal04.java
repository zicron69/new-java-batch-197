package ft01;

import java.util.Scanner;

public class Soal04 {
	public static Scanner input;

	public static void main(String[] args) {
		System.out.println("Input kalimat :");

		Scanner scanner = new Scanner(System.in);

		String kalimat = scanner.nextLine();

		StringBuilder ubahKata = new StringBuilder();
		// untuk merubah string menjadi array menggunakan method split
		// serta memisahkan kalimat menjadi perkata
		for (String word : kalimat.split(" ")) {

			ubahKata.append(gantiKata(word, '*'));

			ubahKata.append(" ");

		}

		System.out.println(ubahKata);

	}
													// replacer untuk mengganti kata lama ke kata baru
	public static String gantiKata(String word, char replacer) {
		
		// StringBuilder class yang digunakan untuk membuat objeck string agar bisa dimodifikasi
		StringBuilder kata = new StringBuilder();
		
		//kondisi dmana hanya hurup yang lebih dari 2 yang bisa di ganti
		if (word.length() > 2) {
		
			//membuat hurup pertamat tetap sebagi hurupp
			kata.append(word.charAt(0));
//			 untuk mencetak * <4
			for (int i = 1; i < word.length()-1 ; i++) {

				kata.append(replacer);

			}
			
			//membuat hurup terakhir tak berubah dengan word.lenght-1
			kata.append(word.charAt(word.length() - 1));

			return kata.toString();

		}

		return word;

	}

}