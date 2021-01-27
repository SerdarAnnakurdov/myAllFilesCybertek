package day29_Methods;

public class VoidMethodPractice3 {
    public static void main(String[] args) {
        eligibleToVote("John", "USA", 45, true);
        eligibleToVote("Aron", "usa", 135, false);


    }

    public static void eligibleToVote(String name, String citizenShip, int age, boolean isAlive) {
        if (citizenShip.equalsIgnoreCase("USA")) {
            if (isAlive) {
                if (age >= 18) {
                    System.out.println(name + " You are eligible to Vote");
                } else {
                    System.out.println(name + " You must be at least 18 years old");
                }

            } else {
                System.out.println(name + " You must be Alive");
            }

        } else {
            System.out.println(name + " You must be citizen of USA");
        }
    }
}
