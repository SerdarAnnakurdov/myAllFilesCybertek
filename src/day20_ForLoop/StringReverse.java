package day20_ForLoop;

public class StringReverse {
    public static void main(String[] args) {
        String str = "ABCD";
                    //0123
        String result = "";      //we want to contain the expected result which is the reserved version of str

                // last   // firs index numbers .. i--||i++ is your option what to do with value ...
        for (int i = str.length()-1; i >= 0; i-- ){
            result+=str.charAt(i);
        }
        System.out.println("result: "+result);


        /*
        level

        anna
         */


    }
}
