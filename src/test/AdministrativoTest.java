package test;

import fachada.administrativo.Administrativo;
import fachada.administrativo.Entrevista;
import fachada.administrativo.Reuniao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdministrativoTest {
    private Administrativo administrativo;

    @BeforeEach
    void setUp() {
        administrativo = new Administrativo();
    }

    @Test
    void agendarReuniao() {
        this.administrativo.agendarReuniao(new Reuniao("Reunião de planejamento", "Sala 1", "10:00", "12:00"));
        assertEquals(1, this.administrativo.getReunioesAgendadas().size());
    }

    @Test
    void marcarEntrevista() {
        this.administrativo.marcarEntrevista(new Entrevista("João", "2024-10-10", "10:00"));
        assertEquals(1, this.administrativo.getEntrevistas().size());
    }
}