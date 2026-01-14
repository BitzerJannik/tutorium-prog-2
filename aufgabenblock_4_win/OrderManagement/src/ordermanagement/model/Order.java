package ordermanagement.model;

import ordermanagement.model.Customer;
import ordermanagement.model.Product;

public class Order {
    private int id;
    private Customer customer;
    private Product product;
    private int amount;

    public Order (int id, Customer customer, Product product, int amount) {
        this.id = id;
        this.customer = customer;
        this.product = product;
        this.amount = amount;
    }

    public int getId() {
        return this.id;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public Product getProduct() {
        return this.product;
    }

    public int getAmount() {
        return this.amount;
    }

    public void printDetails () {
        System.out.println(
            "Order-Details: \n" + 
            "Id: " + this.id + "\n" +  
            "Customer-Name: " + this.customer.getName() + "\n" + 
            "Produkt-Name: " + this.product.getName() + "\n" + 
            "Anzahl: " + this.getAmount()
        );
    }
}