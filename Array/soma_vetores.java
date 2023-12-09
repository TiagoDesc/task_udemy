package Array;

import java.util.Scanner;

public class soma_vetores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        int vet[] = new int[n];
        int soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("Vet[%d]: ", i);
            vet[i] = sc.nextInt();
        }

        System.out.print("Valores do vetor: ");
        for (int i = 0; i < n; i++) {
            System.out.print(vet[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            soma += vet[i];
        }
        System.out.println("Soma: " + soma);

        double media = soma / n;
        System.out.println("A média é: " + media);

    }

}
