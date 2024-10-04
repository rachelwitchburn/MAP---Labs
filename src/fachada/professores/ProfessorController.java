package fachada.professores;

import java.util.ArrayList;
import java.util.List;

public class ProfessorController {
    private List<Professor> professores;

    public ProfessorController() {
        this.professores = new ArrayList<>();
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void registrarProfessor(String nome) {
        this.professores.add(new Professor(nome));
        System.out.println("Professor " + nome + " registrado");
    }

    public void alocarDisciplina(String nomeProfessor, String nomeDisciplina) {
        for (Professor professor : this.professores) {
            if (professor.getNome().equals(nomeProfessor)) {
                professor.alocarDisciplina(nomeDisciplina);
                break;
            }
        }
        System.out.println("Alocando disciplina " + nomeDisciplina + " para o professor " + nomeProfessor);
    }
}

