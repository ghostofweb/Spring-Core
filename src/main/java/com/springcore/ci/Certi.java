package com.springcore.ci;

public class Certi {
    private String name;

    @Override
    public String toString() {
        return "Certi{" +
                "name='" + name + '\'' +
                '}';
    }

    public Certi(String name) {
        this.name = name;
    }
}
