package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.controller.conta;
import br.edu.univas.controller.saldo;

import br.edu.univas.model.contModel;

public class app {

	public static void main(String[] args) {
		contModel count [] = new contModel[100];
		
		boolean exit = false;
		do {
			Scanner input = new Scanner(System.in);
			
			System.out.println("Cadastro de Conta");
			System.out.println("1 – Cadastro de Conta");
			System.out.println("2 – Ver Saldo");
			System.out.println("3 - Sair");

			int option = input.nextInt();

			switch (option) {
			case 1:
				new conta(count);
				break;
			case 2:
				new saldo(count);	
				break;
			case 3:
				exit = true;
				break;
			default:
				break;
			}
		} while (!exit);
	}

}