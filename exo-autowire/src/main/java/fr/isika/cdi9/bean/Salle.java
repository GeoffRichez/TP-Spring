package fr.isika.cdi9.bean;

public class Salle {

	private Professeur prof;
	private Etudiant etudiant;
	
	public void listerPresents() {
		prof.sePresenter();
		etudiant.sePresenter();
	}

	public Professeur getProf() {
		return prof;
	}
	public void setProf(Professeur prof) {
		this.prof = prof;
	}
	public Etudiant getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
}
