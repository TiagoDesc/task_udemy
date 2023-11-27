package POO.Dollar;

public class CurrencyConveter {

    public static double IOF = 0.06;

    public static double dollarToReal(double amount, double dollarPrice){
        return amount * dollarPrice * (IOF + 1);
    }

    
    
}
