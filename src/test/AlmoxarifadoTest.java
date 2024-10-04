package test;

import fachada.almoxarifado.Almoxarifado;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlmoxarifadoTest {
    private Almoxarifado almoxarifado;

    @BeforeEach
    void setUp() {
        this.almoxarifado = new Almoxarifado();
    }

    @Test
    void adicionarProdutoEstoque() {
        this.almoxarifado.adicionarProdutoEstoque("Produto 1", 10);
        this.almoxarifado.adicionarProdutoEstoque("Produto 2", 20);
        assertEquals(2, this.almoxarifado.getEstoques().size());
    }

    @Test
    void criarPedidoCompra() {
        this.almoxarifado.criarPedidoCompra("Produto 1", 10, 1);
        this.almoxarifado.criarPedidoCompra("Produto 2", 20, 2);
        assertEquals(2, this.almoxarifado.getPedidosCompra().size());
    }
}