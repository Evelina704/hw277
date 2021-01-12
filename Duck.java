package com.company;

public class Duck implements Runnable, Swimmable{
    @Override
    public void run(){
        System.out.println("Fuck can running");
    }

    @Override
    public void swim(){
        System.out.println("Duck can swimming");
    }
}
