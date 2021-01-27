package Office_Hours.Practice_11_112020;

public class ArraysPractice2 {
    public static void main(String[] args) { // first and last characters matching like SARRAH SERES TENNET , anagram names
        String[] word = {"Anna", "level", "lol", "Donald", "Biden", "Amir", "Agalar", "Engin","Maryam"};
        int count = 0;

        for (String each : word) {
            char firstChar = each.toLowerCase().charAt(0); // A
            char lastChar = each.toLowerCase().charAt(each.length() - 1); // a
            if (firstChar == lastChar) {
                count++;
            }

        }
        System.out.println(count);

    }
}
