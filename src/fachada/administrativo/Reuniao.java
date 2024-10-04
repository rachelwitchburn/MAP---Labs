package fachada.administrativo;

public class Reuniao {
    private String data;
    private String horario;
    private String local;
    private String pauta;

    public Reuniao(String data, String horario, String local, String pauta) {
        this.data = data;
        this.horario = horario;
        this.local = local;
        this.pauta = pauta;
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

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getPauta() {
        return pauta;
    }

    public void setPauta(String pauta) {
        this.pauta = pauta;
    }
}
