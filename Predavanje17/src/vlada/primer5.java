package vlada;

public class primer5 {

	public static void main(String[] args) {
		
		
		
		int matrica[][] = { {1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1} };

		
		System.out.println("Elementi dvodimenzionalnog niza su: ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Elementi dvodimenzionalnog niza sporedne dijagonale i iznad nje su: ");
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= i; j--) {
				// if(j >= i)
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
	}

}
