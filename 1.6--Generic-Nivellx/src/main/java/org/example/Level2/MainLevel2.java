package org.example.Level2;

import org.example.Level1.Bussiness.Persona;
import org.example.Level2.Bussiness.GenericMethodsLevel2;
import org.example.Level2.Bussiness.VarListGenericMethod;

import java.util.ArrayList;
import java.util.List;

public class MainLevel2 {
    public static void main(String[] args) {
        System.out.println("----------Ex1----------");
        Persona persona = new Persona("Pepito", "Palotes", 50);
        int number = 42;
        String text = "hola";

        GenericMethodsLevel2 gm = new GenericMethodsLevel2();
        gm.newGenericFunction(persona, number, text);

        System.out.println("----------Ex2----------");
        VarListGenericMethod nvl = new VarListGenericMethod();
        ArrayList<String> sList = new ArrayList<>();
        sList.add("String 1");
        sList.add("String 2");
        sList.add("String 3");
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        nvl.genVarList(persona, number, text,sList,intList);
    }
}