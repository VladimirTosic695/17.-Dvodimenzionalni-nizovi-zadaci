package vlada;

import java.util.Scanner;

public class primer3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj redova");
		int red = sc.nextInt();
		System.out.println("Unesite broj kolona");
		int kolona = sc.nextInt();

		int matrica[][] = new int[red][kolona];

		System.out.println("Unesite elemente: ");

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.println("matrica [" + i + "," + j + "] = ");
				matrica[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elementi dvodimenzionalnog niza su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
		int s = 0;
		System.out.println("Elementi dvodimenzionalnog niza su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				int kvadrat = matrica[i][j] * matrica[i][j];
				System.out.print(kvadrat + " ");
				s+= kvadrat;
			}
			System.out.println();
		}
		System.out.println("Suma kvadrata elemenata je " +s);
	}

}
