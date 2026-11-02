package mastermind;

import java.util.*;
import java.lang.Math;

public class Mastermindyes {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int zwartepin, wittepin, rij;
		String code;
		String[] pogingen = new String[4];
		String[] codevakjes = new String[4];

		codevakjes[0] = "rood";
		codevakjes[1] = "blauw";
		codevakjes[2] = "paars";
		codevakjes[3] = "oranje";
		code = codevakjes[0] + " " + codevakjes[1] + " " + codevakjes[2] + " " + codevakjes[3];
		int i;

		rij = 0;
		zwartepin = 0;
		wittepin = 0;
		for (rij = 0; rij <= 9; rij++) {
			zwartepin = 0;
			wittepin = 0;
			for (i = 0; i <= 3; i++) {
				System.out.println("codevakje " + i + 1);
				pogingen[i] = input.nextLine();
			}
			if (codevakjes[0].equals(pogingen[0])) {
				zwartepin = zwartepin + 1;
			} else {
				if (codevakjes[1].equals(pogingen[0])) {
					wittepin = wittepin + 1;
				} else {
					if (codevakjes[2].equals(pogingen[0])) {
						wittepin = wittepin + 1;
					} else {
						if (codevakjes[3].equals(pogingen[0])) {
							wittepin = wittepin + 1;
						}
					}
				}
			}
			if (codevakjes[1].equals(pogingen[1])) {
				zwartepin = zwartepin + 1;
			} else {
				if (codevakjes[0].equals(pogingen[1])) {
					wittepin = wittepin + 1;
				} else {
					if (codevakjes[2].equals(pogingen[1])) {
						wittepin = wittepin + 1;
					} else {
						if (codevakjes[3].equals(pogingen[1])) {
							wittepin = wittepin + 1;
						}
					}
				}
			}
			if (codevakjes[2].equals(pogingen[2])) {
				zwartepin = zwartepin + 1;
			} else {
				if (codevakjes[0].equals(pogingen[2])) {
					wittepin = wittepin + 1;
				} else {
					if (codevakjes[1].equals(pogingen[2])) {
						wittepin = wittepin + 1;
					} else {
						if (codevakjes[3].equals(pogingen[2])) {
							wittepin = wittepin + 1;
						}
					}
				}
			}
			if (codevakjes[3].equals(pogingen[3])) {
				zwartepin = zwartepin + 1;
			} else {
				if (codevakjes[0].equals(pogingen[3])) {
					wittepin = wittepin + 1;
				} else {
					if (codevakjes[1].equals(pogingen[3])) {
						wittepin = wittepin + 1;
					} else {
						if (codevakjes[2].equals(pogingen[3])) {
							wittepin = wittepin + 1;
						}
					}
				}
			}
			System.out.println("Je hebt " + zwartepin + "zwarte pin(s) en " + wittepin + "wittepin(s)");
			if (zwartepin >= 4) {
				rij = 9;
			}
		}
		if (zwartepin >= 4) {
			System.out.println("Goed gedaan! Je hebt de code geraden. " + code);
		} else {
			System.out.println("Helaas, je hebt de code niet kunnen raden, de code was: " + code);
		}
	}
}
