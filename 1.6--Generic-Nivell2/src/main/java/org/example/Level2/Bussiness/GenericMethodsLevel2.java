package org.example.Level2.Bussiness;

public class GenericMethodsLevel2 {
    public <T, U> void newGenericFunction(T arg1, U arg2, String nArg3) {
        System.out.println("Argument 1: " + arg1);
        System.out.println("Argument 2: " + arg2);
        System.out.println("Argument no generic: " + nArg3);
    }
}
