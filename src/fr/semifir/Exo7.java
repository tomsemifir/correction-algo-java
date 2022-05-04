package fr.semifir;

import java.util.Scanner;

public class Exo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir nombre : ");
        int N = scanner.nextInt();

        int result = 0;

        for(int index = 1; index <= N; index++) {
            result += index;
            if(index != N) {
                System.out.print(index + " + ");
            } else {
                System.out.print(index + " = ");
            }
        }

        System.out.println(result);
    }
}
