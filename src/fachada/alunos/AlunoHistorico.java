package fachada.alunos;

public class AlunoHistorico {
    private Aluno aluno;
    private Historico historico;

    public AlunoHistorico(Aluno aluno, Historico historico) {
        this.aluno = aluno;
        this.historico = historico;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Historico getHistorico() {
        return historico;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setHistorico(Historico historico) {
        this.historico = historico;
    }

    public void exibeHistorico() {
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Disciplinas cursadas:");
        for (String disciplina : historico.getDisciplinasCursadas()) {
            System.out.println(disciplina);
        }
    }
}
