package delivery.isp;

import delivery.srp.Pedido;

// ISP: interface só para gerenciamento de entregas.
public interface GerenciadorEntregas {
    void entregar(Pedido pedido);
}
