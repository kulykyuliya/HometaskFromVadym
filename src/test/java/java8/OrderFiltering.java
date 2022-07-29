package java8;

import java8.Order;

import java.util.Iterator;
import java.util.List;

public class OrderFiltering {
    List<Order> orderList;

    OrderFiltering(List<Order> orderList) {
        this.orderList = orderList;
    }

    public void printVegan() {
        for (Order order : orderList)
            if (order.isVegan) {
                System.out.println(order);
            }
        }


    public void printPriceMoreThan300() {
        for (Order order : orderList)
            if (order.price > 300) {
                System.out.println(order);
            }
        }



    public void printPriceLessThan600() {
        for (Order order : orderList)
            if (order.price < 600) {
                System.out.println(order);
            }
        }

    }