package library;

import day43_Inheritance.person_Task.Employee;

public class BA extends Employee {

    public static void main(String[] args) {


        System.out.println(BA.publicVari);
        System.out.println(BA.protectedVari);
        // System.out.println(BA.defaultVari); static only in packeges visible..


    }

}


class A {
    public static void main(String[] args) {

        System.out.println(BA.publicVari);
        //System.out.println(BA.protectedVari);
        // protected : outside the package only visible to the packages
        // default : outside the package , never
        // public: Always

    }
}