package fr.semifir;

import java.util.Scanner;

public class Exo6Fonctions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nombre1 = scanner.nextInt();
        String operateur = scanner.next();
        int nombre2 = scanner.nextInt();

        int result = calculer(nombre1, operateur, nombre2);
        afficherResultat(nombre1, operateur, nombre2, result);
    }

    public static void afficherResultat(int nombre1, String operateur, int nombre2, int result) {
        if(nombre2 == 0 && operateur.equals("/")) {
            System.out.println("Erreur lors de la division");
        } else {
            System.out.println(nombre1 + operateur + nombre2 + "=" + result);
        }
    }

    public static int calculer(int nombre1, String operateur, int nombre2) {
        int result = 0;
        if(operateur.equals("+")) {
            result = addition(nombre1, nombre2);
        } else if(operateur.equals("-")) {
            result = soustraction(nombre1, nombre2);
        } else if(operateur.equals("x")) {
            result = multiplication(nombre1, nombre2);
        } else if(operateur.equals("/")) {
            result = division(nombre1, nombre2);
        } else {
            System.out.println("L'opérateur n'a pas été reconnu");
        }

        return result;
    }

    public static int division(int nombre1, int nombre2) {
        int result = 0;
        if(nombre2 != 0) {
            result = nombre1 / nombre2;
        } else {
            System.out.println("Les divisions par 0 sont impossibles");
        }
        return result;
    }

    public static int addition(int nombre1, int nombre2) {
        return nombre1 + nombre2;
    }

    public static int soustraction(int nombre1, int nombre2) {
        return nombre1 - nombre2;
    }

    public static int multiplication(int nombre1, int nombre2) {
        return nombre1 * nombre2;
    }
}
