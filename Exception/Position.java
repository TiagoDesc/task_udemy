package Exception;

import java.util.Scanner;

public class Position {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the vect names: ");
            String vect[] = sc.nextLine().split(" ");
            System.out.println("Enter the position: ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Position!");
        }

        System.out.println("End of program!");
        sc.close();

    }

}
