package Array.Alturas;

import java.util.Locale;
import java.util.Scanner;

public class Aplication {

    public static void main(String[] args) {

        // Instanciar os arrays - nomes, idades, alturas.
        // Puxar os dados das pessoas - Scanner.
        // Estrutura for para verificar a quantidade de pessoas menores do que 16
        // anos...
        // e estrutura para pegar a altura total.
        // Realizar a altura média.
        // Mostrar a porcentagem das pessoas com menos de 16 anos.
        // Imprimir os nomes das pessoas menores que 16 anos.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, nmenores;
        double alturatotal, alturamedia, percentualMenores;

        System.out.println("Digite o número de pessoas: ");
        n = sc.nextInt();

        String nomes[] = new String[n];
        int idades[] = new int[n];
        double alturas[] = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
        }

        nmenores = 0;
        alturatotal = 0;
        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                nmenores++;
            }
            alturatotal += alturas[i];
        }

        alturamedia = (alturatotal / n);
        percentualMenores = ((double) nmenores / n) * 100;

        System.out.printf("\nAltura media = %.2f\n", alturamedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                System.out.println("Pessoas menores que 16 anos: " + nomes[i]);
            }
        }

        sc.close();
    }
}
