package Ado_Produto;

public abstract class Produto {

    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public Produto(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void vender(double dinheiroPagoPeloCliente, int idadeComprador) {
        if (quantidadeEmEstoque == 0) {
            System.out.println("Produto sem estoque.");
        } else if (dinheiroPagoPeloCliente < preco) {
            System.out.println("A compra de " + getNome() + " falhou. Dinheiro insuficiente. Ta duro? DORME!");
        } else {
            double troco = dinheiroPagoPeloCliente - preco;
            System.out.println("Produto vendido: " + nome);
            System.out.println("Troco: " + troco);
            quantidadeEmEstoque--; // Reduz a quantidade em estoque apenas se a compra for bem-sucedida
        }
    }

    public void comprarEstoque(int quantidade) {
        if (quantidadeEmEstoque == 0) {
            quantidadeEmEstoque = quantidade; // Define a quantidade inicial se o estoque estiver vazio
        } else {
            quantidadeEmEstoque += quantidade;
        }
        System.out.println("Estoque atualizado. Quantidade em estoque: " + quantidadeEmEstoque);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNome: ").append(nome);
        sb.append("\nPreço: ").append(preco);
        sb.append("\nQuantidade em estoque: ").append(quantidadeEmEstoque).append("\n");
        return sb.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

}
