package day12_Nestedif;

public class Loan {
    public static void main(String[] args) {

        double minimumSalary = 150222;
        int jobHistory = 2;
        int creditScore = 750;

        if(minimumSalary>=30000){
            if(jobHistory>=2){

                if(creditScore>=700){
                    System.out.println("You are qualified for loan");
                }else{
                    System.out.println("You must have at least 700 credit score");
                }


            }else{
                System.out.println("You must be on the job at least 2 years");
            }

        }else{
            System.out.println("You must have minimum of 30k salary first");
        }









    }
}
