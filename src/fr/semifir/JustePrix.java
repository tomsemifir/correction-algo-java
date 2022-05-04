package fr.semifir;

import java.util.Scanner;

public class JustePrix {
    public static void main(String[] args) {
        System.out.println("Le nombre aléatoire est compris entre 1 et ....");
        int max = demanderNombre();
        System.out.println("Combien de vie(s) souhaitez vous ?");
        int nbVie = demanderNombre();

        long nombreAleatoire = Math.round(Math.random() * max);

        int nbSaisie = 0;

        while(nbVie > 0 && nbSaisie != nombreAleatoire) {
            System.out.println("------------------------------------");
            System.out.println("Nombre de vie restantes : " + nbVie);
            nbSaisie = demanderNombre();
            if(nbSaisie != nombreAleatoire) {
                if(nbSaisie < nombreAleatoire) {
                    System.out.println("Plus grand !");
                } else {
                    System.out.println("Plus petit");
                }
            }
            nbVie--;
        }

        if(nbVie == 0) {
            System.out.println("Vous avez perdu...le nombre a trouver était : " + nombreAleatoire);
        } else {
            System.out.println("Bravo, le nombre a trouver était : " + nombreAleatoire);
        }

    }

    public static int demanderNombre() {
        System.out.print("Saisir un nombre : ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
