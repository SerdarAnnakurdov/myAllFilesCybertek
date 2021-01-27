package day11_MultiBranchIf;

public class GradeReport {
    public static void main(String[] args) {
        int score1 = 59;
        String result = "";


        if(score1 < 60){
           result = "Failed";

        }else if(score1 >=60 && score1 < 90 ){
            result = "Passed";

        }else{
            result = "Passed with distinction ";
        }
        System.out.println(result);

        int score = 12;

       if(score < 90 && score > 100){             /// self practice not true not sure
           System.out.println("a");
       }else if(score < 80 && score > 89){
           System.out.println("b");
       }else if(score <= 70 && score < 79);
        System.out.println("c");




























    }


}
