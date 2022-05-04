package fr.semifir;

import java.util.Scanner;

public class Exo10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un nombre : ");
        int nombre = scanner.nextInt();

        for(int i = 1; i <= nombre; i++) {
            String espaces = "";
            String etoiles = "";

            //Compter les espaces
            for(int j=0; j < nombre-i; j++) {
                espaces += " ";
            }

            for(int j=0; j < i * 2 - 1; j++) {
                etoiles += "*";
            }

            System.out.println(espaces + etoiles);
        }
    }
}
