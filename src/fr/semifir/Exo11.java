package fr.semifir;

import java.util.Scanner;

public class Exo11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un prix : ");
        double prix = scanner.nextDouble();

        double[] monnaies = {500,200,100,50,20,10,5,2,1,0.5,0.2,0.1,0.05,0.02,0.01};
        for (double monnaie:monnaies) {
            double nombre = Math.floor(prix/monnaie);
            System.out.println("Nombre de " + monnaie + "€ :" + nombre);
            prix -= nombre*monnaie;
        }
    }
}
