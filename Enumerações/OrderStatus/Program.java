package Enumerações.OrderStatus;

import java.util.Date;

public class Program {

    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        OrderStatus os3 = OrderStatus.PROCESSING;
        OrderStatus os4 = OrderStatus.ValueOf("PROCESSING");

        System.out.println(os1);
        System.out.println(os2);
    }

}
