package vlada;

import java.util.Scanner;

public class primer10 {

	public static void main(String[] args) {
		// 15. Ucitati dvodimenzionalni niz - matricu nxm.
		// Izracunati i ispisati a) aritmetičku sredinu svih elemenata

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
		int s = 0,srednja = 0;
		System.out.println("Srednja vrednost svih elemenata dvodimenzionalnog niza je: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
					s += niz[i][j];
					srednja = s / (red * kolona);
			}

		}
		System.out.println(srednja);
		sc.close();

	}

}
