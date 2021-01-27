package day33_ArrayList;

public class WrapperClassPractice {
    public static void main(String[] args) {
        String str = "a1b2c3"; // 1:49   2:50   3:51
        int sum = 0;

        for (char each : str.toCharArray()) {
            if (Character.isDigit(each)) {
                sum += Integer.parseInt("" + each);
            }
        }

        System.out.println(sum);
        System.out.println("===============================");

        String password = "Password#7";
        String upperLetters = "";
        String lowerLetters = "";
        String digits = "";
        String specialChar = "";

        for (char each : password.toCharArray()) {
            if (Character.isUpperCase(each)) { // verify if the character is uppercase
                upperLetters += each;
            } else if (Character.isLowerCase(each)) { // verify if the character is lowercase
                lowerLetters += each;
            } else if (Character.isDigit(each)) {// verify if the character is digit
                digits += each;
            }else{ // special Character
                specialChar+=each;
            }
        }

        System.out.println("upperLetters = " + upperLetters);
        System.out.println("lowerLetters = " + lowerLetters);
        System.out.println("digits = " + digits);
        System.out.println("specialChar = " + specialChar);

        boolean isValid = password.length() >= 8 && upperLetters.length() >0 && lowerLetters.length()>0 &&
        digits.length() >0 && specialChar.length()  >=1;

        System.out.println(isValid);



    }
}
/*
3. Write a program that can return the sum of all the digits from a string

ex:
input: a1b2c3
output: 6
(1+2+3 = 6 )


 */