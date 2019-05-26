package day02;

public class ArrayExample1 {

	public static void main(String[] args) {
	int [] array1=new int [] {1, 2, 3, 4, 5};
	System.out.println(array1[0]);
	System.out.println(array1[4]);
	
	int hasil = 0;
	for (int a = 0; a < array1.length; a++) {
		System.out.println(array1[a]);
		hasil=hasil+array1[a];
	}
	}

}
