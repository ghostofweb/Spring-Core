package com.springcore.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
    private String name;
    private List<String> phones;
    private Set<String> address;
    private Map<String,String> courses;
    public Emp() {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Set<String> getAddress() {
        return address;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
        ArrayList<String> list = new ArrayList<>();

    }

    @Override
    public String  toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", phones=" + phones +
                ", address=" + address +
                ", courses=" + courses +
                '}';
    }

    public Emp(String name, List<String> phones, Map<String, String> courses, Set<String> address) {
        this.name = name;
        this.phones = phones;
        this.courses = courses;
        this.address = address;
    }
}
