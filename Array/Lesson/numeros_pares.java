package Array.Lesson;

import java.util.Scanner;

public class numeros_pares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the quantity numbers: ");
        int n = sc.nextInt();
        int vet[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number: ");
            vet[i] = sc.nextInt();

        }

        int qttyEven = 0;
        for (int i = 0; i < n; i++) {
            if (vet[i] % 2 == 0) {
                System.out.println("Even numbers: " + vet[i]);
                qttyEven++;
            }
        }

        System.out.println("Quantity of even numbers: " + qttyEven);

        sc.close();

    }

}
