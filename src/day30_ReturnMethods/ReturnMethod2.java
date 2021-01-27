package day30_ReturnMethods;

public class ReturnMethod2 {
    public static void main(String[] args) {
        //String reversedName = reverseStrings(names);

        String names = "racecar";
        String reversedName = reverseStrings2(names);
        System.out.println(reversedName);

        boolean isPalindrome = names.equalsIgnoreCase(reversedName);
        System.out.println(isPalindrome);



    }

    // void :
    public static void reverseStrings(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        System.out.println(result);
    }

    //return method:
    public static String reverseStrings2(String str){

        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        System.out.println(result);
        return result;
    }




}

