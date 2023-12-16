package Array;

import java.util.Locale;
import java.util.Scanner;

public class abaixo_media {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int n;
        double soma, media;

        System.out.println("Digite o valor do vetor: ");
        n = sc.nextInt();
        double vect[] = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Vect[" + (i) + "]: ");
            vect[i] = sc.nextDouble();
        }
        System.out.println();

        soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }

        media = soma / n;

        System.out.println("Média do vetor: " + media);

        System.out.println("Elementos abaixo da média: ");
        System.out.println();
        for (int i = 0; i < n; i++) {
            if (vect[i] < media) {
                System.out.println(vect[i]);
            }
        }

        sc.close();

    }

}
