package fr.isika.cdi9.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Instrument {

	@Value("guitare")
	private String nomInstrument;

	public String getNomInstrument() {
		return nomInstrument;
	}

	public void setNomInstrument(String nomInstrument) {
		this.nomInstrument = nomInstrument;
	}
}
