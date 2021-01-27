package day32_LocalDateWrapperClass;

public class ParseMethods {
    public static void main(String[] args) {
        String data1 = "123";

        System.out.println(data1 + 3); // 1233

        int num1 = Integer.parseInt(data1); //
        //                 primitive = primitive

        Integer num2 = Integer.parseInt(data1);
        //    wrapper class <==  primitive

        System.out.println(num1+1);


        String s1 = "hello";






        String s2 = "2.5";
        double d1 = Double.parseDouble(s2);  // none
        //     primitive <== primitive
        Double d2 = Double.parseDouble(s2); // autoboxing
        // wrapper class <=== primitive
        System.out.println(d1+1);



        String s3 = "true";
        boolean r1 = Boolean.parseBoolean(s3);  // this one assign to primitive small b-boolean
        Boolean r2 = Boolean.parseBoolean(s3);// this one assign to Class which B-Boolean
        System.out.println(r1); // default value of boolean is false anything except true will be false


        String s4 = "false";
        boolean r3 = Boolean.parseBoolean(s4);
        System.out.println(s4); // not case sensitive  ... Parse means converting ! .parsClass(..)







    }
}
