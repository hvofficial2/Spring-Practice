package com.harshit.beans;

public class Bike implements Vehicle{
    @Override
    public void run(){
        System.out.println("Bike is running!");
    }
}