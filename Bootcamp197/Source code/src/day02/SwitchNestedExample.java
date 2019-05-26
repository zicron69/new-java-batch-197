package day02;

public class SwitchNestedExample {

	public static void main(String[] args) {
		char branch = 'M';
		int collegeYear = 4;
		
		switch (collegeYear) {
		case 1:
			System.out.println("English, Math, Science");
			break;
		case 2:
			switch (branch) {
			case 'C':
				System.out.println("Operating System, Java, Data Structure");
			case 'E':
				System.out.println("Micro Processor, Logic Switching Theory");
				break;
			case 'M':
				System.out.println("Drawing, Manufacturing Machines");
				break;
		}
			break;
		case 3:
			switch (branch) {
			
			case 'C':
				System.out.println("Computer organizator, Multimedia");
				break;
			case 'E':
				System.out.println("Fundamental Of Logic Design, Microelectronic");
				break;
			case 'M':
				System.out.println("Internal Combustion Engines, Mechanical Vibration");
				break;
			}
			break;
		case 4:
			switch (branch) {
			
			case 'C':
				System.out.println("Data Communication and Networks, Multimedia");
				break;
			case 'E':
				System.out.println("Embedded System, Image Processing");
				break;
			case 'M':
				System.out.println("Production Technology, Thermal Engineering");
				break;
	} break;
		}
}
}