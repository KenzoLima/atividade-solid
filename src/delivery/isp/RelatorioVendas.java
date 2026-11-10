package delivery.isp;

import delivery.srp.Pedido;

import java.util.List;

// Implementa apenas o que usa: geração de relatórios.
public class RelatorioVendas implements GeradorRelatorio {
    @Override
    public void gerar(List<Pedido> pedidos) {
        double total = 0;
        for (Pedido p : pedidos) {
            total += p.getTotal();
        }
        System.out.printf("Relatório: %d pedido(s), total vendido R$ %.2f%n", pedidos.size(), total);
    }
}
