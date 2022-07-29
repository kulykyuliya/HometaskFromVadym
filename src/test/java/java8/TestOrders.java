package java8;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TestOrders {
    public TestOrders() {
    }

    @Test
    public void checkOrders() {
        Order first = new Order(233, true, "Kate");
        Order second = new Order(220, false, "Yuliia");
        Order third = new Order(989, true, "Sem");
        Order fourth = new Order(500, false, "Roman");
        Order fifth = new Order(300, true, "Iryna");
        Order sixth = new Order(890, false, "Alice");
        Order seventh = new Order(150, true, "Ivan");
        Order eighth = new Order(205, true, "Oleh");
        Order ninth = new Order(100, true, "Semen");
        Order tenth = new Order(102, false, "Norma");

        List<Order> orderList = Arrays.asList(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth);


       printConditions(orderList, new OrderCheck() {
           @Override
           public boolean checkConditions(Order order) {
               return order.price>100 && order.isVegan;
           }
       });


    }

    public void printConditions(List<Order> orderList, OrderCheck orderCheck) {
        for (Order order : orderList)
            if (orderCheck.checkConditions(order)) {
                System.out.println(order);
            }
    }
}

