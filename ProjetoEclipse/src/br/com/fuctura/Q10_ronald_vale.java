package br.com.fuctura;

public class Q10_ronald_vale {
	public static void main(String[] args) {

		Q10Aluno nomeA = new Q10Aluno("Jo�o");
		Q10Professor nomeP = new Q10Professor("Roberto");
		Q10Professor matriculaP = new Q10Professor(2243951.4);

		System.out.println("O nome do aluno �: " + nomeA.nomeAluno);
		System.out.println("O nome do professor �: " + nomeP.nomeProfessor);
		System.out.println("A matricula do professor �: " + matriculaP.matricula);

	}
}
