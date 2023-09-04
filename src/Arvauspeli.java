import java.util.Scanner;

public class Arvauspeli {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		String vastaus = "Lauri";
		String input = "";
		int arvauksia = 0;
		
		System.out.println("Arvaa nimeni (kirjoita 'loppu' lopettaaksesi)");
		
		while (!input.equalsIgnoreCase("loppu")) {
		input = in.nextLine();	
		
		if (input.equals("loppu"))
			break;
		arvauksia++;
		if (input.equalsIgnoreCase(vastaus)) {
			System.out.println ("Onneksiolkoon!");
			break;
		}
		else {
			System.out.println("Arvaa nimeni (kirjoita 'loppu' lopettaaksesi)");
		}
		
		}
		System.out.println ("Arvasit " + arvauksia + " kertaa. ");
		
	}
	
}