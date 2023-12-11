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

        sc.close();
    }
}
