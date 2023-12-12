package Array.Alturas;

import java.util.Locale;
import java.util.Scanner;

public class Aplication {

    public static void main(String[] args) {

        // Digitar o número de pessoas.
        // Instanciar os arrays - nomes, idades, alturas.
        // Puxar os dados das pessoas - Scanner.
        // Estrutura for para verificar a quantidade de pessoas menores do que 16
        // anos...
        // e estrutura para pegar a altura total.
        // Realizar a altura média.
        // Realizar a porcentagem das pessoas com menos de 16 anos.
        // Imprimir a altura média.
        // Imprimir a porcentagem das pessoas com menos de 16 anos.
        // Imprimir os nomes das pessoas menores que 16 anos.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, smallNumber;
        double totalHeight, avgHeight, percentSmall;

        System.out.println("Enter the number of people: ");
        n = sc.nextInt();

        String name[] = new String[n];
        int age[] = new int[n];
        double height[] = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Data of %d° person: \n", i + 1);
            System.out.print("Name: ");
            name[i] = sc.next();
            System.out.print("Age: ");
            age[i] = sc.nextInt();
            System.out.print("Height: ");
            height[i] = sc.nextDouble();
        }

        smallNumber = 0;
        totalHeight = 0;
        for (int i = 0; i < n; i++) {
            if (age[i] < 16) {
                smallNumber++;
            }
            totalHeight += height[i];
        }

        avgHeight = totalHeight / n;
        percentSmall = ((double) smallNumber / n) * 100;

        System.out.printf("The average height is %.2fm2\n", avgHeight);
        System.out.printf("The number of people under 16 years old is: %.1f%%\n", percentSmall);

        for (int i = 0; i < n; i++) {
            if (age[i] < 16) {
                System.out.println("Under 16 years old: " + name[i]);
            }
        }
        sc.close();
    }
}
