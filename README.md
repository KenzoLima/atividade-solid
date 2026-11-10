# Atividade SOLID - Sistema de Delivery

Projeto em Java aplicando os cinco princípios SOLID.

## Como executar

```bash
javac -encoding UTF-8 -d out src/delivery/*.java src/delivery/*/*.java
java -cp out delivery.Main
```

## Princípios

| Princípio | Pacote | Como foi aplicado |
|---|---|---|
| **SRP** | `srp` | `Pedido` guarda os dados, `PedidoRepositorio` salva e `PedidoImpressora` exibe. Cada classe tem uma só responsabilidade. |
| **OCP** | `ocp` | `FormaPagamento` é uma interface com `PagamentoCartao`, `PagamentoPix` e `PagamentoDinheiro`. Para um novo pagamento basta criar uma nova classe, sem alterar `ProcessadorPagamento`. |
| **LSP** | `lsp` | `Pizza`, `Hamburguer` e `Bebida` estendem `Produto` e podem ser usadas no lugar dele (o `Pedido` trabalha só com `Produto`). |
| **ISP** | `isp` | Interfaces pequenas: `GerenciadorPedidos`, `GerenciadorEntregas`, `GeradorRelatorio` e `Notificador` (pacote `dip`). Cada classe implementa só o que usa. |
| **DIP** | `dip` | `ServicoNotificacao` depende da interface `Notificador`, e não de `NotificadorEmail`, `NotificadorSms` ou `NotificadorWhatsApp`. |
