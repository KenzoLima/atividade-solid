package delivery.ocp;

// OCP: não precisa ser alterada quando surgir uma nova forma de pagamento.
public class ProcessadorPagamento {
    public void processar(double valor, FormaPagamento forma) {
        forma.pagar(valor);
    }
}
