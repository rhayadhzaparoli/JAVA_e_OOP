package view;

import business.Aula;

public class Principal {

	public static void main(String[] args) {
		
	Aula aula = new Aula(new Professor("Rubens Lara", 123), new Disciplina("ELE2"));
	
	aula.inserirAluno(new Aluno("Pedro", "001"));
	aula.inserirAluno(new Aluno("Joao", "002"));
	aula.inserirAluno(new Aluno("Maria", "003"));
	aula.inserirAluno(new Aluno("Jose", "004"));
	aula.inserirAluno(new Aluno("Ana", "005"));

	aula.setMateria(new Materia("Revisao OO"));

	System.out.println(aula.retornarInfo());
	}

}
