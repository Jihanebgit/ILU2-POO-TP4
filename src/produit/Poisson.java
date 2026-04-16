package produit;

public class Poisson extends Produit {
	private String nom;
	private String date;
	private Unite unite;

	public Poisson(String nom, Unite unite, String date) {
		super("poisson");
		this.unite = Unite.piece;
	}

	@Override
	public void decrireProduit() {
		System.out.println(getNom()+ " pêchés "+getdate());
	}

	private String getdate() {
		return this.date;
	}
}
