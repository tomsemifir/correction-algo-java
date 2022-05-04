package fr.semifir;

import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir premier nombre :");
        int nombre1 = scanner.nextInt();
        System.out.println("Saisir deuxieme nombre :");
        int nombre2 = scanner.nextInt();

        int result = nombre1 + nombre2;

        System.out.println(nombre1 + " + " + nombre2 + " = " + result);
        // console.log(`${nombre1} + $ {nombre2} + ${result})
    }
}
