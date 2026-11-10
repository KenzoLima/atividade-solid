package delivery.srp;

import java.util.ArrayList;
import java.util.List;

// SRP: apenas salva os pedidos.
public class PedidoRepositorio {
    private final List<Pedido> pedidos = new ArrayList<>();

    public void salvar(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido> listar() {
        return pedidos;
    }
}
