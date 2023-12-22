package Questions_exam;

import java.util.Scanner;

public class fuel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valueTotal, discount = 0;
        double liters_gasoline;
        double liters_ethanol;
        double liters1 = 5.50;
        double liters2 = 3.50;
        int user;

        System.out.println("Enter the type of fuel you want: 1 - Gasoline, 2 - Ethanol.");
        user = input.nextInt();

        if (user == 1) {
            System.out.println("Type the amount of gasoline what you want: ");
            liters_gasoline = input.nextDouble();

            if (liters_gasoline > 10) {
                valueTotal = liters_gasoline * liters1;
                discount = valueTotal * 0.1;
                System.out.printf("The value total is: $%.2f", (valueTotal - discount));
                System.out.println(" ");
                System.out.println("Thanks for the preference, come back often!");

            } else {
                valueTotal = liters_gasoline * liters1;
                System.out.printf("The value total is: $%.2f", valueTotal);
                System.out.println(" ");
                System.out.println("Thanks for the preference, come back often!");
            }
        } else if (user != 1 && user != 2) {
            System.out.println("Type only the number 1 - (For Gasoline) or 2 - (For Ethanol).");
            System.out.println("Type the number again: ");
            user = input.nextInt();
        }

        if (user == 2) {
            System.out.println("Type the amount of Ethanol what you want: ");
            liters_ethanol = input.nextDouble();

            if (liters_ethanol > 10) {
                valueTotal = liters_ethanol * liters2;
                discount = valueTotal * 0.1;
                System.out.printf("The value total is: $%.2f ", (valueTotal - discount));
                System.out.println(" ");
                System.out.println("Thanks for preference, come back often!");
            } else {
                valueTotal = liters_ethanol * liters2;
                System.out.printf("The value total is: $%.2f ", valueTotal);
                System.out.println(" ");
                System.out.println("Thanks for preference, come back often!");
            }
        }

    }

}
