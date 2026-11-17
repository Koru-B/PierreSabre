package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain paul = new Humain("Paul", "Kombucha", 54);
		Commercant marco = new Commercant("Marco", null, 20);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shoshu", 60);
		
		paul.direBonjour();
		paul.acheter("une boisson", 12);
		paul.boire();
		paul.acheter("un jeu", 2);
		paul.acheter("un kimono", 50);
		
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		
		yaku.direBonjour();
		yaku.extorquer(marco);
		
		roro.direBonjour();
		roro.donner(marco);
		
		roro.provoquer(yaku);
	}
}