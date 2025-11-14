package com.example.demo;

public class CAr {

    private final Engin engin;

    public CAr(Engin engin) {
        this.engin = engin;
    }
    public void drive(){


        engin.start();
        System.out.println("car binamos");
        System.out.println("carr");
    }
}
