package com.springcore.autowire;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Emp implements InitializingBean, DisposableBean {
    private Address address;

    public Emp() {
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }

    public Emp(Address address) {
        this.address = address;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroying this shi");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Making this shit");
    }
}
