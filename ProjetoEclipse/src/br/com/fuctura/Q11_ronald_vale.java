package br.com.fuctura;

public class Q11_ronald_vale {
	public static void main(String[] args) {

		Q11Aluno al = new Q11Aluno("Jo�o", "Anderson");
		Q11Aluno nota = new Q11Aluno(7.4, 6.2);
		Q11Aluno id = new Q11Aluno(14, 15);

		Q11Disciplina disc = new Q11Disciplina("matem�tica", "f�sica");
		Q11Disciplina cargaH = new Q11Disciplina(5, 3);

		System.out.println(al.Al1 + " tirou a nota " + nota.notaA1 + " da mat�ria " + disc.discp1);
		System.out.println("A idade de " + al.Al1 + " � " + id.idadeA1);

		System.out.println(al.Al2 + " tirou a nota " + nota.notaA2 + " da mat�ria " + disc.discp2);
		System.out.println("A idade de " + al.Al2 + " � " + id.idadeA2);
	}
}