package delivery.lsp;

// LSP: classe principal; qualquer subclasse pode substituí-la.
public abstract class Produto {
    private final String nome;
    private final double preco;

    protected Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
