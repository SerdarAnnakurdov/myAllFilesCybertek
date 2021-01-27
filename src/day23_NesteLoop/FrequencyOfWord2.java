package day23_NesteLoop;

public class FrequencyOfWord2 {
    public static void main(String[] args) { /// WITHOUT CASE SENSITIVITY .. ASAAAsaAsaAs aAS

        String sentence = "Java Java java java";
        String word = "java";
        word = word.toLowerCase();


        String temp = sentence.toLowerCase();
        int count = 0;

        while (temp.contains(word) ) {
            temp = temp.replaceFirst(word.toLowerCase(), "");
            count++;

        }
        System.out.println(count);
        System.out.println(sentence);


    }
}
