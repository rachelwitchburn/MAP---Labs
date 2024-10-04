package fachada.alunos;

import java.util.ArrayList;

public class Historico {
    private ArrayList<String> disciplinasCursadas;

    public Historico() {
        this.disciplinasCursadas = new ArrayList<String>();
    }

    public void adicionarDisciplina(String disciplina) {
        this.disciplinasCursadas.add(disciplina);
    }

    public ArrayList<String> getDisciplinasCursadas() {
        return new ArrayList<>(disciplinasCursadas);
    }

    public void setDisciplinasCursadas(ArrayList<String> disciplinasCursadas) {
        this.disciplinasCursadas = new ArrayList<>(disciplinasCursadas);
    }
}
