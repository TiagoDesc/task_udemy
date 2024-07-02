import java.util.Locale;
import java.util.Scanner;
public class ex13 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        System.out.println("Type the amount of number: ");
        int n = sc.nextInt();
        

        for(int i = 0; i < n; i++){
            System.out.println("Value of A: ");
            double a = sc.nextDouble();
            System.out.println("Value of B: ");
            double b = sc.nextDouble();
            System.out.println("Value of C: ");
            double c = sc.nextDouble();

               double average = (a * 2.0 + b * 3.0 + c * 5.0) / 10;
                System.out.printf("The average is: %.1f \n", average);
        }

        
        
        
    }
    
}
