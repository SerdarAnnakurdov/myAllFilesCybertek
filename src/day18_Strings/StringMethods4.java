package day18_Strings;

public class StringMethods4 {
    public static void main(String[] args) {
        // isEmpty , equals , equalsIgnoreCase , Contains, startsWith, endWith,
        String str = "Hello Everyone";
        System.out.println(str.isEmpty());

        String str2 = "";
        System.out.println(str2.isEmpty());

        // contains Method --->>
        String sentence = "I live to learn Java";
        System.out.println(sentence.contains("C#")); // -->>> false
        System.out.println(sentence.contains("Java")); // -->>> true






        // starts with --->>>> means starts by www. something similar and ends with --->>> with something like .com and yu can asighnn  it to boolean
        String webAddress = "www.amazon.com";
        boolean validDddress = webAddress.startsWith("www.")&&webAddress.endsWith(".com");











    }
}
