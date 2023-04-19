package vlada;

import java.util.Scanner;

public class primer11 {

	public static void main(String[] args) {
		// b) aritmetičku sredinu pozitivnih elemenata

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj redova");
		int red = sc.nextInt();
		System.out.println("Unesite broj kolona");
		int kolona = sc.nextInt();

		int niz[][] = new int[red][kolona];

		System.out.println("Unesite elemente niza");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("niz[" + i + "," + j + "] = ");
				niz[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrica: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}
		int s = 0, srednja = 0, brojac = 0;
		System.out.println("Srednja vrednost pozitivnih elemenata dvodimenzionalnog niza je: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if(niz[i][j] > 0) {
				brojac++;
				s += niz[i][j];
				}
			}
			srednja = s / (brojac);
		}
		System.out.println(srednja);
		sc.close();
	}

}
