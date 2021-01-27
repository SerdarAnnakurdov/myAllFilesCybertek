package SelfStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

class Objects {

    static Human human = new Human();

    public static void main(String[] args) {

        













//        printMe();
//        printMe2();

    }

    public static void printMe(){
        System.out.println(human.getName("Serdar"));
        System.out.println(human.getLastName("Anna"));
        System.out.println(human.getAge(15));
    }

    public static void printMe2(){
        System.out.println(human.getName("Bahram"));
        System.out.println(human.getLastName("Rozy"));
        System.out.println(human.getAge(16));
    }
}
