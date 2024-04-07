package Ado_Produto;

public class Geladeira extends Produto {

    public Geladeira(String nome, double preco, int quantidadeEmEstoque) {
        super(nome, preco, quantidadeEmEstoque);

    }

    public Geladeira(int quantidadeEmEstoque) {
        super(quantidadeEmEstoque);
    }

    public void passaDia() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'passaDia'");
    }

}
