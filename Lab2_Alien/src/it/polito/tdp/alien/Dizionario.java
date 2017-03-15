package it.polito.tdp.alien;

import java.util.*;

public class Dizionario {

	private List<WordEnhanced> parole = new LinkedList <WordEnhanced> (); 
	
	public String salvaParola(String parola, String traduzione){
		WordEnhanced daAggiungere = new WordEnhanced();
		
		if(parola.matches("[A-Za-z]*") && traduzione.matches("[A-Za-z]*")){
			parola=parola.toLowerCase();
			traduzione=traduzione.toLowerCase();
//			for(Word p : parole){
//				if (p.getParola().compareTo(parola)==0){
//					p.setTraduzione(traduzione);
//					return traduzione;
//					}
//				}
//					
//			Word daAggiungere = new Word (parola, traduzione);
//			parole.add(daAggiungere);
//		}
//		return traduzione;
			
			for(WordEnhanced p : parole){
				if (p.getParola().compareTo(parola)==0){
					p.setTraduzione(traduzione);
					return p.getTraduzione();
					}
				}
			
			daAggiungere.setParola(parola);
			daAggiungere.setTraduzione(traduzione);
			parole.add(daAggiungere);
		}
		return daAggiungere.getTraduzione();
	}
	
//	public String traduci(String parola){
//		if(parola.matches("[A-Za-z]*")){
//		parola.toLowerCase();
//		for(Word p : parole){
//			if (p.getParola().compareTo(parola)==0)
//				return p.getTraduzione();
//			}	
//		}
//		return "null";
//	}

	public String traduci(String parola){
		if(parola.matches("[A-Za-z]*")){
		parola.toLowerCase();
		for(WordEnhanced p : parole){
			if (p.getParola().compareTo(parola)==0)
				return p.getTraduzione();
			}	
		}
		if(parola.contains("?")){
			char  char_array [] = parola.toCharArray();
			int indice=0;
			for(int i = 0; i<char_array.length; i++){
				if(char_array[i]=='?'){
					indice=i;
					break;
				}
			}
			parola.toLowerCase();
			for(WordEnhanced p : parole){
				if (p.compare2(parola,indice)==0){
					return p.getTraduzione();
				}
		
			}
			
		}
		return "null";
		}
	}