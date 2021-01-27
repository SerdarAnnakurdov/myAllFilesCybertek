package day47_Abstraction.CarTask;

public class CarShop {
    public static void main(String[] args) {


        //Car car = new Car("Brand","Car1","Black",2010,26000);  cannot make objs from abstr classes..

        Mercedes mercedes = new Mercedes("c63","White",2020,45000);
        Toyota toyota = new Toyota("camry","red",2018,29000);
        BMW bmw = new BMW("X5","White",2015,3000);
        Tesla tesla = new Tesla("model 3","blue",2021,50000);


        System.out.println("Start Mercedes-");
        mercedes.start();

        System.out.println("Start Toyota");
        toyota.start();

        System.out.println("Start BMW");
        bmw.start();

        System.out.println("Start tesla");
        tesla.start();



    }
}
