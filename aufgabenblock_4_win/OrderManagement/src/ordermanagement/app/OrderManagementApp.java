package ordermanagement.app;

import ordermanagement.model.Customer;
import ordermanagement.model.Product;
import ordermanagement.model.Order;
import ordermanagement.service.OrderService;

public class OrderManagementApp {
    public static void main (String[] args) {
        Customer customer = new Customer(1, "Company GmbH");
        Product product = new Product(1, "Produkt 1");

        OrderService service = new OrderService();
        Order order = service.createOrder(customer, product, 2);

        System.out.println("Customer: " + customer.getName());
        System.out.println("Customer: " + product.getName());

        order.printDetails();
    }
}