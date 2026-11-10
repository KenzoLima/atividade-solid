package delivery;

import delivery.dip.NotificadorEmail;
import delivery.dip.NotificadorSms;
import delivery.dip.NotificadorWhatsApp;
import delivery.dip.ServicoNotificacao;
import delivery.isp.Atendimento;
import delivery.isp.Entregador;
import delivery.isp.RelatorioVendas;
import delivery.lsp.Bebida;
import delivery.lsp.Hamburguer;
import delivery.lsp.Pizza;
import delivery.ocp.PagamentoCartao;
import delivery.ocp.PagamentoDinheiro;
import delivery.ocp.PagamentoPix;
import delivery.ocp.ProcessadorPagamento;
import delivery.srp.Pedido;
import delivery.srp.PedidoImpressora;
import delivery.srp.PedidoRepositorio;

public class Main {
    public static void main(String[] args) {
        PedidoRepositorio repositorio = new PedidoRepositorio();
        PedidoImpressora impressora = new PedidoImpressora();
        Atendimento atendimento = new Atendimento(repositorio);
        Entregador entregador = new Entregador();
        RelatorioVendas relatorio = new RelatorioVendas();
        ProcessadorPagamento processador = new ProcessadorPagamento();

        // SRP + LSP: o pedido aceita qualquer subclasse de Produto
        Pedido pedido1 = new Pedido(1, "Ana");
        pedido1.adicionarItem(new Pizza("Calabresa", 50.0));
        pedido1.adicionarItem(new Bebida("Refrigerante", 8.0));
        atendimento.registrar(pedido1);
        impressora.exibir(pedido1);

        Pedido pedido2 = new Pedido(2, "Bruno");
        pedido2.adicionarItem(new Hamburguer("X-Bacon", 30.0));
        atendimento.registrar(pedido2);
        impressora.exibir(pedido2);

        // OCP
        processador.processar(pedido1.getTotal(), new PagamentoCartao());
        processador.processar(pedido2.getTotal(), new PagamentoPix());
        processador.processar(10.0, new PagamentoDinheiro());

        // ISP
        entregador.entregar(pedido1);
        entregador.entregar(pedido2);
        relatorio.gerar(repositorio.listar());

        // DIP
        new ServicoNotificacao(new NotificadorEmail()).notificar("Pedido #1 entregue.");
        new ServicoNotificacao(new NotificadorSms()).notificar("Pedido #2 entregue.");
        new ServicoNotificacao(new NotificadorWhatsApp()).notificar("Obrigado pela preferência!");
    }
}
