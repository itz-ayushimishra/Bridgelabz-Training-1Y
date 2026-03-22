package com.gla.multilevel;


class Order {
    int orderId;
}

class ShippedOrder extends Order {
    String trackingNumber;
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    void status() {
        System.out.println("Delivered");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        DeliveredOrder d = new DeliveredOrder();
        d.status();
    }
}
