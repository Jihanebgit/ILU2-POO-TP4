package produit;


public abstract class Produit {
	private String nom;
	private Unite unite;
	public Produit(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	};

	public void decrireProduit() {
		//todo
	}
}
