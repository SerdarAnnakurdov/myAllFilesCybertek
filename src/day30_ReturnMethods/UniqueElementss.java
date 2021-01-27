package day30_ReturnMethods;

public class UniqueElementss {
    public static void main(String[] args) {

        String str = "aaaabbbbccccdddefffffg";
        String unique = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            char each = str.charAt(i); // each character of the str
            int count = frequency(str, each); // finding the frequency of the every single char from str

            if (count == 1) { // if counted equal to 1 you can concat each ...
                unique += each;
            }
        }
        System.out.println(unique);
        System.out.println("=================================");




        System.out.println(frequency("aaaab",'b'));



    }

    //                  "aaabc"  ,    'a'  ====> 3
    public static int frequency(String str, char ch) {
        int count = 0;
        for (char each : str.toCharArray()) {
            if (each == ch) {
                count++;
            }
        }


        return count;
    }



    public static String unique(String str){
        String unique = ""; // "eg"

        for(int i=0; i <= str.length()-1; i++) {
            char each = str.charAt(i); // each character of the string
            int count = frequency(str,  each);  // finding teh frequency of every single char from str

            if( count == 1){
                unique += each;
            }
        }

        return unique;
    }
}
