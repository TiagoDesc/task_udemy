package Herança;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number: ");
        Integer number = sc.nextInt();

        System.out.println("Balance:");
        Double balance = sc.nextDouble();

        System.out.println("Loan limit: ");
        Double loanLimit = sc.nextDouble();

        sc.nextLine();

        System.out.println("Holder: ");
        String holder = sc.nextLine();

        BusinessAccount account = new BusinessAccount(number, holder, balance, loanLimit);

        System.out.println("The order: ");
        System.out.println(account.getNumber());
        System.out.println(account.getBalance());
        System.out.println(account.getLoanLimit());
        System.out.println(account.getHolder());

    }
}
