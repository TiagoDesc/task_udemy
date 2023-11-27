import java.util.Scanner;
public class ex17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Type the amount of lines and descovery your values atributes: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){

            int first = i;
            int second = i * i;
            int third = i * i * i;

            System.out.printf("%d, %d, %d.\n", first, second, third);
        }
    }
    
}
