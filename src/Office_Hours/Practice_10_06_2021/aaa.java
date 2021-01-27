package Office_Hours.Practice_10_06_2021;

public class aaa {
    public static void main(String[] args) {


        String str = "serdar";



        try {
            str.equals("serdar");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(str+ " equals to serdar thats why error");
        }



    }
}
