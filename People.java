package com.company;

public class People implements Swimmable, Runnable{
    @Override
    public void swim(){
        System.out.println("People can swim");
    }

    @Override
    public void run(){
        System.out.println("People can run");
    }

}
