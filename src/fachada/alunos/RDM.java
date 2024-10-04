package fachada.alunos;

public class RDM {
    private double nota;
    private Aluno aluno;

    public RDM(double nota, Aluno aluno) {
        this.nota = nota;
        this.aluno = aluno;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void exibeNota() {
        System.out.println("Nota: " + nota);
    }
}
