package delivery.isp;

import delivery.srp.Pedido;
import delivery.srp.PedidoRepositorio;

// Implementa apenas o que usa: gerenciamento de pedidos.
public class Atendimento implements GerenciadorPedidos {
    private final PedidoRepositorio repositorio;

    public Atendimento(PedidoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public void registrar(Pedido pedido) {
        repositorio.salvar(pedido);
        System.out.println("Pedido #" + pedido.getId() + " registrado.");
    }
}
