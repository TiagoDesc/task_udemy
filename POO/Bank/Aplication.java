package POO.Bank;

import java.util.Scanner;

public class Aplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char user;
        double inicialDeposit;
        AccountBank account;

        System.out.print("Enter the your number account: ");
        int number = sc.nextInt();
        System.out.print("Enter the holder: ");
        String holder = sc.next();
        System.out.println("Do you wanna make the initial deposit? (y/n)");
        user = sc.next().charAt(0);
        if (user == 'y' || user == 'Y') {
            System.out.print("Enter with your inicial deposit: ");
            inicialDeposit = sc.nextDouble();
            account = new AccountBank(number, holder, inicialDeposit);
        } else {
            account = new AccountBank(number, holder);
        }

        System.out.println("Data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Make your deposit: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println(account);

        System.out.println();
        System.out.print("Make your withdrawal: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println(account);

        System.out.println();
        System.out.println("Final data: ");
        System.out.println(account);
        System.out.println("Thanks for preference. Come back often!");
    }
}
