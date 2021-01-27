package groupPractice;

public class oddOreven {
    public static void main(String[] args) {
        int m = 9;
        String month = "";

        if(m>=1&&m<=12){
            month = (m==1)?"Jan":(m==2)?"Feb": "Dec";
            System.out.println("You was born in : "+month);

        }else{
            month = "There is no such a month";
        }

        System.out.println(month);

        














    }
}
