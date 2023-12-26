import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int user;
        int minutos = 100;
        int add = 2;
        int total = 50;

        System.out.println("Digite a quantidade de minutos em que o usuário permaneceu em ligação: ");
        user = entrada.nextInt();

        if (user > minutos) {
            total = total + (user - minutos) * add;
        }

        System.out.println("O valor total a se pagar é de: R$ " + total);

        entrada.close();
    }

}
