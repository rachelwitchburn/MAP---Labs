package fachada.professores;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String nome;
    private List<String> disciplinas;

    public Professor(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getDisciplinas() {
        return disciplinas;
    }

    public void alocarDisciplina(String nomeDisciplina) {
        this.disciplinas.add(nomeDisciplina);
    }
}