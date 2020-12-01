package br.edu.univas.controller;


import br.edu.univas.model.contModel;

public class saldo {
	
	public saldo(contModel[] count) {
		int valor = 0;
		for (int i = 0; i < count.length; i++) {
			if(count[i] != null) {
				valor++;				
			}
		}
		
		if(valor > 0) {
			System.out.println("Saldo: " + count[valor - 1].valor);			
		}
	}
}