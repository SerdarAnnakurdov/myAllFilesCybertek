package Office_Hours.Practice_10_28_2020;

public class Reverse {
    public static void main(String[] args) {

        String name = "Cybertek School";
                //     01234

        String result = "";
        //result += name.charAt(name.length()-1);
        //result += name.charAt(6);
        //result += name.charAt(5);
        //result += name.charAt(4);
        //result += name.charAt(3);
        //result += name.charAt(2);
        //result += name.charAt(1);
        //result += name.charAt(0);


        //System.out.println(result);


        for(int i = name.length()-1; i >= 0; i-- ){
            result += name.charAt(i);
            //result += name.substring(i,i+1); // gets one character at a time ... this is other way to do it ..
        }
        System.out.println(result);



    }
}
