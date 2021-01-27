package day20_ForLoop;

import java.util.Scanner;

public class PalindromeTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String word = scan.nextLine();
        
        String result = "";
        // forword -->>  ++ 
        // backward -->> --
        
        for(int i = word.length()-1; i >= 0; i--){
            result += word.charAt(i);
        }
        System.out.println("result: " + result);

        /// if you want it get upper lower  cases just make IgnoreCase..
       if(result.equalsIgnoreCase(word)){
            System.out.println(word + " is palindrome ");
        }else{
            System.out.println(word + " is not palindrome");
        }

        //System.out.println( word + (result.equalsIgnoreCase(word)?"Is palindrome":"Is not palindrome"));
        // this is our ternary kind of if statement easiest way to do it..
        
        
        
        
        
        
        
    }
}
