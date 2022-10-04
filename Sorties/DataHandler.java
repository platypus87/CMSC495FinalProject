package Sorties;

/**
 * This class handles reading/writing data from external source Imagining a .txt
 * file stored on user's PC It will store sortie data, provide sortie data to
 * GUI class, possibly encrypt/decrypt or upload sortie data.
 */
public class DataHandler {
	Sortie arrSortie[];
	// TODO build DataHandler lol

	public void addSortie(Sortie s) {
		if (arrSortie == null) {
			Sortie newArr[] = new Sortie[1];
			newArr[0] = s;
			arrSortie = newArr;
		} else {
			int n = arrSortie.length;
			Sortie newArr[] = new Sortie[n + 1];
			for (int i = 0; i < n; i++) {
				newArr[i] = arrSortie[i];
			}
			newArr[n] = s;

			arrSortie = newArr;
		}
	}

	public void printSorties() {
		System.out.println("****PRINTING SORTIES SAVED****");
		for (int i = 0; i < arrSortie.length; i++) {
			arrSortie[i].printSortie();
		}
		System.out.println("****SORTIES PRINTED ABOVE****");
	}
}
