package LIN3.ex005.Business;

public class Aula {
    private String professor, disciplina, materia;
    private Aluno[] alunos;
   
    public String getProfessor() {
        return professor;
    }
    public String getDisciplina() {
        return disciplina;
    }
    public String getMateria() {
        return materia;
    }
    public Aluno[] getAlunos() {
        return alunos;
    }
    
    public Aula(String professor, String disciplina, String materia, Aluno[] alunos) {
        this.professor = professor;
        this.disciplina = disciplina;
        this.materia = materia;
        this.alunos = alunos;
    } 
}



