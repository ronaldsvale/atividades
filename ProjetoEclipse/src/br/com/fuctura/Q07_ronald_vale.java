package br.com.fuctura;

public class Q07_ronald_vale {
	public static void main(String[] args) {

		int[] valores = new int[5];

		valores[0] = 2;
		valores[1] = 5;
		valores[2] = 9;
		valores[3] = 17;
		valores[4] = 23;

		for (int v = 4; v < valores.length; v--) {
			System.out.println(valores[v]);
		}
	}
}
