package ru.atom.makejar;

import ru.atom.instantiation.Base;

/**
 * Class just to test fat jar packing
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(getHelloWorld());

    }

    public static String getHelloWorld() {
        return "Hello, World!";
    }
}
