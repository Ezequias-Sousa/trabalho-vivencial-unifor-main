// ----------------- Matheus -----------------------

public class Bolsista extends Aluno {

    // Construtor chamando o constructor da classe Aluno
    public Bolsista(String cpf, String nome, int idade, String matricula) {
        super(cpf, nome, idade, matricula);
    }

    // Implementação do metodo pagar mensalidade com desconto
    @Override
    public void pagarMensalidade() {
        System.out.println(getNome() + " é bolsista e pagou a mensalidade com desconto.");
    }


    @Override
    public String toString() {
        return super.toString() + " - Bolsista";
    }
}
