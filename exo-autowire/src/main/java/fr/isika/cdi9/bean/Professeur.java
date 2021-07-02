package fr.isika.cdi9.bean;

public class Professeur implements IPersonne {
	
	private float salaire;

	public float getSalaire() {
		return salaire;
	}

	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}

	@Override
	public void sePresenter() {
		// TODO Auto-generated method stub
		System.out.println("Je suis un prof, salaire :"+salaire);
		
	}

}
