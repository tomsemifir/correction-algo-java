package fr.semifir;

public class Exo5 {
    public static void main(String[] args) {
        double[] tabNotes = { 4.5, 8, 2, -5, 10.5, 2, 14.5, 13 };
        //                 0  1   2   3

        for(int index = 0; index < tabNotes.length; index++) {
            double note = tabNotes[index];

            if(note >= 0 && note <= 4) {
                System.out.println("Catastrophique");
            } else if(note > 4 && note <= 10) {
                System.out.println("Insuffisant");
            } else if(note > 10 && note <= 14) {
                System.out.println("Peut mieux faire");
            } else if(note > 14 && note <= 17) {
                System.out.println("Bien");
            } else if(note > 17 && note <= 20){
                System.out.println("Excellent");
            } else {
                System.out.println("La note n'est pas bonne....");
            }
        }
    }

}
