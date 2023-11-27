import java.util.Scanner;

public class temperatura {

    // Dias da semana;
    // Criar vetor;
    // Imprimir maiores temperaturas;
    // Imprimir menores temperaturas;
    // Imprimir temperaturas negativas;
    // Imprimir a média das temperaturas.

    static int tamanho (){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite os dias: ");
        int dias = entrada.nextInt();
        return dias;


    }

    static int [] criarVetor (int tamanho){
        Scanner entrada = new Scanner(System.in);
        int vetor [] = new int [tamanho];
        for(int i = 0; i < tamanho; i++){
        System.out.printf("Dia %d: ", i + 1);
        vetor[i] = entrada.nextInt();
        }
        return vetor;
        
    }

    static void imprimirMaior (int vetor []){
        int maior = 15;
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] > maior){
                maior = vetor[i];
                System.out.printf("%d °C é uma das maiores temperaturas. \n", vetor[i]);
            }
        }
    }

    static void imprimirMenor (int vetor []){
        int menor = 14;
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] < menor) { 
                menor = vetor[i];
                System.out.printf("%d °C é uma das menores temperaturas. \n", vetor[i]);
            }
        }
    }

    static void negativo (int vetor []){
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] < 0){
                System.out.printf("%d é negativo. \n", vetor[i]);
            }
        }

    }

    static double media (int vetor []){
        int soma = 0;
        for(int i = 0; i < vetor.length; i++){
            soma += vetor[i];
        }

        double media = soma / vetor.length;
        System.out.println("A média das temperaturas é de: " + media);
        return media;
    }

    public static void main(String[] args) {
        int tamanho = tamanho();
        int vetor [] = criarVetor(tamanho);
        imprimirMaior(vetor);
        imprimirMenor(vetor);
        negativo(vetor);
        media(vetor);
    }

    
}
