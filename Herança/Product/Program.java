package Herança.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Product product = new Product();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported: ");
            sc.nextLine();
            char choise = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (choise == 'i') {
                System.out.print("Customns fee: ");
                double customsFee = sc.nextDouble();
                product = new ImportedProduct(name, price, customsFee);
            } else if (choise == 'u') {
                System.out.print("Manufactured Date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.next());
                product = new UsedProduct(name, price, manufactureDate);
            }

            System.out.println("PRICE TAGS: ");
            System.out.println();
        }
    }

}
