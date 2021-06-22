package br.com.fuctura;

import java.util.Scanner;

public class Q04_ronald_vale {
	public static void main(String[] args) {

		Scanner entradaDoUsuario = new Scanner(System.in);

		int valorDaIdade;
		int i = 0;

		while (i == 0) {
			System.out.println("Digite a idade: ");
			valorDaIdade = entradaDoUsuario.nextInt();

			if (valorDaIdade <= -1) {
				System.out.println("Você digitou um idade negativa." + '\n');

			}

			else {
				System.out.println("A idade digitada foi: " + valorDaIdade);
				System.out.println("Programa finalizado!");

				break;
			}

		}
	}
}
