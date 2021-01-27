package day37_CustomClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class ParkingLot { // has a
    public static void main(String[] args) {

        Car[] cars = {new Car(), new Car(), new Car(), new Car(), new Car()};


        cars[0].setInfo("BMW", "i8", "Black", LocalDate.of(2015, 5, 20), 20000, 10000);
        cars[1].setInfo("BMW", "m4", "Black", LocalDate.of(2016, 6, 20), 20000, 10000);
        cars[2].setInfo("BMW", "m4", "Black", LocalDate.of(2017, 7, 20), 20000, 10000);
        cars[3].setInfo("BMW", "i8", "Black", LocalDate.of(2018, 8, 20), 20000, 10000);
        cars[4].setInfo("BMW", "x5", "Black", LocalDate.of(2019, 9, 20), 20000, 10000);


        System.out.println("======================RECALL CARS===============================");
        ArrayList<Car> recallCars = new ArrayList<>();

        for (Car eachCar : cars) {
            if(eachCar.year <2017 ){
                System.out.println(recallCars.add(eachCar));
            }
        }
        System.out.println(recallCars);

        System.out.println("==========================RECALL2===========================");

        ArrayList<Car> recall2 = new ArrayList<>();

        for(Car each: cars){
            if(each.brand.equals("BMW")){
                if(each.model.equals("i8") && each.year < 2016){
                    recall2.add(each);
                }
            }
        }

        System.out.println(recall2);

        System.out.println("==================================================");

        ArrayList<Car> myCollection = new ArrayList<>();
        myCollection.addAll(Arrays.asList(cars));

        myCollection.removeIf(p->!(p.brand=="BMW" && p.model=="m4"));
                //      remove all the cars that are not bmw m4 others will be removed


        System.out.println(myCollection);









    }
}
