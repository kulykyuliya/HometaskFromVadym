package java8;

public class Order {
        int price;
        boolean isVegan;
        String customerName;

        public Order(int price, boolean isVegan, String customerName) {
            this.price = price;
            this.isVegan = isVegan;
            this.customerName = customerName;
        }

        public String toString() {
            return "your order is " + this.price + ", is vegan " + this.isVegan + ", customer name " + this.customerName;
        }
    }

