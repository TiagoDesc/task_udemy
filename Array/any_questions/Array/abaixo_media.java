package Array;

import java.util.Locale;
import java.util.Scanner;

public class abaixo_media {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Digite o valor do vetor: ");
        int n = sc.nextInt();
        double soma = 0;
        double media = 0;
        double vect[] = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Vet[%d]: ", i);
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }

        media = soma / n;

        System.out.println("Média do vetor: " + media);

        for (int i = 0; i < n; i++) {
            if (vect[i] < media) {
                System.out.println("Elementos abaixo da média: " + vect[i]);
            }
        }

    }

}
