package delivery.ocp;

public class PagamentoPix implements FormaPagamento {
    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento de R$ %.2f via PIX%n", valor);
    }
}
