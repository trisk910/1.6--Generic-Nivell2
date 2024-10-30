package org.example.Level1.Bussiness;

public class GenericMethods {
    public <T, U, V> void printArguments(T arg1, U arg2, V arg3) {
        System.out.println("A1: " + arg1);
        System.out.println("A2: " + arg2);
        System.out.println("A3: " + arg3);
    }
}
