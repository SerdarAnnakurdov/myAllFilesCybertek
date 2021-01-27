package day31_MethodOverLoading;

import library.StringUtility;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String str = "Today is great day";


        int count = StringUtility.frequencyOfWord(str, "great");
        System.out.println(count);

        String str2 = "Java JaVA JAVA java C# C# PyThoN C# JAVA Java";
        int countJava = StringUtility.frequencyOfWord(str2, "java");
        int countCSharp = StringUtility.frequencyOfWord(str2, "python");


        System.out.println("countJava = " + countJava);
        System.out.println("countCSharp = " + countCSharp);

        System.out.println("==========================================");

        String sentence = "dog dog dog dog cat cat  Dog DOG cat cat cat CAT";

        int countDog = StringUtility.frequencyOfWord(sentence, "dog");
        int countCat = StringUtility.frequencyOfWord(sentence, "cat");

        System.out.println("countCat = " + countCat);
        System.out.println("countDog = " + countDog);
        System.out.println(countCat == countDog);


    }

    public static int frequencyOfWord(String sentence, String word) {
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();
        int frequency = 0;
        while (sentence.contains(word)) {
            sentence = sentence.replaceFirst(word, "");
            frequency++;

        }
        return frequency;
    }
}
/*

warmup tasks:
    Task1:
        1.  write a return method called frequencyOfWord that accepts two parameters: string str and String word, then returns the frequency of word
                Ex:
                    str = "Java java java python python"
                    word = "java";
                    frequency(str, word) ==>  3
 */