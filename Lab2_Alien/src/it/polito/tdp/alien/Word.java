package it.polito.tdp.alien;

public class Word {
	
	private String parola;
	private String traduzione;
	
	public Word(String parola, String traduzione) {
		super();
		this.parola = parola;
		this.traduzione = traduzione;
	}

	public String getParola() {
		return parola;
	}

	public String getTraduzione() {
		return traduzione;
	}

	public void setTraduzione(String traduzione) {
		this.traduzione = traduzione;
	}
	
	
}
