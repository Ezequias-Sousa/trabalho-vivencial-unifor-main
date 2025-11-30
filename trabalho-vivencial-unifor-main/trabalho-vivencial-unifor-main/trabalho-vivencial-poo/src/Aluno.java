// ----------------- Bruna -----------------------

public class Aluno extends Pessoa {

    protected String matricula;

    public Aluno(String nome, String cpf, int idade, String matricula) {
        super(nome, cpf, idade);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void pagarMensalidade() {
        System.out.println(getNome() + " pagou a mensalidade normal.");
    }

    @Override
    public String toString() {
        return super.toString() + " - Matrícula: " + matricula;
    }
}
