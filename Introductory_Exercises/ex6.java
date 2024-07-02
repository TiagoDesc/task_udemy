import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char user = 'y';
        double carrinho = 0;

        while (user == 'y') {

            System.out.println("Digite o código: ");
            int codigo = sc.nextInt();
            System.out.println("Digite a quantidade: ");
            int quantidade = sc.nextInt();

            double total;

            if (codigo == 1) {
                total = quantidade * 4;

            } else if (codigo == 2) {
                total = quantidade * 4.5;

            } else if (codigo == 3) {
                total = quantidade * 5;

            } else if (codigo == 4) {
                total = quantidade * 2;

            } else {
                total = quantidade * 1.5;

            }

            carrinho += total;

            System.out.printf("O valor do seu pedido fica em: R$ %.2f", total);
            System.out.println("");
            System.out.printf("O valor total do seu carrinho de comprar é de: R$%.2f\n", carrinho);
            System.out.println("Deseja refazer a compra? y = Sim, n = Não.");
            user = sc.next().charAt(0);

        }

        System.out.println("Obrigado pela preferência, volte sempre!");

		      sc.close();
    }

}
