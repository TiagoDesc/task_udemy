package Ado_Produto;

import java.util.Scanner;

import POO.Product.product;

public class Program {

    public static void main(String[] args) {

        Produto geladeira = new Geladeira("Geladeira Eletrolux", 1500, 80);
        Produto cadeira = new Cadeira("Cadeira Gamer", 450, 2);
        Produto mesa = new Mesa("Mesa de porcelana", 780, 10);
        ProdutoPerecivel queijo = new Queijo("Queijo Minas", 20, 4, 89);
        ProdutoPerecivel leite = new Leite("Leite de jegue", 8, 20, 2);
        ProdutoRestrito cerveja = new Cerveja("Cerveja Skol", 7, 4, 18);
        ProdutoRestrito whisky = new Whisky("Whisky Royal Salute", 1000, 5, 18);
    }

}
