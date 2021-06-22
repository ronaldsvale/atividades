package br.com.fuctura;

public class Q09_ronald_vale {
	public static String reverse(String o) {
		String temporaria = "";
		for (int i = o.length() - 1; i >= 0; i--)
			temporaria += o.charAt(i);
		return temporaria;
	}

	public static void main(String[] args) {
		String linguagem = "Fuctura";
		System.out.println(Q09_ronald_vale.reverse(linguagem));
	}
}
