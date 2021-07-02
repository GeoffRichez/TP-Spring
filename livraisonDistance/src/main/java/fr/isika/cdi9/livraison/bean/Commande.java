package fr.isika.cdi9.livraison.bean;

public class Commande {

	private Fournisseur fournisseur;
	private Client client;

	public void passerUneCommande() {
		System.out.println("Merci d'avoir effectué la commande " + client.getNom());
		System.out.println("Le fournisseur :" + fournisseur.getNom() + " sera averti de cette dernière; ");
	}

	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}
