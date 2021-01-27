package day40_Constructor;

import day36_CustomClass.Serdar;

public class ConstructorIntro {
    static int b;

    public ConstructorIntro(int a) {
        System.out.println("Const with int arg");
        b = 200;  // 20-50 depentds how many times  ...
        this.a = a;

    }

    static {
        System.out.println("Statick block");
    }

    int a;


    public static void main(String[] args) {

        System.out.println("Hello");
        //    System.out.println(a);

        int num = new ConstructorIntro(10).a;


        ConstructorIntro obj2 = new ConstructorIntro(300); // a = 300
        ConstructorIntro obj3 = new ConstructorIntro(400);  // 400


    }

}

