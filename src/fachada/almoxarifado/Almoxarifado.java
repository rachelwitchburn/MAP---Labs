package fachada.almoxarifado;

import java.util.ArrayList;
import java.util.List;

public class Almoxarifado {
    private List<Estoque> estoques;
    private List<PedidoCompra> pedidosCompra;

    public Almoxarifado() {
        this.estoques = new ArrayList<Estoque>();
        this.pedidosCompra = new ArrayList<PedidoCompra>();
    }

    public List<Estoque> getEstoques() {
        return estoques;
    }

    public void setEstoques(List<Estoque> estoques) {
        this.estoques = estoques;
    }

    public List<PedidoCompra> getPedidosCompra() {
        return pedidosCompra;
    }

    public void setPedidosCompra(List<PedidoCompra> pedidosCompra) {
        this.pedidosCompra = pedidosCompra;
    }

    public void adicionarProdutoEstoque(String produto, int quantidade) {
        this.estoques.add(new Estoque(produto, quantidade));
        System.out.println("Produto " + produto + " adicionado ao estoque com quantidade " + quantidade);
    }

    public void criarPedidoCompra(String produto, double valor, int quantidade) {
        this.pedidosCompra.add(new PedidoCompra(produto, valor, quantidade));
        System.out.println("Pedido de compra do produto " + produto + " criado com valor " + valor + " e quantidade " + quantidade);
    }
}

