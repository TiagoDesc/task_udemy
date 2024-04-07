package Ado_Produto;

public abstract class ProdutoPerecivel extends Produto {

    private int validade;

    public ProdutoPerecivel(String nome, double preco, int quantidadeEmEstoque, int validade) {
        super(nome, preco, quantidadeEmEstoque);
        this.validade = validade;
    }

    public ProdutoPerecivel(int quantidadeEmEstoque) {
        super(quantidadeEmEstoque);
    }

    @Override
    public void vender(double dinheiroPagoPeloCliente, int idadeComprador) {
        if (validade <= 0) {
            System.out.println("Produto passou do prazo de validade.");
        } else {
            super.vender(dinheiroPagoPeloCliente, idadeComprador);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Validade: " + validade + " dias para vencer";
    }

    public void passaDia() {
        validade--;
    }

    public int getValidade() {
        return validade;
    }

    public void setValidade(int validade) {
        this.validade = validade;
    }

}
