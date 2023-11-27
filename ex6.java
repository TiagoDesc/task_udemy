import java.util.Scanner;
public class ex6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        
        int user = 700;
        
        while(user == 700){

            System.out.println("Digite o código: ");
            int codigo = entrada.nextInt();
            System.out.println("Digite a quantidade: ");
            int quantidade = entrada.nextInt();
            
            double total;
        if(codigo == 1){
             total = quantidade * 4;

        }else if(codigo == 2){
            total = quantidade * 4.5;

        }else if(codigo == 3){
            total = quantidade * 5;

        }else if(codigo == 4){
            total = quantidade * 2;

        }else{
            total = quantidade * 1.5;
                
        }

            System.out.printf("O total da compra fica em: R$ %.2f", total);
            System.out.println("");
            System.out.println("Deseja refazer a compra? 700 = Sim, != 700 = Não.");
            
            user = entrada.nextInt();
            
            

            }
        
            System.out.println("Obrigado pela preferência, volte sempre!");
        }

    }   
    

