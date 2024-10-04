package test;

import fachada.professores.ProfessorController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorControllerTest {
    private ProfessorController professorController;

    @BeforeEach
    void setUp() {
        this.professorController = new ProfessorController();
    }

    @Test
    void registrarProfessor() {
        this.professorController.registrarProfessor("Professor 1");
        assertEquals(1, this.professorController.getProfessores().size());
    }

    @Test
    void alocarDisciplina() {
        this.professorController.registrarProfessor("Professor 1");
        this.professorController.alocarDisciplina("Professor 1", "Disciplina 1");
        assertEquals(1, this.professorController.getProfessores().get(0).getDisciplinas().size());
    }
}