package Ado_Produto;

public abstract class Produto {

    private String nome;
    private Double preco;
    private int quantidade;

    public Produto() {
    }

    public Produto(String nome, Double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void comprarEstoque(int quantidade) {
        preco += quantidade;
    }

    public abstract void vender(double dinheiro, int idadeDoComprador);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: " + nome);
        sb.append("Preço: " + preco);
        sb.append("Quantidade: " + quantidade);
        return sb.toString();
    }

}
