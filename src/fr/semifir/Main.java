package fr.semifir;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(addition(10, 5 , 25 , 80, 2, 2, 1));

    }

    /**
     * Fonction qui calcule la somme de tous les numéros entrés en paramètre
     * @param numeros Tableau des numéros entrés en paramètre
     * @return somme des numéros
     */
    public static int addition(int... numeros) {
        int result = 0;
        System.out.println("Taille : " + numeros.length);
        for(int numero : numeros) {
            result += numero;
        }
        return result;
    }


}
