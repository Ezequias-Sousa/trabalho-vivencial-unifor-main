// ----------------- Lysandre -----------------------

public abstract class Pessoa {

    // Atributos básicos da pessoa
    private String cpf;
    private String nome;
    private int idade;

    // Construtores
    public Pessoa(String cpf, String nome, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }

    // Setters

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    // Getters

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Mtodoo para incrementar a idade da pessoa
    public void fazerAniversario() {
        this.idade++;
    }

    // Para exibir
    @Override
    public String toString() {
        return nome + " (CPF: " + cpf + ", Idade: " + idade + ")";
    }
}
