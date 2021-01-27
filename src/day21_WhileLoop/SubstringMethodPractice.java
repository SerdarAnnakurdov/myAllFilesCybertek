package day21_WhileLoop;

public class SubstringMethodPractice {
    public static void main(String[] args) {
        String email = "Serdar_Annakurdov@Apple.com";
        
        int indexOF_ = email.indexOf("_");
        int indexOFat = email.lastIndexOf("@");
        
        String lastName = email.substring(0,indexOF_);
        
        String firstName = email.substring(indexOF_+1,indexOFat );
        
        String domain = email.substring(indexOFat +1, email.lastIndexOf("."));

        String fullName = firstName +" "+ lastName;

        System.out.println("lastName = " + lastName);
        System.out.println("firstName = " + firstName);
        System.out.println("full name is:  "+fullName);
        System.out.println("domain = " + domain);
        
        
        
        
    }
}
/*
lastName_firstName@company.com
 */