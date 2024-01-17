import java.util.Scanner;
public class ex8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int senha = 2002;
        int user;
        System.out.println("Enter the password: ");
        user = sc.nextInt();

        while(user != senha){                
            System.out.println("Senha incorreta. Digite novamente: ");
            user = sc.nextInt();
        }

        System.out.println("Acesso permitido.");
        sc.close();
    }
    
     
}
