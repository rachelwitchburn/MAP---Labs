package test;

import fachada.alunos.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoControllerTest {
    private AlunoController alunoController;

    @BeforeEach
    void setUp() {
        this.alunoController = new AlunoController();
    }

    @Test
    void adicionarAluno() {
        this.alunoController.adicionarAluno("Aluno 1", "123");
        assertEquals(1, this.alunoController.getAlunos().size());
    }

    @Test
    void adicionarDisciplina() {
        this.alunoController.adicionarAluno("Aluno 1", "123");
        this.alunoController.adicionarDisciplina("123", "Disciplina 1", 10);
        Aluno aluno = this.alunoController.getAlunos().get(0);
        assertEquals(1, aluno.getDisciplinas().size());
    }
}