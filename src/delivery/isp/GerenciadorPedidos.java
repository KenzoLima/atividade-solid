package delivery.isp;

import delivery.srp.Pedido;

// ISP: interface só para gerenciamento de pedidos.
public interface GerenciadorPedidos {
    void registrar(Pedido pedido);
}
