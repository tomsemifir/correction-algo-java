package fr.semifir;

import java.util.Scanner;

public class Exo4 {
    public static void main(String[] args) {

        int nombre1 = 20;
        int nombre2 = 20;
        int nombre3 = 17;

        if(nombre1 >= nombre2 && nombre1 >= nombre3) {
            System.out.println("[" + nombre1 + "," + nombre2 + "," + nombre3 + "] --> " + nombre1);
        } else if(nombre2 >= nombre1 && nombre2 >= nombre3) {
            System.out.println("[" + nombre1 + "," + nombre2 + "," + nombre3 + "] --> " + nombre2);
        } else {
            System.out.println("[" + nombre1 + "," + nombre2 + "," + nombre3 + "] --> " + nombre3);
        }

    }
}
