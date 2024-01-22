import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número e descubra se ele é par ou impar: ");
        int num = entrada.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " é par.");
        } else if (num % 2 != 0) {
            System.out.println(num + " é impar.");
        }

    }
}
