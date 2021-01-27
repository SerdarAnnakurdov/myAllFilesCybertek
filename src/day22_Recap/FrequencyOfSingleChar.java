package day22_Recap;

public class FrequencyOfSingleChar {  /// counting spaces or how many words do we have in the String .
    public static void main(String[] args) {
        String str = "Today i learned Java language";
        char ch = ' ';
        int count = 0;

        for(int i = 0; i <= str.length()-1; i++){
            char eachChar = str.charAt(i);

            if(ch == eachChar){
                count++;
            }

        }

        System.out.println("count = " + count);
        System.out.println("number of words: "+(count+1));









    }
}
