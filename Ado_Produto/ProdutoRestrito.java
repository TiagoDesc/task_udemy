package Ado_Produto;

public abstract class ProdutoRestrito extends Produto {

    private int idadeMinima;

    public ProdutoRestrito(String nome, double preco, int quantidadeEmEstoque, int idadeMinima) {
        super(nome, preco, quantidadeEmEstoque);
        this.idadeMinima = idadeMinima;
    }

}
