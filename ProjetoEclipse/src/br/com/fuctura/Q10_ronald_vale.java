package br.com.fuctura;

public class Q10_ronald_vale {
	public static void main(String[] args) {

		Q10Aluno nomeA = new Q10Aluno("João");
		Q10Professor nomeP = new Q10Professor("Roberto");
		Q10Professor matriculaP = new Q10Professor(2243951.4);

		System.out.println("O nome do aluno é: " + nomeA.nomeAluno);
		System.out.println("O nome do professor é: " + nomeP.nomeProfessor);
		System.out.println("A matricula do professor é: " + matriculaP.matricula);

	}
}
