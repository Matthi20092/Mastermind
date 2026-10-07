package mastermind;

import java.util.Scanner;

public class MastermindTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Mastermind Test");

		// Kleuren

		String geelPin = "geel";
		String groenPin = "groen";
		String blauwPin = "blauw";
		String roodPin = "rood";
		String paarsPin = "paars";
		String oranjePin = "oranje";

		// Kleuren

		String zwartPin = "zwart";
		String witPin = "wit";
		String leegPin = "Leeg";
		System.out.println("Speler 1 = Codemaker");
		System.out.println("Speler 2 = Codekraker");

		// Geheime code & pogingen

		String[] geheimeCodes = { blauwPin, roodPin, oranjePin, paarsPin };
		String[] pogingen = new String[4];

		// User input voor poging 1

		boolean gewonnen = false;
		for (int ronde = 1; ronde <= 10; ronde++) {
			int zwartePinnen = 0;
			int wittePinnen = 0;
			for (int i = 0; i < 4; i++) {
				System.out.println("Rij " + ronde + ", vakje " + (i + 1) + ":");
				pogingen[i] = input.nextLine();
			}
			// Printen van de ingevoerde code"

			System.out.println("Jouw poging is: ");
			for (int i = 0; i < pogingen.length; i++) {
				if (i < pogingen.length - 1) {
					System.out.println(pogingen[i] + " ");
				} else {
					System.out.println(pogingen[i]);
				}
			}

			System.out.println("De code is: " + geheimeCodes[0] + " " + geheimeCodes[1] + " " + geheimeCodes[2] + " "
					+ geheimeCodes[3]);
			// Controleren van code

			for (int i = 0; i < 4; i++) {

				if (pogingen[i].equalsIgnoreCase(geheimeCodes[i])) {
					zwartePinnen++;
				} else if (pogingen[i].equalsIgnoreCase(geheimeCodes[0])
						|| pogingen[i].equalsIgnoreCase(geheimeCodes[1])
						|| pogingen[i].equalsIgnoreCase(geheimeCodes[2])
						|| pogingen[i].equalsIgnoreCase(geheimeCodes[3])) {
					wittePinnen++;
				}
			}

			if (zwartePinnen >= 4) {
				// have won
				System.out.println("Je hebt gewonnen!");
				gewonnen = true;
				break;
			} else {
				System.out.println("Je hebt: " + zwartePinnen + " zwarte pinnen en: " + wittePinnen + " witte pinnen.");
				zwartePinnen = 0;
				wittePinnen = 0;
			}
			if (ronde > 9) {
				System.out.println("Je hebt de " + ronde + " beurten gebruikt en de code niet kunnen raden.");
			}
		}

	}
}