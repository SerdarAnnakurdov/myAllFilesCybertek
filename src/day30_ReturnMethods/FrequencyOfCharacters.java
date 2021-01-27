package day30_ReturnMethods;

import library.StringUtility;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "aaabbbbcc";
        //   a3b4c2
        String result = "";

        String nonDup = StringUtility.removeDuplicates(str); // a b c


        for (int i = 0; i <= nonDup.length() - 1; i++) {
            char ch = nonDup.charAt(i); // a
            int count = StringUtility.frequency(str, ch); // 3 4 2
            result += "" + ch + count;
        }
        System.out.println(result);
        System.out.println("===========================");

        String str2 = "aaaaaaaaaaaabbbbbbbbccccccdddddd";
        String result2 = frequencyOfCharacters(str2);
        System.out.println(result2);


    }

    public static String frequencyOfCharacters(String str) {

        String result = "";

        String nonDup = StringUtility.removeDuplicates(str); // a b c


        for (int i = 0; i <= nonDup.length() - 1; i++) {
            char ch = nonDup.charAt(i); // a
            int count = StringUtility.frequency(str, ch); // 3 4 2
            result += "" + ch + count;
        }
        return result;

    }
}
