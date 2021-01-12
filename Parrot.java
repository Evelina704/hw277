package com.company;

public class Parrot implements Runnable, Flyable{
    @Override
    public void run(){
        System.out.println("Parrot is running");
    }
    @Override
    public void fly(){
        System.out.println("Попугай летает вжух вжух");
    }
}
