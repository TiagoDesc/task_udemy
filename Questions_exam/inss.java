package Questions_exam;

import java.util.Scanner;

public class inss {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario;
        double desconto;
        double discount;
        double result;
        double total;
        int user = 1;
        while (user == 1) {

            System.out.println("Digite o seu salário: ");
            salario = sc.nextDouble();

            if (salario <= 1903.98) {
                System.out.println("Seu salário é de: R$" + salario);
                System.out.println("Você está isento dos impostos!");
                System.out.println("Deseja fazer uma nova consulta? 1 - Sim, 2 - Não.");
                user = sc.nextInt();

            } else if (salario >= 1903.99 && salario <= 2826.65) {
                desconto = 0.075;
                discount = salario * desconto;
                total = salario - discount;
                System.out.println("Seu salário é de: R$" + salario);
                System.out.printf("Você teve um desconto de R$ %.2f", discount);
                System.out.println(" ");
                System.out.printf("Seu salário líquido será de: R$ %.2f", total);
                System.out.println("");
                System.out.println("Deseja fazer uma nova consulta? 1 - Sim, 2 - Não.");
                user = sc.nextInt();

            } else if (salario >= 2826.66 && salario <= 3751.05) {
                desconto = 0.15;
                discount = salario * desconto;
                total = salario - discount;
                System.out.println("Seu salário é de: R$" + salario);
                System.out.printf("Você teve um desconto de R$ %.2f", discount);
                System.out.println(" ");
                System.out.printf("Seu salário líquido será de: R$ %.2f", total);
                System.out.println();
                System.out.println("Deseja fazer uma nova consulta? 1 - Sim, 2 - Não.");
                user = sc.nextInt();

            } else if (salario >= 3751.06 && salario <= 4664.68) {
                desconto = 0.225;
                discount = salario * desconto;
                total = salario - discount;
                System.out.println("Seu salário é de: R$" + salario);
                System.out.printf("Você teve um desconto de R$ %.2f", discount);
                System.out.println(" ");
                System.out.printf("Seu salário líquido será de: R$ %.2f ", total);
                System.out.println();
                System.out.println("Deseja fazer uma nova consulta? 1 - Sim, 2 - Não.");
                user = sc.nextInt();

            } else if (salario >= 4644.69) {
                desconto = 0.275;
                discount = salario * desconto;
                total = salario - discount;
                System.out.println("Seu salário é de: R$" + salario);
                System.out.printf("Você teve um desconto de R$ %.2f", discount);
                System.out.println(" ");
                System.out.printf("Seu salário líquido será de: R$ %.2f", total);
                System.out.println();
                System.out.println("Deseja fazer uma nova consulta? 1 - Sim, 2 - Não.");
                user = sc.nextInt();

            }
        }
    }
}
