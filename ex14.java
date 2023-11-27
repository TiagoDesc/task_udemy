import java.util.Scanner;
public class ex14 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Type the amount: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Type the first number: ");
            int first = sc.nextInt();

            System.out.println("Type the second number: ");
            int second = sc.nextInt();
            
            if(second == 0){
                System.out.println("Division impossible.");
            }
            
            double total = (double) first / second;
            System.out.println("The result of division is: " + total);
        }


        

        
        


            }
        }

        
    

