package delivery.srp;

import delivery.lsp.Produto;

// SRP: apenas exibe as informações do pedido.
public class PedidoImpressora {
    public void exibir(Pedido pedido) {
        System.out.println("Pedido #" + pedido.getId() + " - Cliente: " + pedido.getCliente());
        for (Produto p : pedido.getItens()) {
            System.out.printf("  %s: R$ %.2f%n", p.getNome(), p.getPreco());
        }
        System.out.printf("  Total: R$ %.2f%n", pedido.getTotal());
    }
}
