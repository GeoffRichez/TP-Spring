package fr.isika.cdi9.spring.bean;

public class HelloWorld implements ISalutation{

	private String prenom;
	
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public void direBonjour() {
		System.out.println("Hello "+prenom);
		
	}

}
