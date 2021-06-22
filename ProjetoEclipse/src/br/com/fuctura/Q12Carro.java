package br.com.fuctura;

public class Q12Carro {
	String Marca;
	String Modelo;
	double altCadeira;
	int potMotor;

	public Q12Carro() {

	}

	public Q12Carro(String MarcaCarro, String ModeloCarro) {
		Marca = MarcaCarro;
		Modelo = ModeloCarro;
	}

	public Q12Carro(double alturaCadeira) {
		altCadeira = alturaCadeira;
	}
	public Q12Carro(int potenciaMotor) {
		potMotor = potenciaMotor;
	}

}
