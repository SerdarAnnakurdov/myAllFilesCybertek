package day18_Strings;

public class StringPractice {
    public static void main(String[] args) {

        String s1 = "cat;";
        String s2 = "cat";

        String s3 = new String("cat");

        System.out.println(s1==s3);
        System.out.println(s2==s3);

        String s4 = new String("cat");
        System.out.println(s3==s4);

        //equals
        System.out.println(s1.equals(s3)); // true
        System.out.println(s2.equals(s3)); // true
        System.out.println(s3.equals(s4)); // true



        String s5 = new String("cat");

        System.out.println(s4.equals(s5));//faslse , equals method is case sensitive
        System.out.println(s4.equalsIgnoreCase(s5));//true , equals ...
        System.out.println("--------------------------------");

        String str = "cybertek";
          str=str.toUpperCase();// "CYBERTEK"

        System.out.println(str);

        str=str.toLowerCase();// "cybertek";
        System.out.println(str);

        String str1 = "batch 21";
                    // 01234567
        System.out.println("=============================");
        String firstName = "John";
                        //  0123
        String  lastName = "Aaron";
                         // 01234
        String initial = firstName.charAt(0)+"."+lastName.charAt(0);
        System.out.println(initial);
        System.out.println("=========================");
        //charAt(index)
        //length()


        System.out.println("============================================================");
        String name = "Serdar Annakurdov";
        int n1 = name.length();
        System.out.println(n1);

        String name2 = "Muhtar";
                //      012345
        int n2 = name2.length();
        int lastInex = name2.length()-1;

        System.out.println(lastInex);
        System.out.println("================================");
        String a = "Java Programming Language";
        char firstChar = a.charAt(0);
        char lastChar = a.charAt(a.length()-1);
                                // last index num of a ....

        System.out.println("First Character: "+firstChar);
        System.out.println("Last Character: "+lastChar);
        System.out.println("=================================");
        String b = "jmhndiawhjdoiwajdlwanjdwaldjawldjn";

        char secondChar = b.charAt(1);
        char lastChara = b.charAt(b.length()-2);
        System.out.println("SecondChar = "+secondChar);
        System.out.println("SecondLastChar="+lastChara);























































    }
}
