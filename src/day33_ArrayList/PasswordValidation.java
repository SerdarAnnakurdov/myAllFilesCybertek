package day33_ArrayList;

public class PasswordValidation {
    public static void main(String[] args) {
        String password = "Password#7";

        boolean atleast8Char = password.length() > 8;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigits = false;
        boolean hasSpecialChar = false;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i); // each Character of password
            if (Character.isUpperCase(each)) {
                hasUpperCase = true;
            }else if(Character.isLowerCase(each)){
                hasLowerCase = true;
            }else if(Character.isDigit(each)){
                hasDigits = true;
            }else{
                hasSpecialChar = true;
            }

        }

        boolean isValid = atleast8Char && hasUpperCase && hasLowerCase && hasDigits  && hasSpecialChar;

        System.out.println(isValid);



    }
}
