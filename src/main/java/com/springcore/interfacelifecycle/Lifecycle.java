package com.springcore.interfacelifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Lifecycle implements InitializingBean , DisposableBean{
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

    @Override
    public void afterPropertiesSet() throws Exception {
        //INIT CODE
        System.out.println("Initialization of Bean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying Bean");
    }
}
