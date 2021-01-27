package Office_Hours.Practice_11_04_2020;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "abbacaa"; // a3b2c1
        String result = "";

        for(int j = 0; j < str.length(); j++){
            char ch = str.charAt(j);         // a b c
            int count = 0; // for the frequency 4 2 1
            for (int i = 0; i < str.length(); i++) { // to find of freq of one character, by comparing with each of character of string
                if (ch == str.charAt(i)){
                    count++;
                }
            }
            if(result.contains(""+ch)){ //  if the char already in the result we dont have to concat it again
                continue;

            }

            result += ""+ch+count;
        }

        System.out.println(result);




    }
}
