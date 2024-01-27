import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = entrada.nextInt();
        if (num < 0) {
            System.out.println(num + " é negativo.");
        } else if (num >= 0) {
            System.out.println(num + " não é negativo.");
        }
    }

}
