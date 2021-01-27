package groupPractice;

public class GassForCar {
    public static void main(String[] args) {

        int yearOfCar = 2011;
        String gassType = "";

        if (yearOfCar <= 2022 && yearOfCar >= 2012) {
            if (yearOfCar >= 2020) {
                gassType = "Supreme";

            } else if (yearOfCar >= 2015) {
                gassType = "Medium";
            } else if (yearOfCar >= 2012) {
                gassType = "Regular";
            }

        } else {
            gassType = "Sorry";
        }
        System.out.println(gassType);


    }
}
