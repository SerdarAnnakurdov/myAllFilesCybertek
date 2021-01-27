package day07_UnaryOperators;

public class   PerimetrCasting {
    public static void main(String[] args) {
        short a =3000;
        long b = a; // implicit casting , automatically done
        // = 3000l

        double d1 = 200.5;
        int i1 = (int) d1;
        System.out.println(i1);
        System.out.println("________________________");
        long l1 = 100;
        short s1 =(short) l1;// explicit cassting ;
        System.out.println(s1);

        double d2= 300;
        float f1 = (float) d2;
        System.out.println(f1);

        long l2=300;// implicit casting    //casting have 0 effect to dataType
        int i2= (int) l2;
        System.out.println(i2);

        short s2=400;
        byte b1= (byte) s2;
        System.out.println(b1);
        long l3=100;
        byte b2= (byte) l3;
        System.out.println(b2);












    }
}
