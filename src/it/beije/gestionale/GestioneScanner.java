package it.beije.gestionale;

import java.util.Scanner;

public class GestioneScanner {

	public static String PrendiStringa() {
		Scanner ScanString = new Scanner(System.in);
		String sceltaStringa = ScanString.nextLine().toLowerCase();
		while (sceltaStringa.equals(" ") || sceltaStringa.equals("")) {
			System.out.println("Non hai inserito nessun valore, riprova.");
			sceltaStringa = ScanString.nextLine().toLowerCase();
		}
		return sceltaStringa;
	}

	public static int PrendiInt() {
		Scanner ScanString = new Scanner(System.in);
		Scanner ScanInt = new Scanner(System.in);
		int sceltaIntero= 0;
		if (ScanInt.hasNextInt()) {
			sceltaIntero = ScanInt.nextInt();
		} else {
			String svuotaStringa = ScanInt.nextLine();
			System.out.println("Hai inserito un valore errato, riprova");
			PrendiInt();
		}
		return sceltaIntero;
	}
}
