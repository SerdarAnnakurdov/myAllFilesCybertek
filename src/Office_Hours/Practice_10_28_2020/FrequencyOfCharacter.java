package Office_Hours.Practice_10_28_2020;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str = "abaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaac";
        char ch = 'b';

        int count = 0;

        for (int i = 0; i <= str.length() - 1; i++) {
            char eachChar = str.charAt(i);
            if (eachChar == ch) {
                count += 1;
            }

        }
        System.out.println(count);

    }
}
