package Matriz;

import java.util.Scanner;

public class ordem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter with number: ");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter: ");
                matriz[i][j] = sc.nextInt();
            }

        }

        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        int count = 0;

    }

}
