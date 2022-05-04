package fr.semifir;

import java.util.Scanner;

public class Exo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int nombre1 = scanner.nextInt();
        String operateur = scanner.next();
        int nombre2 = scanner.nextInt();

        int result = 0;

        if(operateur.equals("+")) {
            result = nombre1 + nombre2;
        } else if(operateur.equals("-")) {
            result = nombre1 - nombre2;
        } else if(operateur.equals("x")) {
            result = nombre1 * nombre2;
        } else if(operateur.equals("/")) {
            if(nombre2 != 0) {
                result = nombre1 / nombre2;
            } else {
                System.out.println("Les divisions par 0 sont impossibles");
            }
        } else {
            System.out.println("L'opérateur n'a pas été reconnu");
        }

        //Affiche
        System.out.println(nombre1 + operateur + nombre2 + "=" + result);
    }
}
