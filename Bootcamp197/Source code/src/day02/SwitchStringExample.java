package day02;

public class SwitchStringExample {

	public static void main(String[] args) {
		String leveString = "Expert";
		
		int level = 0;
		
		switch (leveString) {
		case "Beginner":
			level = 1;
			break;
		case "Intermediate":
			level = 2;
			break;
		case "Expert":
			level = 3;
			break;
			default:
				level = 0;
		}
		System.out.println("Your Level  is : " + level);
			
		
	}

}
