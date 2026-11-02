package mastermind;

import java.util.Scanner;

public class MastermindTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Mastermind Test. Dubbele kleuren bestaan niet.");

		// Kleuren
		String[] kleuren = { "geel", "groen", "blauw", "rood", "paars", "oranje" };

		// Kleuren
		String[] controleKleuren = {"zwart", "wit",  "Leeg"};
		System.out.println("Speler 1 = Codemaker");
		System.out.println("Speler 2 = Codekraker");

		// Geheime code & pogingen

		String[] geheimeCodes = { kleuren[2], kleuren[3], kleuren[5], kleuren[4] };
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
					System.out.print(pogingen[i] + " ");
			}
			System.out.println();
			// Controleren van code
			
			String[] feedback = new String[4];

			for (int i = 0; i < 4; i++) {

				if (pogingen[i].equalsIgnoreCase(geheimeCodes[i])) {
					feedback[i] = controleKleuren[0];
					zwartePinnen++;
				} else if (pogingen[i].equalsIgnoreCase(geheimeCodes[0])
						|| pogingen[i].equalsIgnoreCase(geheimeCodes[1])
						|| pogingen[i].equalsIgnoreCase(geheimeCodes[2])
						|| pogingen[i].equalsIgnoreCase(geheimeCodes[3])
						) {
					wittePinnen++;
					feedback[i] = controleKleuren[1];
				}else {
					feedback[i] = controleKleuren[2];
				}
			}
			System.out.print("Pinnen: ");
			for (String pin : feedback) {
				System.out.print(pin + " ");
			}

			if (zwartePinnen == 4) {
				// have won
				System.out.println();
				System.out.println("Je hebt gewonnen!");
				gewonnen = true;
				break;
			} else {
				System.out.println();
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