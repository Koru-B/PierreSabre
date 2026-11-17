package histoire;

import personnages.Humain;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain paul = new Humain("Paul", "Vodka", 54);
		
		paul.direBonjour();
		paul.acheter("une boisson", 12);
		paul.boire();
		paul.acheter("un jeu", 2);
		paul.acheter("un kimono", 50);
	}
}
