package test;

import fachada.financeiro.Financeiro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinanceiroTest {
    private Financeiro financeiro;

    @BeforeEach
    void setUp() {
        financeiro = new Financeiro();
    }

    @Test
    void adicionarFuncionario() {
        this.financeiro.adicionarFuncionario("João");
        assertEquals(1, this.financeiro.getFuncionarios().size());
    }
}