package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {

	private String nom;
	private int poids;
	private Unite unite;
	private Gaulois chasseur;

	public Sanglier(String nom, int poids, Gaulois chasseur) {
		super("sanglier");
		this.unite=Unite.kg;
	}
	
	@Override
	public void decrireProduit() {
		System.out.println(getNom()+ " de "+getpoids()+ this.unite + " chassé par ");
	}

	private int getpoids() {
		return this.poids;
	}
}
