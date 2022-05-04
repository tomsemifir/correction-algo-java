package fr.semifir;

public class Exo12 {
    public static void main(String[] args) {
        int[] temperatures = { 12, 25, -5, 6, 5 };
        int procheZero = temperatures[0];

        // Pour chaque temperature
        for(int temperature : temperatures) {
            // Si la valeur absolue de la temperature est plus petite que la temperature
            // la plus proche de zéro actuelle
            if(Math.abs(temperature) <= Math.abs(procheZero) && temperature < 0) {
                // Alors définir la temperature la plus proche de zéro avec la température actuelle
                procheZero = temperature;
            }
        }

        System.out.println(procheZero);
    }
}
