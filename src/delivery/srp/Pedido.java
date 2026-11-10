package delivery.srp;

import delivery.lsp.Produto;

import java.util.ArrayList;
import java.util.List;

// SRP: apenas representa o pedido (criação e dados).
public class Pedido {
    private final int id;
    private final String cliente;
    private final List<Produto> itens = new ArrayList<>();

    public Pedido(int id, String cliente) {
        this.id = id;
        this.cliente = cliente;
    }

    public void adicionarItem(Produto produto) {
        itens.add(produto);
    }

    public double getTotal() {
        double total = 0;
        for (Produto p : itens) {
            total += p.getPreco();
        }
        return total;
    }

    public int getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public List<Produto> getItens() {
        return itens;
    }
}
