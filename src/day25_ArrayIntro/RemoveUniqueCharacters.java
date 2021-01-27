package day25_ArrayIntro;

public class RemoveUniqueCharacters {
    public static void main(String[] args) {
        String str = "abcabdkk";
        String result = "";


        for(int j = 0; j < str.length(); j++){
            char ch = str.charAt(j);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char eachChar = str.charAt(i);
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
            if (count > 1 && !result.contains(""+ch)) {
                result += ch;
            }


        }
        System.out.println("result = "+result);


    }
}
