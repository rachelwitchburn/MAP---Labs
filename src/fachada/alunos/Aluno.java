package fachada.alunos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Aluno {
    private String nome;
    private String matricula;
    private List<String> disciplinas;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<String> getDisciplinas() {
        return disciplinas;
    }

    public void adicionarDisciplina(String disciplina) {
        this.disciplinas.add(disciplina);
    }
}
