package com.springcore.addition;

public class Addition {
    private int a;
    private int b;

    public Addition(int a, int b){
            this.a = a;
            this.b = b;
        System.out.println("Constructor : int, int");
    }


    public Addition(double a, double b){
        this.a = (int)a;
        this.b = (int)b;
        System.out.println("Constructor : double, double");
    }

    public void doSum(){
        System.out.println("Sum of these 2 are = " + (this.a + this.b) );
    }
}
