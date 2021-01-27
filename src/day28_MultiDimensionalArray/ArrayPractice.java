package day28_MultiDimensionalArray;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        /*
        ScrumTeam
            Testers: {"Dorin","Adil","Fatih","Subhi"}
            Developers: {"Kastrinsi","Mustafa","Ruslan"}
            SM: {"Ayse"}
            PO: {"Omid"}
            BA: {"Agalar"}
        */

        String[][] scrumTeam = {
                {"Dorin", "Adil", "Fatih", "Subhi"},//0
                {"Kastrinsi", "Mustafa", "Ruslan"},//1
                {"Ayse"},                       // 2
                {"Omid"},                       // 3
                {"Agalar"}                      // 4
        };


        //System.out.println(Arrays.deepToString(scrumTeam));
        for (int i = 0; i <= scrumTeam.length - 1; i++) { // i : index of 1D arrays
            System.out.println(Arrays.toString(scrumTeam[i])); // prints the each group in scrum team

            for (int j = 0; j <= scrumTeam[i].length - 1; j++) { // j: index of element
                System.out.println(scrumTeam[i][j]);
            }
        }


        System.out.println("==============================");

        for (String[] eachArray : scrumTeam) {
            System.out.println(Arrays.toString(eachArray));

            for (String eachName : eachArray){
                System.out.println(eachName);
            }

        }


    }
}
