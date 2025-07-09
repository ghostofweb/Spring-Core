package com.springcore.lifecycle;

public class Lifecycle {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Lifecycle{" +
                "price=" + price +
                '}';
    }

    public Lifecycle() {
        super();
    }

    public void init(){
        System.out.println("Inside Init Method");
    }
    public void destroy(){
        System.out.println("Inside Destroyed");
    }
}
