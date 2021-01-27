package Office_Hours.Practice_10_28_2020;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "aaabbbcccddd";

        String nonDub = "";

        for (int i = 0; i <= str.length() - 1; i++){
            String eachChar = ""+str.charAt(i); // each of the character in str
            if(nonDub.contains(eachChar)){ // if character already contained in nonDub
                continue;
            }else{ // otherwise
                nonDub += eachChar;
            }
        }

        System.out.println(nonDub);

    }

}
