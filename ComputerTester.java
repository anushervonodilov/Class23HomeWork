package com.class23HomeWork;

public class ComputerTester {
    public static void main(String[] args) {

        Computer[] brands = {new Apple(), new HP(), new Dell(), new Lenovo()};

        for (Computer brand : brands) {
            brand.operatingSystem();
            brand.price();
            brand.worksWell();
        }

    }
}
