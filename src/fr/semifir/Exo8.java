package fr.semifir;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Exo8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un nombre : ");
        int nombre = scanner.nextInt();

        String etoiles = "";

        for(int index = 0; index < nombre; index++) {
            etoiles += "*";
            System.out.println(etoiles);
        }
    }


}
