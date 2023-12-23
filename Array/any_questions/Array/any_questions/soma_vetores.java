package Array.any_questions;

import java.util.Scanner;

public class soma_vetores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int n = sc.nextInt(); // Digitando o tamanho do vetor.
        int vet[] = new int[n];
        int soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("Vet[%d]: ", i);
            vet[i] = sc.nextInt(); // Digitando os valores do vetor.
        }

        System.out.print("Valores do vetor: ");
        for (int i = 0; i < n; i++) {
            System.out.print(vet[i] + " "); // Imprimindo os valores do vetor.
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            soma += vet[i]; // Realizando a soma dos valores do vetor.
        }
        System.out.println("Soma: " + soma); // Imprimindo o resultado da soma.

        double media = soma / n;
        System.out.println("A média é: " + media); // Imprimindo o resultado da média.

        sc.close();

    }

}
