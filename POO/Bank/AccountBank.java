package POO.Bank;

public class AccountBank {

    private int number;
    private String holder;
    private double balance;

    // Construtor sem o depósito inicial.
    public AccountBank(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    // Construtor com o depósito inicial.
    public AccountBank(int number, String holder, double inicialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(inicialDeposit);
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;

    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5;
    }

    public String toString() {
        return "Account "
                + number
                + ", holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f ", balance);
    }
}
