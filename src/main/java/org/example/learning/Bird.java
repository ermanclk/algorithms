package org.example.learning;

public class Bird extends Object{

    //field, properties, attribute
    private int foot;
    private int weight;
    private int name;

    //behaviour
    void swim(){
        System.out.println("I am swimming");
    }

    void fly(){
        System.out.println("I can fly");
    }

    void eat(){
        System.out.println("I can only eat");
    }
}
