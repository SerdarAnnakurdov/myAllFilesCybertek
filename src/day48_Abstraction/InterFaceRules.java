package day48_Abstraction;

public interface InterFaceRules {
    public int a=100; // public static final by default

    //static{}




    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(InterFaceRules.a);


        // a=100; by default it's final
    }

    public default void m(){

    }


}



/*
InterFace : cannot have objects
what we can have:
variables : public static and final by default
methods : abstract method
          static methods


What we can not have:
constructor
instance methods
instance variables
blocks
 */