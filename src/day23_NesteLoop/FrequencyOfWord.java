package day23_NesteLoop;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String sentence = "Java is programming language, I like to learn Java Java Java Java";
                        // is programming language, I like to learn Java
                        // is programming language, I like to learn
        String word = "Java";

        int count = 0;

        while(sentence.contains(word) ){
            sentence = sentence.replaceFirst(word,""); // we need to remover ont at the time to count them
            count++;

        }
        System.out.println(count);
        System.out.println(sentence);





    }
}
