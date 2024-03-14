package Herança.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Product product = new Product();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported: (c/u/i)? ");
            char choise = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (choise == 'i') {
                System.out.print("Customns fee: ");
                double customsFee = sc.nextDouble();
                product = new ImportedProduct(name, price, customsFee);
                list.add(product);
            } else if (choise == 'u') {
                System.out.print("Manufactured date (DD/MM/YYYY): ");
                LocalDate manufactureDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                product = new UsedProduct(name, price, manufactureDate);
                list.add(product);
            } else {
                list.add(new Product(name, price));
            }

            System.out.println();
            System.out.println("PRICE TAGS: ");
            for (Product prod : list) {
                System.out.println(prod.priceTag());
            }
        }
    }

}
