package fachada.infraestrutura;
import java.util.ArrayList;
import java.util.List;

public class Infraestrutura {
    private List<AlocacaoSala> alocacoesSala;

    public Infraestrutura() {
        this.alocacoesSala = new ArrayList<>();
    }

    public List<AlocacaoSala> getAlocacoesSala() {
        return alocacoesSala;
    }

    public void setAlocacoesSala(List<AlocacaoSala> alocacoesSala) {
        this.alocacoesSala = alocacoesSala;
    }

    public void alocarSala(String sala, String horario, String atividade) {
        this.alocacoesSala.add(new AlocacaoSala(sala, horario, atividade));
        System.out.println("Sala alocada: " + sala + " para " + atividade + " no horário " + horario);
    }
}
