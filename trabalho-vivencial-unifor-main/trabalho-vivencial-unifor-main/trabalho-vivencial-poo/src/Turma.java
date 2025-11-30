// ----------------- Vinícius -----------------------

import java.util.ArrayList;

public class Turma {

    private String codigo;
    private Disciplina disciplina;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Turma(String codigo, Disciplina disciplina, Professor professor) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno " + aluno.getNome() + " adicionado à turma " + codigo);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
        System.out.println("Aluno " + aluno.getNome() + " removido da turma " + codigo);
    }

    public void listarAlunos() {
        System.out.println("\nAlunos da turma " + codigo + ":");
        for (Aluno a : alunos) {
            System.out.println("- " + a.getNome() + " | Matrícula: " + a.getMatricula());
        }
    }

    @Override
    public String toString() {
        return "\nTURMA: " + codigo +
                "\nProfessor: " + professor.getNome() +
                "\nDisciplina: " + disciplina.getCodigo() + " - " + disciplina.getNome() +
                "\nQuantidade de alunos: " + alunos.size() +
                "\n";
    }
}
