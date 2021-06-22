package br.com.fuctura;

public class Q12_ronald_vale {
	public static void main(String[] args) {

		Q12Carro m = new Q12Carro("Ford","Focus" );
		Q12Carro altCad = new Q12Carro(1.2);
		Q12Carro potC = new Q12Carro(2000);

		System.out.println(m.Marca);
		System.out.println(m.Modelo);
		System.out.println(altCad.altCadeira);
		System.out.println("Motor de " + potC.potMotor + " cilindradas ");
	}
}
