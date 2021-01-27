package day41_Encapsulation;

public class Test {
    public static void main(String[] args) {


        System.out.println(Data.publicVariable);

        Data.publicMethod();
        // Data.privateMethod();
        Data.defaultMethod();






    }
}

class test2{
    public static void main(String[] args) {
        System.out.println("A");
    }

}
class test3{
    public static void main(String[] args) {
        System.out.println("B");


    }
}