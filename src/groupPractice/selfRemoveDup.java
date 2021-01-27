package groupPractice;

import library.StringUtility;

public class selfRemoveDup {
    public static void main(String[] args) {

        String str = "aaaabbbcccc";
        String result = "";
        for (String each : str.split("")) {
            if (result.contains(each)) {
                continue;
            } else {
                result += each;
            }

        }
        System.out.println(result);







    }
}
