package test;

import fachada.infraestrutura.Infraestrutura;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InfraestruturaTest {
    private Infraestrutura infraestrutura;

    @BeforeEach
    void setUp() {
        this.infraestrutura = new Infraestrutura();
    }

    @Test
    void alocarSala() {
        this.infraestrutura.alocarSala("Sala 1", "08:00", "Aula de Matemática");
        this.infraestrutura.alocarSala("Sala 2", "10:00", "Aula de Física");
        assertEquals(2, this.infraestrutura.getAlocacoesSala().size());
    }
}