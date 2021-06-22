package br.com.fuctura;

import java.util.Scanner;

public class Q05_ronald_vale {
	public static void main(String[] args) {

		Scanner entradaDoUsuario = new Scanner(System.in);

		int[] leituraValores = new int[5];

		leituraValores[0] = 1;
		leituraValores[1] = 4;
		leituraValores[2] = 7;
		leituraValores[3] = 11;
		leituraValores[4] = 16;

		for (int contador = 0; contador < 5; contador = contador + 1) {
			System.out.println(leituraValores[contador]);
		}

		System.out.println("O maior valor lido é: " + leituraValores[4]);
	}
}
