package personnages;

public class Humain {
	private String nom;
	private String boisson;
	protected int argent;

	public Humain(String nom, String boisson, int argent) {
		super();
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	protected String parler(String texte) {
		return "(" + nom + ") - " + texte;
	}

	public void direBonjour() {
		System.out.println(parler("Bonjour ! Je m\'appelle " + nom + " et j'aime boire du " + boisson + "."));
		;
	}

	public void boire() {
		System.out.println(parler("Mmmm, un bon verre de " + boisson + "! GLOUPS !"));
	}

	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			System.out.println(parler(
					"J\'ai " + argent + " en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous."));
			perdreArgent(prix);
		} else {
			System.out.println(parler("Je n\'ai plus que " + argent + " en poche. Je ne peux même pas m'offrir " + bien
					+ " à " + prix + " sous."));
		}
	}

	private void perdreArgent(int perdre) {
		argent -= perdre;
	}
}