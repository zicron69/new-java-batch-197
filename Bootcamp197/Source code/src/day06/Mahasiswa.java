package day06;

import day05.Orang;

public class Mahasiswa extends Orang {
	public String nim;
	public String fakultas;
	public String jurusan;
	public String angkatan;
	public Double ipk;

	public void cetakData() {
		super.cetakData();
		System.out.println("NIM \t\t :" + nim);
		System.out.println("Fakultas \t :" + fakultas);
		System.out.println("Jurusan \t :" + jurusan);
		System.out.println("Angkatan \t :" + angkatan);
		System.out.println("IPK \t\t :" + ipk);
System.out.println("###########################################################");
	}
}
