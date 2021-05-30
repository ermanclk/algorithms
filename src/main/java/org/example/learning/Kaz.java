package org.example.learning;

public class Kaz extends Bird{

    //field, properties, attribute
    private int foot;
    private int weight;
    private int name;

    //behaviour
    void swim(){
        System.out.println("I can swim");
    }

    void eat(){
        System.out.println("I can only eat fish");
    }

    void fly(){
        System.out.println("I like flying on sea");
    }
}
