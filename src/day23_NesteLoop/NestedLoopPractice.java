package day23_NesteLoop;

public class NestedLoopPractice {
    public static void main(String[] args) {

        for (int j = 15; j >= 1; j--) { // 1,2,3,4,5,6,7
            System.out.print("\t\t\t\t");
            for (int i = j; i >= 1; i--) {
                System.out.print("*");
            }
            System.out.println();


        }
    }}
/*
 *
 **
 ***
 ****
 *****
 ******
 */