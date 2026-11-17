package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, String boisson, int argent) {
		super(nom, "thé", argent);
	}

	public int seFaireExtorquer() {
		System.out.println(parler("J\'ai tout perdu ! Le monde est trop injuste..."));
		int somme = argent;
		argent = 0;
		return somme;
	}
	
	public void recevoir(int don) {
		System.out.println(parler(don + " sous ! Je te remercie généreux donateur !"));
		argent += don;
	}
}
