package com.springcore.autowireannotation;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

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


    @Autowired
    public Emp(@Qualifier("address1") Address address) {
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
