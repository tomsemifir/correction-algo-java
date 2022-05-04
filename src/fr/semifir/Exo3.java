package fr.semifir;

import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir prix de fabrication : ");
        double prixFabrication = scanner.nextDouble();
        System.out.println("Saisir prix de vente : ");
        double prixVente = scanner.nextDouble();

        double profit = prixVente - prixFabrication;

        if(profit < 0) {
            System.out.println("Perte de " + (-profit));
        } else if(profit > 0) {
            System.out.println("Profit de " + profit);
        } else {
            System.out.println("Ni profit, ni perte");
        }
    }
}
