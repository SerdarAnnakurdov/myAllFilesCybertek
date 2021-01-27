package day18_Strings;

public class StringMethod3 {
    public static void main(String[] args) {

        String sentence = "Java is Fun, Java is cool";

        sentence = sentence.replace("Java", "Python");//"Python is fun,Python is cool"

        System.out.println(sentence);


        String email = "CybertekSchool@gmail.com";

        email = email.replace("gmail", "yahoo");
        System.out.println(email);

        String essay = "Batch 20 is cool, Batch 20 is the best, Batch 20 students awesome";
        essay = essay.replace("20", "21");
        System.out.println(essay);
        System.out.println("===========================");

        String r = "Cat is friendly, Cat is cute"; // ONly one of cats will changed with replaceFirst!!!
        r = r.replaceFirst("Cat", "Dog");
        System.out.println(r);

        System.out.println("====================================");

        String t = "I like to learn Java, because Java is cool, Java  is powerful";
        t = t.replaceFirst("Java is", "Python is").replaceFirst("Java ", "C#");
        System.out.println(t);

        System.out.println("========================================");

        String a = "Yesterday was Monday, Today is Monday, Tomorrow is gonna be Monday";

        a = a.replaceFirst("Monday,", "Sunday,").replaceFirst("be Monday", "be Wednesday");
        System.out.println(a);
        System.out.println("==========================");

        // indexOf() : operation it's returns you given value to int number ;;
        String emailAddress = "Cybertek.School@yahoo.com";
        int beginningIndex = emailAddress.indexOf("@") + 1;
        int endingIndex = emailAddress.indexOf(".com");

        String domain = emailAddress.substring(beginningIndex, endingIndex);
        System.out.println(domain);
        System.out.println("============================");

        String p = "I like to Watch movies and reading books";
        String word2 = p.substring(p.indexOf("m"), p.indexOf(" a"));
        System.out.println(word2);

        System.out.println("==============================");

        String y = "I like to learn Java, Java is cool, I like to watch Jumanji";
        int n1 = y.indexOf(", J"); // second J  in index.
        System.out.println(n1);

        int n2 = y.lastIndexOf("J");
        System.out.println(n2);

        // lastIndexOf(value) -->>

        String name = "My name is Muhtar";
        String result = name.substring(name.lastIndexOf("M"));
        System.out.println(result);











    }

}
