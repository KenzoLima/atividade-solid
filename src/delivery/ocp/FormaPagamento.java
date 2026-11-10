package delivery.ocp;

// OCP: para um novo pagamento, basta criar outra classe que implemente esta interface.
public interface FormaPagamento {
    void pagar(double valor);
}
