package day09_LogicalOperators;

public class EligibleToVote {
    public static void main(String[] args) {
        String name = "John";
        String citizen = "USA";

        boolean eligible = citizen == "USA";
        System.out.println(name+" is eligible to vote for Donald Trump or Joe Biden ?\n\t"+eligible);


        String name2 = " Aeron";
        boolean isUscitizen = false;
        boolean eligibleTovote = isUscitizen == true;
        System.out.println(name2+" is eligible to vote for Donald Trump or Joe Biden ?\n\t"+eligible);
    }
}
/*
2. write a program that can check if the person is eligible to vote for Donald Trump or Joe Biden
        Ex:
            name = "John"
            citizenShip = "USA"
            output:
                John is eligible to vote for Donald Trump or Joe Biden?

 */