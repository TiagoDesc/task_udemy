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

        geladeira.vender(2000, 30);
        System.out.println(geladeira.toString());

        cadeira.vender(150, 35);
        System.out.println(cadeira.toString());

        mesa.vender(800, 25);
        mesa.comprarEstoque(1);
        System.out.println(mesa.toString());

        leite.vender(10, 18);
        leite.passaDia();
        System.out.println(leite.toString());

        queijo.vender(20, 30);
        queijo.comprarEstoque(1);
        queijo.passaDia();
        System.out.println(queijo.toString());

        cerveja.vender(10, 20);
        cerveja.comprarEstoque(1);
        System.out.println(cerveja.toString());

        whisky.vender(200, 15);
        whisky.comprarEstoque(1);
        System.out.println(whisky.toString());

    }

}
