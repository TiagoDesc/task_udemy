import java.util.Scanner;
public class ex10 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = 0;
        int soma = 0;
        
        System.out.println("Digite o limite dos números: ");
        n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.printf("Número [%d]: " , i + 1);
            int x = sc.nextInt();
            soma += x;
            
            
        }

        System.out.println("A soma de todos os números é de: " + soma);
        
    }
}
