import java.util.Scanner;
public class ex5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite o início: ");
        int inicio = entrada.nextInt();
        System.out.println("Digite o fim: ");
        int fim = entrada.nextInt();
        
        

        if(inicio >= 0 && inicio <= 24 && fim >= 0 && fim <= 24){
            if(inicio == fim){
                System.out.println("O jogo teve duração de 24 horas.");
            }else if(inicio < fim){
                int duracao = fim - inicio;
                System.out.println("O jogo teve duração de " + duracao + " hora(s).");           
            }else{
                int duracao = (24 - inicio) + fim;
                System.out.println("O jogo teve duração de " + duracao + " hora(s).");
            }
            
        }else{
            System.out.println("Horários inválidos, digite novamente.");
        }
        
    }
}


    
    

