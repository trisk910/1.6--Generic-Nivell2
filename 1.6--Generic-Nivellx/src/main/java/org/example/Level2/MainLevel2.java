package org.example.Level2;

import org.example.Level1.Bussiness.GenericMethods;
import org.example.Level1.Bussiness.NoGenericMethods;
import org.example.Level1.Bussiness.Persona;

public class MainLevel2 {
    public static void main(String[] args) {
        System.out.println("----------Ex1----------");
        NoGenericMethods obj1 = new NoGenericMethods(1, 2, 3);
        NoGenericMethods obj2 = new NoGenericMethods(3, 1, 2);
        NoGenericMethods obj3 = new NoGenericMethods(2, 3, 1);

        System.out.println("Objecte 1: " + obj1.getValue1() + ", " + obj1.getValue2() + ", " + obj1.getValue3());
        System.out.println("Objecte 2: " + obj2.getValue1() + ", " + obj2.getValue2() + ", " + obj2.getValue3());
        System.out.println("Objecte 3: " + obj3.getValue1() + ", " + obj3.getValue2() + ", " + obj3.getValue3());

        System.out.println("----------Ex2----------");
        Persona persona = new Persona("Pepito", "Palotes", 50);
        String text = "Hola";
        int number = 22;

        GenericMethods gm = new GenericMethods();
        gm.printArguments(persona, text, number);
        gm.printArguments(text, number, persona);
        gm.printArguments(number, persona, text);
    }
}