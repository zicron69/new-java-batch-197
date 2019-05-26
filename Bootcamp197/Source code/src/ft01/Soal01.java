package ft01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Soal01 {

	public static void main(String[] args) {
		System.out.println(harga(new int[] { 34, 26, 44 }, new int[] { 21, 39, 33 }, 20));

	}

	static int harga(int[] kaca, int[] baju, int uang) {

		int hasil = 0;
		List<Integer> totalHarga = new ArrayList<Integer>();
		// untuk menjumlahkan harga barang dan di loop sebanyak array yang ada
		for (int i = 0; i < kaca.length; i++) { // loop harga kacamata
			for (int j = 0; j < baju.length; j++) { // harga baju
				// kondisi jika harga kedua barang tidak melebihi uang
				if (kaca[i] + baju[j] <= uang) {
					// total harga kedua barang
					totalHarga.add(kaca[i] + baju[j]);

				}
			}
		}
		if (totalHarga.size() == 0) {
			System.out.println( "dana tidak cukup");
		} else {
			hasil = Collections.max(totalHarga);
		}
		return hasil;
	}
}
