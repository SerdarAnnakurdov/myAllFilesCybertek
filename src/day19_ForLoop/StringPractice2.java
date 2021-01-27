package day19_ForLoop;
import java.util.Scanner;
public class StringPractice2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();

        System.out.println(  (word.endsWith("ly")) ? "really??" : "Never mind"  );
    }
}
