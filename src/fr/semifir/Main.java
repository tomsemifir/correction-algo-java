package fr.semifir;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] tab = new int[5];
        int[] tab2 = {10, 15, 16};

        // [ 15 , 16 , 17 ]
        //    77   82    14
        //  "Mage", "Guerrier", "Archer"

        List<String> prenoms = new ArrayList<>(
                Arrays.asList("toto", "titi", "tata")
        );

        for(int index = 0; index < prenoms.size(); index++) {
            System.out.println(prenoms.get(index));
        }

        System.out.println("-----------------------------------");

        // for(Type element : elemList)
        for(String prenom : prenoms) {
            System.out.println(prenom);
        }

    }
}
