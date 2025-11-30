// ----------------- Lysandre -----------------------

public class Disciplina {
    private String codigo;
    private String nome;
    private int semestre;

    public Disciplina(String codigo, String nome, int semestre) {
        setCodigo(codigo);
        setNome(nome);
        setSemestre(semestre);

    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getSemestre() {
        return semestre;
    }

}
