package fr.semifir;

import java.util.Scanner;

public class Exo9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un nombre : ");
        int nombre = scanner.nextInt();

        String etoiles = "";

        for(int index = 0; index < nombre; index++) {
            etoiles += "*";
            System.out.println(etoiles);
        }

        for(int index = 0; index < nombre; index++) {
            etoiles = etoiles.substring(0, nombre-index);
            System.out.println(etoiles);
        }
    }
}
