import java.util.Scanner;

public class ex10_List1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberEmployee;
        int workedHours;
        double valueHours;
        System.out.println("Enter the number of employee: ");
        numberEmployee = sc.nextInt();
        System.out.println("Enter the worked hours: ");
        workedHours = sc.nextInt();
        System.out.println("Enter the value hours: ");
        valueHours = sc.nextDouble();

        double result = (double) workedHours * valueHours;

        System.out.println("The employee number " + numberEmployee + " have a salary of: $" + result);

    }

}
