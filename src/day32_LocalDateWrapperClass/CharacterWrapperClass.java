package day32_LocalDateWrapperClass;

public class CharacterWrapperClass {
    public static void main(String[] args) {

        Character n = 'W';

        System.out.println(Character.isDigit(n));
        System.out.println(Character.isLetter(n));

        System.out.println("=========================");

        String str = "a1b2c3b4c5d6T@w$y%o^p%+=-=&* ?/ ";

        String digits = "";
        String letter = "";
        String specialChar = "";

        for (char each : str.toCharArray()) {
            if (Character.isDigit(each)) {
                digits += each;
            } else if (Character.isLetter(each)) {
                letter += each;
            } else {
                specialChar += each;
            }
        }



        System.out.println("digits = " + digits);
        System.out.println("letter = " + letter);
        System.out.println("specialChar = " + specialChar);


    }
}
/*
Home assignment : Password Validation
1. 8 charachters at least
2. There must be a digit                (isUpper--isLowercase) 
3. there must be a letter
4. there must be a special character ....
 */
