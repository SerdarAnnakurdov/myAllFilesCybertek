package day29_Methods;

public class MethodWithoutParameters {

    public static void main(String[] args) {


        printHello5Times();
        System.out.println("Serdar");
        printHello5Times();
        System.out.println("School Name");
        printHello5Times();


    }
    //AccessModifier specifier returnType MethodName ( Parameter ){ }
    public static void printHello5Times() {
        for (int i = 1; i < 6; i++) {
            System.out.println("Hello");


        }

    }

}


/*
step1: print hello 5 times  (for loop)
        step2: print your name
        step3: print hello 5 times  (for loop)
        step4: print your school name
        step5: print hello 5 times   (for loop)
 */
