import java.util.Scanner;

public class arrayPares_Impares {

    // Size of vet
    // creat the vet
    // print the even numbers
    // print odd numbers

    static int size() {
        Scanner input = new Scanner(System.in);
        System.out.println("Type the size of vet: ");
        int size = input.nextInt();
        return size;
    }

    static int[] creatVet(int size) {
        Scanner input = new Scanner(System.in);
        int vet[] = new int[size];
        for (int i = 0; i < vet.length; i++) {
            System.out.printf("Vet[%d]: ", i);
            vet[i] = input.nextInt();
        }
        return vet;
    }

    static void printEven(int vet[]) {
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 2 == 0) {
                System.out.printf("%d is a even number. \n", vet[i]);
            }
        }
    }

    static void printOdd(int vet[]) {
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 2 != 0) {
                System.out.printf("%d is a odd number. \n", vet[i]);
            }
        }
    }

    public static void main(String[] args) {
        int size = size();
        int vet[] = creatVet(size);
        printEven(vet);
        printOdd(vet);
    }

}
