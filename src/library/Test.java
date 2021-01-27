package library;



import day43_Inheritance.AccessModifiers;

import static day41_Encapsulation.Data.*;

public class Test extends AccessModifiers {
    public static void main(String[] args) {


        System.out.println(publicVariable);
        // System.out.println(privateVariable);  private means it's not possible to reach outside of the class
        // System.out.println(defaultVarialbe);

        publicMethod();
        // Data.privateMethod();
        // defaultMethod();\

        Test.protectedMethod();
        // most visible specifire is public and protected can be called and user withing importing needed class...

        //public and protected can be inherited in the sub class.....







    }
}
