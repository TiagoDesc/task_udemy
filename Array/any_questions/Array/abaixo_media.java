package Array;

import java.util.Locale;
import java.util.Scanner;

public class abaixo_media {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int n;
        double sum, avg;

        System.out.println("Enter the vect value: ");
        n = sc.nextInt();
        double vect[] = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Vect[" + (i) + "]: ");
            vect[i] = sc.nextDouble();
        }
        System.out.println();

        sum = 0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }

        avg = sum / n;

        System.out.println("Vect average: " + avg);
        System.out.println("Below average elements: ");
        for (int i = 0; i < n; i++) {
            if (vect[i] < avg) {
                System.out.println(vect[i]);
            }
        }

        sc.close();

    }

}
