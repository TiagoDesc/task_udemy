import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println(num + " is negative.");
        } else if (num >= 0) {
            System.out.println(num + " is not negative.");
        }
    }

}
