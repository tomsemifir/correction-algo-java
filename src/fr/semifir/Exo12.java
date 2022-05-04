package fr.semifir;

public class Exo12 {
    public static void main(String[] args) {
        int[] temperatures = { 12, 25, -5, 6, 5 };
        int procheZero = temperatures[0];

        for(int temperature : temperatures) {
            if(Math.abs(temperature) <= procheZero && temperature < 0) {
                procheZero = temperature;
            }
        }

        System.out.println(procheZero);
    }
}
