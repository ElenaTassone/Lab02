package it.polito.tdp.alien;

import java.util.*;
public class WordEnhanced {
	
	private String parola;
	private List<String> traduzioni = new LinkedList<String>();
	
	public void setParola(String s){
		parola=s;
	}
	
	public String getParola() {
		return parola;
	}

	public void setTraduzione(String traduzione) {
		for(String s: traduzioni){
			if(s.compareTo(traduzione)==0)
				return;
			}
		
			traduzioni.add(traduzione);
			
			
	}
	
	public String getTraduzione(){
		String result = "";
		for(String t : traduzioni){
			result = result+t+"\n";
			}
		return result;
		}
	
	public int compare2(String parola2, int indice){
		String nuovapaarola = this.parola.substring(0, indice)+this.parola.substring(indice+1);
		String nuovapaarola2 =parola2.substring(0, indice)+parola2.substring(indice+1);
		if(nuovapaarola.compareTo(nuovapaarola2)==0)
		return 0;
		else return -1;
		
	}
	
	
	

}
