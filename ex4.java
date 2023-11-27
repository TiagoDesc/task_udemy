import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
     Scanner entrada = new Scanner (System.in);
     System.out.println("Digite os valores de A e B e descubra se ambos são múltiplos ou não: ");
     System.out.println("Valor de A: ");
     int a = entrada.nextInt();
     System.out.println("Valor de B: ");
     int b = entrada.nextInt();
     
     if(a > b){
        int temp = a;
        a = b;
        b = temp;
     }

     if(b % a == 0){
        System.out.println("São múltiplos.");
     }else{
        System.out.println("Não são múltiplos.");

        }
    }
     

}
