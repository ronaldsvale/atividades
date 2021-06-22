package br.com.fuctura;

public class Q11Aluno {
	String Al1, Al2;
	double notaA1, notaA2;
	int idadeA1, idadeA2;

	public Q11Aluno() {
	}

	public Q11Aluno(String nomeDoAluno1, String nomeDoAluno2) {
		Al1 = nomeDoAluno1;
		Al2 = nomeDoAluno2;
	}

	public Q11Aluno(double notaDoAluno1, double notaDoAluno2) {
		notaA1 = notaDoAluno1;
		notaA2 = notaDoAluno2;
	}

	public Q11Aluno(int idadeDoAluno1, int idadeDoAluno2) {
		idadeA1 = idadeDoAluno1;
		idadeA2 = idadeDoAluno2;
	}
}
