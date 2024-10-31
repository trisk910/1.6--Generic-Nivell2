package org.example.Level2.Bussiness;

public class VarListGenericMethod {
    public final <T> void genVarList(T... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument"+ " " + (i + 1) +": "+ args[i]);
        }
    }
}
