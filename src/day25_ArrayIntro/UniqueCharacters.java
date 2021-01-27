package day25_ArrayIntro;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "abcababeiii";

        String result = "";             //c,e

        for(int j = 0; j < str.length(); j++){ // j represents index of str
            char ch = str.charAt(j);   // 'a'
            int count = 0;  //1

            for (int i = 0; i < str.length(); i++) { // i represents index of str

                char eachChar = str.charAt(i); // each character of the str
                if (eachChar == ch){
                    count++;
                }

            } // count the frequency of ch and then assign it to the count
            if(count == 1){ // if the frequency is one , it means it's unique
                result +=ch;
            }
        }
        System.out.println(result);



    }
}
