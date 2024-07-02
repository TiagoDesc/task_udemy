import java.util.Scanner;
public class ex16 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Type the number: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }

        

        }


    }

