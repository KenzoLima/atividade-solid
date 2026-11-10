package delivery.isp;

import delivery.srp.Pedido;

import java.util.List;

// ISP: interface só para geração de relatórios.
public interface GeradorRelatorio {
    void gerar(List<Pedido> pedidos);
}
