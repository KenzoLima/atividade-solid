package delivery.isp;

import delivery.srp.Pedido;

// Implementa apenas o que usa: gerenciamento de entregas.
public class Entregador implements GerenciadorEntregas {
    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Pedido #" + pedido.getId() + " entregue para " + pedido.getCliente() + ".");
    }
}
