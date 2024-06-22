import java.util.Scanner;

public class ex9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gasolina = 0;
        int diesel = 0;
        int alcool = 0;

        int cod;

        System.out.println("Enter the code: ");
        cod = sc.nextInt();

        while (cod != 1 && cod != 2 && cod != 3) {

            if (cod != 1 && cod != 2 && cod != 3) {
                System.out.println("Invalid Number. Enter again: ");
                cod = sc.nextInt();
            }
        }

        while (cod != 4) {

            if (cod == 1) {
                alcool = alcool + 1;
            } else if (cod == 2) {
                gasolina = gasolina + 1;
            } else if (cod == 3) {
                diesel = diesel + 1;
            }

            if (cod != 1 && cod != 2 && cod != 3) {
                System.out.println("Invalid Number. Enter again: ");
                cod = sc.nextInt();
            }
            System.out.println("Enter the code:");
            cod = sc.nextInt();

        }

        System.out.println();
        System.out.println("Thank You!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gas: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();

    }

}
