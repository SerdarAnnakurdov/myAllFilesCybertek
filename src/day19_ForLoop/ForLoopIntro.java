package day19_ForLoop;

/*
for ( intialization ; Condition ; Interator ) {
statements
 */
public class ForLoopIntro {
    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++) {
            System.out.println("hello");
        }
        System.out.println("=======================================");


        for (int i = 0; i <= 100; i++) { // i : 5
            System.out.println(i + " ");
        }
        System.out.println("=======================================");

        for (int i = 1000; i <= 2000; i++) { // ????????????????
            System.out.print(i + " ");

            System.out.println();
            System.out.println("Hello");

        }



        System.out.println("=========================================");
        // odd numbers: comes --->> output
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }



        System.out.println();
        System.out.println("================================="); // even-->>devisible numbers
        // 0 , 2 , 4 ,6, 8 , 10
        for(int i = 0; i <= 100; i +=2){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("===========================================last");
        for(int i = 0; i <= 100; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("==================================");
        for(int i = 1; i <=500; i++){
            System.out.println("Push up "+i);
        }








    }

}
