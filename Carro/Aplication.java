package Carro;

import java.util.Scanner;
import java.util.Arrays;

public class Aplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de carros: ");
        int qtdCarros = sc.nextInt();
        sc.nextLine();

        Carro[] carros = new Carro[qtdCarros];

        for (int i = 0; i < qtdCarros; i++) {
            System.out.println("Coloque as informações sobre carro" + (i + 1) + ":");

            System.out.print("Placa do Carro: ");
            String placa = sc.nextLine();

            System.out.print("Ano de fabricação: ");
            int anoFabricacao = sc.nextInt();
            sc.nextLine();

            System.out.print("Marca: ");
            String marca = sc.nextLine();

            System.out.print("Modelo: ");
            String modelo = sc.nextLine();

            carros[i] = new Carro(placa, anoFabricacao, marca, modelo);
        }

        Arrays.sort(carros);

        System.out.println("\nOrdenação por modelo:");
        for (Carro carro : carros) {
            System.out.println(carro.modelo);
        }

        System.out.print("\nDigite o modelo do carro para ser realizado a pesquisa binária: ");
        String pesquisa = sc.nextLine();

        int indiceEncontrado = pesquisaBinaria(carros, pesquisa);

        if (indiceEncontrado != -1) {
            System.out.println("O carro foi encontrado na posição: " + indiceEncontrado);
        } else {
            System.out.println("O carro que você infomrou não foi encontrado.");
        }

    }

    private static int pesquisaBinaria(Carro[] carros, String modelo) {
        int inicio = 0;
        int fim = carros.length - 1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;
            int comparacao = modelo.compareTo(carros[meio].modelo);

            if (comparacao == 0) {
                return meio;
            }

            if (comparacao < 0) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }

        return -1;
    }
}
