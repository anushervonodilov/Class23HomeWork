package com.class23HomeWork;

public class Computer {

    void price() {
        System.out.println("Computers cost money");
    }

    void worksWell() {
        System.out.println("Computers usually work well");
    }

    void operatingSystem() {
        System.out.println("Computers have operating system");
    }

}

class Apple extends Computer {

    void price() {
        System.out.println("Apple costs more money");
    }

    void operatingSystem() {
        System.out.println("Apple has iOS operating system");
    }

}

class Lenovo extends Computer {

    void price() {
        System.out.println("Lenovo costs less money than Apple");
    }

}

class HP extends Computer {

}

class Dell extends Computer {

    void niceComputer() {
        System.out.println("Dell is a nice brand");
    }

    void worksWell() {
        System.out.println("Dell usually works well");
    }

}
