package Enumerações.OrderStatus;

import java.util.Date;

public class Program {

    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        OrderStatus os3 = OrderStatus.PROCESSING;
<<<<<<< HEAD
        OrderStatus os4 = OrderStatus.valueOf("PROCESSING");
=======
        OrderStatus os4 = OrderStatus.ValueOf("PROCESSING");
>>>>>>> 140b8ea456f3bd6be63ad8f6e7e5f3419704fe9b

        System.out.println(os1);
        System.out.println(os2);
        System.out.println(os3);
        System.out.println(os4);
    }

}
