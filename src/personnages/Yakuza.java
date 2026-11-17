package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}
	
	public int getReputation() {
		return reputation;
	}

	public void extorquer(Commercant victime) {
		System.out.println(parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?"));
		System.out.println(parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !"));
		
		int gain = victime.getArgent();
		victime.seFaireExtorquer();
		argent += gain;
		reputation += 1;
		
		System.out.println(parler("J'ai piqué les " + gain + " sous de "
				+ victime.getNom() + ", ce qui me fait " + argent
				+ " sous dans ma poche. Hi ! Hi !"));
	}
	
	public int perdre() {
		System.out.println(parler("J\'ai perdu mon duel et mes " + argent 
				+ " sous, snif... J\'ai déshonoré le clan de " + clan + "."));
		reputation -= 1;
		if (reputation <= 0) {
			reputation = 0;
		}
		argent = 0;
		return reputation;
	}
	
	public void gagner(int gain) {
		argent += gain;
		reputation += 1;
		System.out.println(parler("Ce ronin pensait vraiment battre " + getNom() 
				+ " du clan " + clan + " ?\nJe l\'ai dépouillé de ses " + gain 
				+ " sous !"));
	}
}
