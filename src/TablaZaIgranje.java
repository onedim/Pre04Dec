
public class TablaZaIgranje {

	public static void main(String[] args) {
		System.out.print("Unesite velicinu igraceg broja\n");
		int size=TextIO.getInt();
		
		int[][] table = poljeIgre(size);
		
		
		table=fillMines(table);
		printTable(table);
	}

	public static int[][] poljeIgre(int size) {
		int[][] table = emptyTable(size);
		table = fillMines(table);
		return table;

	}
	
	public static int[][] fillMarkers2(int[][] table){
		for (int i =0; i<table.length;i++){
			for (int j =0; j<table.length;j++){

			}

		}
		return table;
	}

	public static void printTable(int[][] table) {
		for (int i = 0; i < table.length; i++) {
			System.out.print("|");
			for (int j = 0; j < table[i].length; j++) {
				System.out.printf("%2d |", table[i][j]);
			}
			System.out.println();
		}

	}

	public static int[][] emptyTable(int size) {
		int[][] table = new int[size][size];
		return table;

	}

	/**
	 * random broj
	 * 
	 * @param min
	 * @param max
	 * @return
	 */
	public static int randomBroj(int min, int max) {
		int randBr = (int) (min + Math.random() * (max - min));
		return randBr;

	}

	/**
	 * funkcija puni mine i pazi da ne postavlja na istom mjestu
	 * 
	 * @param table
	 * @return
	 */
	public static int[][] fillMines(int[][] table) {
		int brojMina = (int)(0.6 * table.length);
		int brojac = 0;
		while (brojac <= brojMina) {
			int x = randomBroj(0, table.length);
			int y = randomBroj(0, table.length);
			if (table[x][y] != -1) {
				table[x][y] = -1;
				brojac++;
			}
		}

		return table;
	}

}