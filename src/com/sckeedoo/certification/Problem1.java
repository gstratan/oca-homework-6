package com.sckeedoo.certification;

public class Problem1 {

    static class Animal {
        String name;
        int numberOfLegs;
        double weight;
    }


    /**
     * Create an Animal object. Give it a state (name, numberOfLegs, weight)
     * print the object in this format : ex Animal = {name='Mickey', age=110, numberOfLegs=2}
     */
    public static void main(String[] args) {

        Animal catelus = new Animal();

        catelus.name = "tuzic";
        catelus.numberOfLegs = 4;
        catelus.weight = 22;

        System.out.println("Animal = { Name = " + catelus.name + ", Weight = " + catelus.weight + ", Number of Legs = " + catelus.numberOfLegs + " }");


    }
}