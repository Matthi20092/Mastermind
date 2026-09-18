package mastermindTest;

import java.util.Scanner;

public class MastermindTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Mastermind Test");
		String geelPin="Geel";
		String groenPin="Groen";
		String blauwPin="Blauw";
		String roodPin="Rood";
		String paarsPin="Paars";
		String oranjePin="Oranje";
		
		String zwartPin="Zwart";
		String witPin="Wit";
		String leegPin="Leeg";
		System.out.println("Speler 1 = Codemaker");
		System.out.println("Speler 2 = Codekraker");

		String poging1;
		String poging2;
		String poging3;
		String poging4;

		System.out.println("Rij 1, vakje 1:");
		poging1 = input.nextLine();

		System.out.println("Rij 1, vakje 2:");
		poging2 = input.nextLine();

		System.out.println("Rij 1, vakje 3:");
		poging3 = input.nextLine();

		System.out.println("Rij 1, vakje 4:");
		poging4 = input.nextLine();

		System.out.println(poging1 + " " + poging2 + " " + poging3 + " " + poging4);
	}

}
