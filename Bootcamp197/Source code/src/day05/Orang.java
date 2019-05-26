package day05;

public class Orang {
	// membuat class
	public int id;
	public String nama;
	public String alamat;
	public String jk;
	public String noTelp;

// buat method Orang
	public Orang() {

	}

	// membuat contruktor
	public Orang(int id, String nama, String alamat, String jk, String noTelp) {
		this.id = id;
		this.nama = nama;
		this.alamat = alamat;
		this.jk = jk;
		this.noTelp = noTelp;
	}

	public void cetakData() {
		System.out.println("ID \t\t :" + id);
		System.out.println("Nama \t\t :" + nama);
		System.out.println("Alamat \t\t :" + alamat);
		System.out.println("Jenis Kelamin \t :" + jk);
		System.out.println("No Telpon \t :" + noTelp);

	}

}
