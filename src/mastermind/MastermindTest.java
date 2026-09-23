package mastermindTest;

import java.util.Scanner;

public class MastermindTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Mastermind Test");
		String geelPin = "geel";
		String groenPin = "groen";
		String blauwPin = "blauw";
		String roodPin = "rood";
		String paarsPin = "paars";
		String oranjePin = "oranje";

		String zwartPin = "zwart";
		String witPin = "wit";
		String leegPin = "Leeg";
		System.out.println("Speler 1 = Codemaker");
		System.out.println("Speler 2 = Codekraker");

		String geheimecode1 = blauwPin;
		String geheimecode2 = roodPin;
		String geheimecode3 = oranjePin;
		String geheimecode4 = paarsPin;
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
		System.out.println("De code is: ");
		System.out.println(geheimecode1 + " " + geheimecode2 + " " + geheimecode3 + " " + geheimecode4);

		if (poging1.equalsIgnoreCase(geheimecode1)) {
			
		} else if (poging1.equalsIgnoreCase(geheimecode2)) {

		}
	}
}