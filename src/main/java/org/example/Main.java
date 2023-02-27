package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    ArrayList<Arboles> bosque= new ArrayList<>();
    bosque.add(new Arboles(14,20,"cerezo",true));
    bosque.add(new Arboles(10,15,"manzano",true));
    bosque.add(new Arboles(3,2,"pino",false));
    bosque.add(new Arboles(1,1,"cedro",false));
        System.out.println(bosque);
    }
}