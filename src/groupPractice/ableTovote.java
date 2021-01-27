package groupPractice;

public class ableTovote {
    public static void main(String[] args) {
        int age = 21;
        boolean usCitizen = false;
        int hasToLiveInUsa =23;
        String result = "";


        if(age>=21){
            result="You can vote";
            if(usCitizen){
                if(hasToLiveInUsa>=2){

                }else{
                    result="Sorry you have to be liven in us at least 2 years";
                }

            }else{
                result="Sorry you have to be US citizen";
            }

        }else{
            result="Sorry you have to be at least 21 years old";

        }
        System.out.println(result);

        System.out.println("==================");
        int a = -100;
        int b = +200;

        if(a>=b){
            System.out.println("A is Positive ");
        }else{
            System.out.println("B is positive");
        }
        System.out.println("==========================");

        int age1 = 22;
        if(age1>=21){
            System.out.println("You can buy a cigarette ");
        }else{
            System.out.println("Buy only Milk");
        }
        System.out.println("=============================");


















    }
}
