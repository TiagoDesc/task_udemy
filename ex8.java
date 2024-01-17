import java.util.Scanner;

public class ex8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = 2002;
        int user;
        System.out.println("Enter the password: ");
        user = sc.nextInt();

        while (user != senha) {
            System.out.println("Incorrect password. Enter again: ");
            user = sc.nextInt();
        }

        System.out.println("Access allowed.");
        sc.close();
    }

}
