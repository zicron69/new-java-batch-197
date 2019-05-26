package day06;

import day05.Orang;

public class MainOOP {

	public static void main(String[] args) {

		Mahasiswa mhs = new Mahasiswa();
		mhs.id = 11;
		mhs.nim = "1234";
		mhs.nama = "Adhit";
		mhs.jk = "Laki-Laki";
		mhs.alamat = "Jakarta";
		mhs.noTelp = "098765";
		mhs.angkatan = "2014";
		mhs.fakultas = "MIPA";
		mhs.jurusan = "Matematik";
		mhs.ipk = 3.1;
		System.out.println("Data Mahasiswa");
		mhs.cetakData();
		System.out.println();

		System.out.println("Data Staff");
		Staff stf = new Staff();
		stf.id = 11;
		stf.nik = "911";
		stf.nama = "Udin";
		stf.jk = "Pria";
		stf.alamat = "Jakarta";
		stf.noTelp = "0876890";
		stf.departemen = "kebersihan";
		stf.jabatan = "KOB";
		stf.gaji = 4098765;
		Orang ats1 = new Orang(4, "Budi", "Jakarat", "Pria", "0876787");
		stf.atasan = ats1;
		stf.cetakData();
		System.out.println();

		System.out.println("Data Dosen");
		Dosen dsn = new Dosen();
		dsn.id = 21;
		dsn.nik = "212";
		dsn.nama = "Jhon";
		dsn.alamat = "Depok";
		dsn.jk = "laki";
		dsn.noTelp = "097546";
		dsn.fakultas = "MIPA";
		dsn.jabatan = "Dekan";
		dsn.spesialis = "IPA";
		dsn.gaji = 10432876;
		dsn.cetakData();
	}

}
