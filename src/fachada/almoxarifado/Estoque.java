package fachada.almoxarifado;
import java.util.ArrayList;

public class Estoque {
    private ArrayList<String> itensEstocados;

    public Estoque() {
        this.itensEstocados = new ArrayList<String>();
    }

    public Estoque(String produto, int quantidade) {
        this.itensEstocados = new ArrayList<String>();
        for (int i = 0; i < quantidade; i++) {
            this.itensEstocados.add(produto);
        }
    }

    public void adicionarItem(String item) {
        this.itensEstocados.add(item);
    }
}
