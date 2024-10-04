package fachada.professores;

public class Disciplina {
    private String nome;
    private String horas;

    public Disciplina(String nome, String horas) {
        this.nome = nome;
        this.horas = horas;
    }

    public String getNome() {
        return nome;
    }

    public String getHoras() {
        return horas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    public String toString() {
        return "Disciplina: " + nome + "tem carga horária de " + horas + " horas";
    }
}
