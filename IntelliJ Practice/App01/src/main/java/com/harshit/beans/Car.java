package com.harshit.beans;

public class Car implements Vehicle{
    @Override
    public void run(){
        System.out.println("Car is running!");
    }
}
