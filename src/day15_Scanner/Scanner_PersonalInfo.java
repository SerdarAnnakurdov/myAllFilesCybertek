package day15_Scanner;
import java.util.Scanner;
public class Scanner_PersonalInfo {
    public static void main(String[] args) {

        Scanner info = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        byte age = info.nextByte();
        System.out.println("Please enter your favorite number");
        long favNum = info.nextLong();
        System.out.println("Are you student ? Enter true of false");
        boolean isStudents = info.nextBoolean();
        System.out.println("Age"+age);
        System.out.println("Favorite number: "+favNum);
        System.out.println("Is a student: "+isStudents);
        if(isStudents){
            System.out.println("You are student");
        }else{
            System.out.println("Oh okay, you aren't a student");
        }







    }
}
