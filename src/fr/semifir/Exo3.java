package fr.semifir;

public class Exo3 {
    public static void main(String[] args) {

        double prixFabrication = 10.0;
        double prixVente = 10.0;

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
