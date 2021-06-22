package br.com.fuctura;

public class Q11Disciplina {
	String discp1, discp2;
	int cargaH1, cargaH2;

	public Q11Disciplina() {

	}

	public Q11Disciplina(String nomeDaDisciplina1, String nomeDaDisciplina2) {
		discp1 = nomeDaDisciplina1;
		discp2 = nomeDaDisciplina2;
	}

	public Q11Disciplina(int cargaHoraria1, int cargaHoraria2) {
		cargaH1 = cargaHoraria1;
		cargaH2 = cargaHoraria2;
	}
}
