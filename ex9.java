import java.util.Scanner;
public class ex9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int gasolina = 0;
        int diesel = 0;
        int alcool = 0;

        int cod;
        int total = 0;

        System.out.println("Digite o código: ");
        cod = sc.nextInt();

        while(cod != 1 && cod != 2 && cod != 3){

        if(cod != 1 && cod != 2 && cod != 3){
                System.out.println("Número inválido. Digite novamente: ");
                cod = sc.nextInt();
            }
        }

        while(cod != 4){
           
            if(cod == 1){
                alcool = alcool + 1;
            }else if(cod == 2){
                gasolina = gasolina + 1;
            }else if(cod == 3){
                diesel = diesel + 1;
            }

        
            if(cod != 1 && cod != 2 && cod != 3){
                System.out.println("Número inválido. Digite novamente: ");
                cod = sc.nextInt();
            }
            System.out.println("Digite o código:");
            cod = sc.nextInt();  
        
}

            
            System.out.println();
            System.out.println("Muito obrigado!");
            System.out.println("Alcool: " + alcool);
            System.out.println("Gasolina: " + gasolina);
            System.out.println("Diesel: " + diesel);

    }
    
}

