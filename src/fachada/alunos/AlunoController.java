package fachada.alunos;

import java.util.ArrayList;
import java.util.List;

public class AlunoController {
    private List<Aluno> alunos;

    public AlunoController() {
        this.alunos = new ArrayList<Aluno>();
    }

    public void adicionarAluno(String nome, String matricula) {
        this.alunos.add(new Aluno(nome, matricula));
        System.out.println("Aluno " + nome + " adicionado com matrícula " + matricula);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public String getHistoricoAluno(String matricula) {
        return "Histórico do aluno " + matricula;
    }

    public void gerarHistorico(String nomeAluno) {
        System.out.println("Gerando histórico do aluno " + nomeAluno);
    }

    public void adicionarDisciplina(String matricula, String nomeDisciplina, double nota) {
        for (Aluno aluno : this.alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                aluno.adicionarDisciplina(nomeDisciplina);
                break;
            }
        }
        System.out.println("Adicionando disciplina " + nomeDisciplina + " para o aluno " + matricula + " com nota " + nota);
    }
}
