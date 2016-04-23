import java.util.Scanner;

public class TowerHanoi {
	/** Hoved metode */
	public static void main(String[] args) {
		// Lag en Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Skriv inn antall brikker: ");
		int n = input.nextInt();

		// Print løsningen med bruk av en rekursiv metode.
		System.out.println("Stegene er som følger:");
		flyttBrikker(n, 'A', 'B', 'C');
	}

	/**
	 * Metoden for å finne løsningen til hvordan brikkene skal flyttes slik at
	 * spillet blir løst.
	 */
	public static void flyttBrikker(int n, char fraTaarn, char tilTaarn, char auxTaarn) {
		if (n == 1) // Stoppe tilstand.
			System.out.println("Flytt brikke " + n + " fra " + fraTaarn + " til " + tilTaarn);
		else {
			flyttBrikker(n - 1, fraTaarn, auxTaarn, tilTaarn);
			System.out.println("Flytt brikke " + n + " fra " + fraTaarn + " til " + tilTaarn);
			flyttBrikker(n - 1, auxTaarn, tilTaarn, fraTaarn);
		}
	}
}