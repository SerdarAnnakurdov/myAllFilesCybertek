package day25_ArrayIntro;

public class ArrayIntro {
    public static void main(String[] args) {

        String[] names = {"Azad ", "Ayse ", "Inna ", "Erjo ", "Aysel", "Aliya", "Serdar", "Kemal", "Yasin"};
                        //   0      1        2       3         4            5      6        7         8


        System.out.println(names[2]);

        String str1 = names[0];
        System.out.println(str1);


        int[] score = {80, 85, 90, 70, 75, 78, 87, 82, 99};
                //      0   1   2   3   4   5   6   7   8
/*
        System.out.println("Score of "+names[0]+" is "+score[0]);
        System.out.println("Score of "+names[1]+" is "+score[1]);
        System.out.println("Score of "+names[2]+" is "+score[2]);
        System.out.println("Score of "+names[3]+" is "+score[3]);
*/

                        //  i < 9 is the same with i <= 9-1..
        for(int i = 0; i <= names.length-1; i++){ // i: 0 , 1 , 2 , 3 , 4 ..
            System.out.println("Score of  "+names[i]+" is  "+score[i]);
        }


    }
}
