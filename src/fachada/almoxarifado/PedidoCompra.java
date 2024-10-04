package fachada.almoxarifado;

public class PedidoCompra {
    Item item;
    private double valor;

    public PedidoCompra(Item item, double valor) {
        this.item = item;
        this.valor = valor;
    }

    public PedidoCompra(String produto, double valor, int quantidade) {
        this.item = new Item(produto, valor, quantidade);
        this.valor = valor * quantidade;
    }

    public String getNome() {
        return item.getNome();
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }

    public void exibeListaDeCompras() {
        System.out.println("Item: " + item.getNome() + " - Valor: " + valor);
    }
}
