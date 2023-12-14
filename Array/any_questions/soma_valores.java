package Array.any_questions;

import java.util.Locale;
import java.util.Scanner;

public class soma_valores {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n;
        double soma = 0;

        System.out.print("Quantos valores vai ter cada vetor? ");
        n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite os valores do vetor A: ");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Digite os vslores do vetor B: ");
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            c[i] = a[i] + b[i];
        }

        System.out.println("Valor resultante: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d \n", c[i]);
            soma += c[i];
        }

        System.out.println("Valor total dos produtos: " + soma);
    }

}
