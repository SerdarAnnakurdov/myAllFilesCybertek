package day22_Recap;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "AAABBCCDDEEFFJIIKKLLMMNNOOP"; // A, A, A, B, B
        String result = "";

        for (int i = 0; i <= str.length()-1; i++){
            String eachCharacter = " "+str.charAt(i);// A, A, B, B, C, C,.....
            if(result.contains(eachCharacter)){      // if(!result.contains(eachCharacter)){
                continue;                                   // result += eachCharacter;
            }else{                                          // this is other way to do it ..
                result+=eachCharacter;
            }
        }
        System.out.println(result);

        // this is the way in ternary : result += (!result.contains(eachCharacter)) ? eachCharacter : "";


        System.out.println("==========================");













    }
}
