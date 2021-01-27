package day35_CustomClass;

import java.time.LocalDate;
import java.util.ArrayList;

public class DogPark {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();
        Dog dog5 = new Dog();




        dog1.setInfo("Alabay","husky","40",'M',"White", LocalDate.of(2002,11,10));
        dog1.getInfo();
        System.out.println();

        dog2.setInfo("Balli","Maltese", "small", 'F',
                "white", LocalDate.of(2019,12,01));
        dog2.getInfo();
        System.out.println();




        dog3.setInfo("Richard", "Chow Chow", "Medium", 'M', "Brown", LocalDate.of(2015,7,2));
        dog3.getInfo();
        System.out.println();




        dog1.eat("Chicken");

        dog3.drink("Beer");

        Dog[] dogs = {dog1,dog2,dog3};

        ArrayList<Dog> huskies = new ArrayList<>();
        ArrayList<Dog> maltese = new ArrayList<>();

        for(Dog eachDog :dogs){
            if(eachDog.breed.equalsIgnoreCase("husky")){
                huskies.add(eachDog);
            }else if(eachDog.breed.equalsIgnoreCase("maltese")){
                maltese.add(eachDog);
            }

        }
        System.out.println("Total number of huskies: "+huskies.size());
        System.out.println("Total number of meltese: "+maltese.size());





    }
}
