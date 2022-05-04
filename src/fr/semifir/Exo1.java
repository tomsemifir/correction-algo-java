package fr.semifir;

import java.util.Scanner;

public class Exo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est votre prénom ? ");
        String nom = scanner.next();
        System.out.println("Bonjour " + nom);
    }
}
