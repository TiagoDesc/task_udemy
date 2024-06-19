package Exception.Account;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Account number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        String holder = sc.next();
        sc.nextLine();
        System.out.print("Balance: ");
        double balance = sc.nextDouble();
        System.out.print("Withdraw Limit: ");
        double withdrawLimit = sc.nextDouble();
    }

}
