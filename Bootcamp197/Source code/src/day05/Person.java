package day05;

import java.util.Scanner;

public class Person {
// properti
	private int id;
	private String nama;
	private String alamat;
	private int age;

	static Scanner input = new Scanner(System.in);
	
	
	// method
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//membuat array dari objek
	public static Person [] arrayPerson() {
		
	System.out.println("Berapa data yang akan dibuat ? ");
	int n = input.nextInt();
	System.out.println("*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#");
	
	Person arrayOrang[] = new Person[n];
	
	for (int i = 0; i < arrayOrang.length; i++) {
		System.out.print("Input ID : " + (i + 1) );
		
		
	}
	
	
	
	
	
	
	return arrayOrang;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}