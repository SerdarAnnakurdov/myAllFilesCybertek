package groupPractice;

public class BahramPractice {
    public static void main(String[] args) {
       int q= 10;
       int w = -q-- + ++q * q-- / ++q;
       // b = - 9 + 10 * 10 / 11;
        // b = 100 / 11 = 9 - 9 = 0

        System.out.println("answer is : "+q);
        System.out.println("===============================");
        int a = 98;
        int b = +a++ - -a-- * 2 % 2;
        // b = 99 - 99 * 2 %2
        // b = 99 * 2 = 198%2

        System.out.println("hosh sagbolun"+198%2);



        int t = 100;
        int u = ++t - --t * 2 / 4;
        // u = 101 - 100 * 2 / 4 ;
        // u = 200 /4 = 50
        // u = 50 - 101 = 51...


        int i = 87;
        int p = -i-- + ++i * 56 / 2;
        // p =  - 87 + 87 * 56 / 2 ;
        // p = 4872 / 2 = 2436 - 87




        System.out.println("Chykmaly Hasap : "+p);




        int num1 = 1;
        int num2 = 1;
        int jogap = num1 + num2;
        System.out.println("Jogaby onun : "+jogap);

    }
}
