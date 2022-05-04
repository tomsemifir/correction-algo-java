package fr.semifir;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        int nombre = demanderNombre();

        for(int index = 0; index <= nombre; index++) {
            if(index%15 == 0) {
                System.out.println("FIZZBUZZ");
            } else if(index%5 == 0) {
                System.out.println("BUZZ");
            } else if(index%3 == 0) {
                System.out.println("FIZZ");
            } else {
                System.out.println(index);
            }
        }

        //AUTRE METHODE
//        for(int index = 0; index <= nombre; index++) {
//            System.out.println(index%15==0?"FIZZBUZZ":index%5==0?"BUZZ":index%3==0?"FIZZ":index);
//        }

    }

    public static int demanderNombre() {
        System.out.print("Saisir un nombre : ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
