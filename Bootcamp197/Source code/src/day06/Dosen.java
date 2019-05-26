package day06;

import day05.Orang;

public class Dosen extends Orang {
	public String nik;
	public String spesialis;
	public String jabatan;
	public String fakultas;
	public int gaji;
	
	public void cetakData() {
		super.cetakData();
		System.out.println("NIK \t\t :" + nik);
		System.out.println("Spesialis \t :" + spesialis);
		System.out.println("Jabatan \t :" + jabatan);
		System.out.println("Fakultas \t :" + fakultas);
		System.out.println("Gaji \t\t :" +"Rp. "+ gaji);
System.out.println("###########################################################");
	}
	

}
