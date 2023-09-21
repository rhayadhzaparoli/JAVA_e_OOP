package business;

import java.util.ArrayList;

public class Aula {

	private Professor professor;
	private Disciplina disciplina;
	private Materia materia;
	private ArrayList<Aluno> listagemAlunos;
	
	public Aula(Professor professor, Disciplina disciplina, String topicoMateria) {
		// inicializa professor e disciplina com "objetos" recebidos via parâmetro
		this.professor = professor;
		this.disciplina = disciplina;
		
		this.materia = new Materia(topicoMateria);
		this.listagemAlunos = new ArrayList<Aluno>();
	}

	public void setMateria(Materia materia) { this.materia = materia; }
	public Materia getMateria() { return materia; }

	public Professor getProfessor() { return professor; }

	public Disciplina getDisciplina() { return disciplina; }

	public void inserirAluno(Aluno aluno) {
		listagemAlunos.add(aluno);
	}


	public ArrayList<Aluno> getListagemAlunos() { return listagemAlunos; }

	public String retornarInfo() {
		String infoAula = "*** Aula de hoje ***";
		/*
		código da disciplina
		nome do professor
		nome da matéria
		listagem de alunos presentes		 
		*/

		System.out.println(getDisciplina()); 
		System.out.println(getProfessor());
		System.out.println(getMateria());;
		System.out.println(getListagemAlunos());
		
		return infoAula;
	}

	@Override
	public String toString() {
		return retornarInfo();
	}

}
