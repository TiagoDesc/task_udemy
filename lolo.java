import java.util.Scanner;

public class lolo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int level;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println();
        System.out.println("Olá, " + nome + ", em uma escala de 0 a 10, me diga o tanto que você odeia a Heloisa: ");
        level = sc.nextInt();

        if (level >= 0 && level <= 3) {
            System.out.println("Uau, você parece que você não odeia tanto ela.");
        } else if (level >= 4 && level <= 7) {
            System.out.println("Eita, " + nome + ", parece que você odeia um pouquinho a Lolô...");
        } else if (level >= 8 && level <= 10) {
            System.out.println("Rapaz, você odeia muito a Heloisa.");
        } else if (level > 10 && level <= 100) {
            System.out.println("COMO É POSSÍVEL EXISTIR TANTO ÓDIO ASSIM?????????????????????????");
        }

    }

}
