package mastermindTest;

import java.util.Scanner;

public class MastermindTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

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
