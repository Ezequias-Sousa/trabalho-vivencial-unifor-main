// ----------------- Matheus -----------------------

public class Regular extends Aluno {

    // Construtor chamando o constructor da classe Aluno

    public Regular(String cpf, String nome, int idade, String matricula) {
        super(cpf, nome, idade, matricula);
    }

    // pagar mensalidade:

    @Override
    public void pagarMensalidade() {
        System.out.println(getNome() + " pagou a mensalidade como Aluno Regular.");
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + " - Regular";
    }
}
