package Array.any_questions;

import java.util.Scanner;

public class media_pares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, soma = 0, numerosPares = 0;
        double media;

        System.out.println("Quantos elementos terá no vetor? ");
        n = sc.nextInt();
        int vect[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Vect[" + i + "]: ");
            vect[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (vect[i] % 2 == 0) {
                soma += vect[i];
                numerosPares++;
            }
        }

        if (numerosPares == 0) {
            System.out.println("Não há números pares.");
        } else {
            media = (double) soma / numerosPares;
            System.out.printf("A média dos números pares é de: %.1f", media);
        }

        sc.close();

    }

}
