package personnages;

public class Ronin extends Humain {
	private int honneur = 1;

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int don = argent/10;
		System.out.println(parler(beneficiaire.getNom() + ", prend ces " + don + " sous."));
		beneficiaire.recevoir(don);
		argent -= don;
	}
	
	public void provoquer(Yakuza adversaire) {
		System.out.println(parler("Je t\'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!"));
		if (honneur * 2 >= adversaire.getReputation()) {
			System.out.println(parler("Je t\'ai eu petit yakuza !"));
			honneur += 1;
			argent += adversaire.getArgent();
			adversaire.perdre();
		} else {
			System.out.println(parler ("J\'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup"));
			adversaire.gagner(argent);
			honneur -= 1;
			argent = 0;
		}
	}
}
