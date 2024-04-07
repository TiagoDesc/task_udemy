package Ado_Produto;

public abstract class ProdutoRestrito extends Produto {

    private int idadeMinima;

    public ProdutoRestrito(String nome, double preco, int quantidadeEmEstoque, int idadeMinima) {
        super(nome, preco, quantidadeEmEstoque);
        this.idadeMinima = idadeMinima;
    }

    @Override
    public void vender(double dinheiroPagoPeloCliente, int idadeComprador) {
        if (idadeComprador < idadeMinima) {
            System.out.println("Você é menor de idade, JÃO! NÃO VAI PODER COMPRAR!");
        } else {
            super.vender(dinheiroPagoPeloCliente, idadeComprador);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Idade Mínima: " + idadeMinima;
    }

    public int getIdadeMinima() {
        return idadeMinima;
    }

    public void setIdadeMinima(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

}
