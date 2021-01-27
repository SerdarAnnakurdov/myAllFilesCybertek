package day16_Scanner;
import java.util.Scanner;
public class Scanner_Close {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number ");
        int num= input.nextInt();
        input.close();
        System.out.println(input.next());




    }
}
