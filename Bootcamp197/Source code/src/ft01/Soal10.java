package ft01;

import java.util.Scanner;

public class Soal10 {
	public static Scanner input;

	public static void main(String[] args) {
		System.out.println("Masukkan kalimat: ");

		Scanner input = new Scanner(System.in);

		System.out.println(Soal10.getOutput(input.nextLine()));

	}
	//buat method untuk hasil cek
	public static String getOutput(String huruf) {

		return (kalimat(huruf)) ? "PANGRAM" : "BUKAN PANGRAM";

	}
//method untuk cek kalimat
	public static boolean kalimat(String huruf) {
// lowecase untuk merubah jika ada hurup kapital ke hurup kecil
		String lowerhuruf = huruf.toLowerCase();
//melakukan cek kaliamat dari hurup a sampai z dan disimpan dalam 'kata'
		for (char kata = 'a'; kata <= 'z'; kata++) {
			//cek kondisi jika ada huruf yang tidak di simpan
			if (lowerhuruf.indexOf(kata) < 0)
				return false;

		}

		return true;

	}

}
