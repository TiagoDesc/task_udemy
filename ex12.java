import java.util.Scanner;
public class ex12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int in = 0;
        int out = 0;

        System.out.println("Type the amount of numbers: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.printf("Number %d: ", i + 1);
            int num = sc.nextInt();
            if(num >= 10 && num <= 20){
                in += 1;
            }else{
                out += 1;
            }

        }

        System.out.println(in + " is in.");
        System.out.println((out + " is out."));

    }
    
}
