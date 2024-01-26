
import java.util.Scanner;

public class media_pares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0, evenNumber = 0;
        double average;

        System.out.println("How many elements will there be in the vect? ");
        n = sc.nextInt();
        int vect[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Vect[" + i + "]: ");
            vect[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (vect[i] % 2 == 0) {
                sum += vect[i];
                evenNumber++;
            }
        }

        if (evenNumber == 0) {
            System.out.println("There are no even numbers.");
        } else {
            average = (double) sum / evenNumber;
            System.out.printf("The average of even number is: %.1f", average);
        }

        sc.close();

    }

}
