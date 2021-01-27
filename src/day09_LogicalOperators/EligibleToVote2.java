package day09_LogicalOperators;

public class EligibleToVote2 {
    public static void main(String[] args) {

        String name = "Jimmy";
        boolean isUSACitizen = false;
        int age = 13;
        boolean hasCriminalBackround = true;

        boolean isEligibleToVote = isUSACitizen == true && age >= 18 && hasCriminalBackround == false;
                                    // isUSCitizen == meanas have to be etc age is also have to be grater or equal
        System.out.println(name+" is eligible to vote : "+isEligibleToVote);

        System.out.println("===============================");

        String name2 = "John";
        String c1 = "Chine";
        String c2 = "Canada";

        boolean eligible =  c1 == "USA" || c2 == "USA";

        System.out.println(name2+"is eligible tp vote : "+eligible);













    }
}
