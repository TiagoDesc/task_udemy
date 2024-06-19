package Exception.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter account data:");
        System.out.print("Account number: ");
        int number = sc.nextInt();

        System.out.print("Holder: ");
        String holder = sc.next();
        sc.nextLine();

        System.out.print("Initial Balance: ");
        double balance = sc.nextDouble();

        System.out.print("Withdraw Limit: ");
        double withdrawLimit = sc.nextDouble();

        Account account = new Account(number, holder, balance, withdrawLimit);

        /*
         * System.out.print("Enter the deposit: ");
         * double deposit = sc.nextDouble();
         * account.deposit(deposit);
         */

        System.out.println();
        System.out.print("Enter the withdraw: ");
        double withdraw = sc.nextDouble();

        try {
            account.withdraw(withdraw);
            System.out.printf("New balance: %.2f%n", account.getBalance());

        } catch (BusinessException e) {
            System.out.println(e.getMessage());
        }
    }

}
