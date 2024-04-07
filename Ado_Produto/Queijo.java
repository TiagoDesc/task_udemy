package Ado_Produto;

public class Queijo extends ProdutoPerecivel {

    public Queijo(String nome, double preco, int quantidadeEmEstoque, int validade) {
        super(nome, preco, quantidadeEmEstoque, validade);

    }

    public Queijo(int quantidadeEmEstoque) {
        super(quantidadeEmEstoque);
    }

}
