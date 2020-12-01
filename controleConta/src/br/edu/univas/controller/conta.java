package br.edu.univas.controller;

import java.util.Scanner;

import br.edu.univas.model.contModel;

public class conta {

	contModel[] newCount;

	public conta(contModel[] count) {
		System.out.println("Cadastre a conta:");
		newCount = count;
		this.input();
	}

	public void input() {
		Scanner in = new Scanner(System.in);
		boolean exit = false;
		int val = 0;
	
		for (int i = 0; i < newCount.length; i++) {
			if (newCount[i] != null) {
				val++;
			}
		}

		do {
			contModel count = new contModel();
			System.out.println("Descrição: ");
			count.Description = in.next();

			System.out.println("Data de Vencimento: ");
			count.DateVencimento = in.next();

			System.out.println("Valor");
			count.valor = in.nextFloat();

			System.out.println("Tipo");
			count.Type = in.next();
			
			newCount[val] = count;
			
			count.valor = this.receita(count.Type, val);
			
			exit = true;
			System.out.flush();

		} while (!exit);
	}

	public float receita(String type, int index) {
		float total = 0;
		if (type.toLowerCase().contains("receita")) {
			for (int i = 0; i < newCount.length; i++) {
				if (i < index) {
					total += newCount[i].valor;
				}
			}
			total = total + newCount[index].valor;
		} else if (type.toLowerCase().contains("despesa")) {
			for (int i = 0; i < newCount.length; i++) {
				if (i < index) {
					total += newCount[i].valor;
				}
			}
			total = total - newCount[index].valor;
		}
		return total;
	}

}