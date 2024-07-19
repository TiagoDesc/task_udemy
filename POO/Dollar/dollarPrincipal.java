package POO.Dollar;

import java.util.Locale;
import java.util.Scanner;

public class dollarPrincipal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("What´s the dollar price? ");
        double dollarPrice = sc.nextDouble();

        System.out.print("How many dollars do you want to buy? ");
        double amount = sc.nextDouble();

        double result = CurrencyConveter.dollarToReal(amount, dollarPrice);
        System.out.printf("The total value in reais is = R$ %.2f", result);

        sc.close();

    }

}
