package fr.isika.cdi9.bean;

public class Etudiant implements IPersonne{
	
	private String numEtudiant;

	@Override
	public void sePresenter() {
		// TODO Auto-generated method stub
		System.out.println("Je suis un étudiant ");
	}

	public String getNumEtudiant() {
		return numEtudiant;
	}

	public void setNumEtudiant(String numEtudiant) {
		this.numEtudiant = numEtudiant;
	}
	
}
