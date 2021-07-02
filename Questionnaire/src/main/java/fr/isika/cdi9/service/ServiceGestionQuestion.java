package fr.isika.cdi9.service;

import fr.isika.cdi9.bean.IQuestion;

public class ServiceGestionQuestion implements IServiceGestionQuestion {

	private IQuestion question;

	public IQuestion getQuestion() {
		return question;
	}

	public void setQuestion(IQuestion question) {
		this.question = question;
	}

	@Override
	public void genereLaQuestion() {
		// TODO Auto-generated method stub
		System.out.println("Voici la question : " + question.poseLaQuestion());
	}

}
