package Herança;

public class Program {

    public static void main(String[] args) {

        BusinessAccount account = new BusinessAccount(1001, "Tiago", 1000.0, 800.0);

        System.out.println(account.getHolder());

    }

}
