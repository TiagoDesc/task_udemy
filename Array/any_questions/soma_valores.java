
import java.util.Locale;
import java.util.Scanner;

public class soma_valores {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n;
        double sum = 0;

        System.out.println("Enter the value of vects: ");
        n = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value of vect A: ");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value of vect B: ");
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            c[i] = a[i] + b[i];
        }

        System.out.println("Value of the sum between vect A and vect B: ");

        for (int i = 0; i < n; i++) {
            System.out.printf("%d \n", c[i]);
            sum += c[i];
        }

        System.out.println("The total value of vects is: " + sum);

        sc.close();

    }

}
