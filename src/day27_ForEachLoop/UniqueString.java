package day27_ForEachLoop;

public class UniqueString {
    public static void main(String[] args) {
        String[] arr = {"Serdar", "Serdar", "Merdan", "Merdan", "Feride","Erkin"};


        for (int j = 0; j < arr.length; j++) {
            String element = arr[j]; // "Serdar"
            int frequency = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(element)) {
                    frequency++;

                }
            }

            if (frequency == 1) {
                System.out.print(element + " ");
            }

        }


    }
}
