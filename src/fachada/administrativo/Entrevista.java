package fachada.administrativo;

public class Entrevista {
    private String entrevistado;
    private String data;
    private String horario;

    public Entrevista(String entrevistado, String data, String horario) {
        this.entrevistado = entrevistado;
        this.data = data;
        this.horario = horario;
    }

    public String getEntrevistado() {
        return entrevistado;
    }

    public void setEntrevistado(String entrevistado) {
        this.entrevistado = entrevistado;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}

