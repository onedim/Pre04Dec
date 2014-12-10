import java.util.Arrays;


public class Vjezba1 {

	public static void main(String[] args) {
		int red = TextIO.getInt();
		int kolona = TextIO.getInt();
		int niz[][] = new int[red][kolona];
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				int clan = TextIO.getInt();
				niz[i][j] = clan;
			}
		}
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(niz[i][j] + " ");
			}
		}


	}
}
	
