import java.util.Scanner;

public class SnuTekst {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Skriv inn tekst som skal snues reverseres: ");
		String s = scanner.nextLine();
		System.out.println("Reversert: ");
		baklengs(s);
	}

	public static void baklengs(String tekst) {

		if (tekst.length() == 1) {
			System.out.print(tekst);
		} else {

			baklengs(tekst.substring(1, tekst.length()));
			System.out.print(tekst.substring(0, 1));

		}
	}
}