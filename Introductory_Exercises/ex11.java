import java.util.Scanner;
public class ex11 {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite um número e veja os ímpares até a sua contagem: ");
        int num = sc.nextInt();

        for(int i = 0; i < num; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
        
    }
}
