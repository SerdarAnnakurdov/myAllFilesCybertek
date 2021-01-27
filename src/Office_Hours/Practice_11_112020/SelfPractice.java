package Office_Hours.Practice_11_112020;

public class SelfPractice {
    public static void main(String[] args) {

       String[] names = {"SereS","Feriref","Serdas",};

       int count = 0;

       for(String each: names){
           char firstChar = each.toLowerCase().charAt(0);
           char lastChar = each.toLowerCase().charAt(each.length()-1);
           if(firstChar == lastChar) {
               count++;
               System.out.println(count);
           }
       }










    }
}
