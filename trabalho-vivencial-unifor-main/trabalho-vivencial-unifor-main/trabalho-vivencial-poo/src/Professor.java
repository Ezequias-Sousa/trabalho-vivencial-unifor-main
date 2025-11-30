// ----------------- Bruna -----------------------

public class Professor extends Pessoa {

    private String centro;

    public Professor(String nome, String cpf, int idade, String centro) {
        super(nome, cpf, idade);
        this.centro = centro;
    }

    public void darAula() {
        System.out.println(getNome() + " está dando aula no centro " + centro + ".");
    }

    public String getCentro() {
        return centro;
    }

    @Override
    public String toString() {
        return super.toString() + " - Centro: " + centro;
    }
}
