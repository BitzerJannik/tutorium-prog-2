package ordermanagement.service;

import java.util.ArrayList;

import ordermanagement.model.Customer;
import ordermanagement.model.Product;
import ordermanagement.model.Order;

public class OrderService {
    private ArrayList<Order> orders;
    
    public OrderService () {
        this.orders = new ArrayList<>(); 
    } 

    public int getAmountOrders () {
        return this.orders.size();
    }

    public Order createOrder (Customer c, Product p, int amount) {
        int id = this.getAmountOrders() + 1;
        Order order = new Order (
            id,
            c,
            p,
            amount
        );

        this.orders.add(order);
        return order;
    }
}