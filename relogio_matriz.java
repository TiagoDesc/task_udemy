import java.util.Scanner;

public class relogio_matriz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day;
        int sec = 0;
        int min = 0;
        int hour = 0;

        System.out.print("Enter the day you want to wake up on: ");
        day = sc.nextLine();

        System.out.print("Enter the second you want to wake up on: ");
        sec = sc.nextInt();

        System.out.print("Enter the minute you want to wake up on: ");
        min = sc.nextInt();

        System.out.print("Enter the hour you want to wake up on: ");
        hour = sc.nextInt();

        sc.close();

        for (int h = 0; h <= hour; h++) {
            for (int m = 0; m < 60; m++) {
                for (int s = 0; s < 60; s++) {
                    if (h == hour && m == min && s == sec) {
                        System.out.printf("%d:%d:%d", h, m, s);
                        System.out.println(" WAKE UP, MAN! WAKE UUUUUUUUPPPPP!!! YOU´RE A MAN, BRO!");
                        return;
                    }

                    System.out.printf("%d:%d:%d", h, m, s);
                    System.out.println(" Alarm to day: " + day);

                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }

    }

}
