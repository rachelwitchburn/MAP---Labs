package fachada.administrativo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Administrativo {
    private List<Reuniao> reunioesAgendadas = new ArrayList<>();
    private List<Entrevista> entrevistas = new ArrayList<>();

    public void agendarReuniao(Reuniao reuniao) {
        reunioesAgendadas.add(reuniao);
        System.out.println("Reunião agendada: " + reuniao.getPauta());
    }

    public void marcarEntrevista(Entrevista entrevista) {
        entrevistas.add(entrevista);
        System.out.println("Entrevista marcada com: " + entrevista.getEntrevistado());
    }

    public List<Reuniao> getReunioesAgendadas() {
        return this.reunioesAgendadas;
    }

    public List<Entrevista> getEntrevistas() {
        return this.entrevistas;
    }
}
