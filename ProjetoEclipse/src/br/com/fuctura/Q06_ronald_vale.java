package br.com.fuctura;

import java.util.Scanner;

public class Q06_ronald_vale {
	public static void main(String[] args) {

		Scanner entradaDoUsuario = new Scanner(System.in);

		int[] leituraValores = new int[5];

		leituraValores[0] = 3;
		leituraValores[1] = 5;
		leituraValores[2] = 8;
		leituraValores[3] = 14;
		leituraValores[4] = 22;

		for (int contador = 0; contador < 5; contador = contador + 1) {
			System.out.println(leituraValores[contador]);
		}

		System.out.println("O menor valor lido é: " + leituraValores[0]);

	}

}
