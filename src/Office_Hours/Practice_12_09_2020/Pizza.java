package Office_Hours.Practice_12_09_2020;

public class Pizza {

    public String size;
    public int cheeseTopping, pepperoniTopping;
    public double priceOfPizza, tips, totalPrice;

    public void customizeOrder(String size, int cheeseTopping, int pepperoniTopping, double tips) {
        this.size = size;
        this.cheeseTopping = cheeseTopping;
        this.pepperoniTopping = pepperoniTopping;

        priceOfPizza = calCost();

        //tips = tips / 100;  //converting percentage to decimal
        this.tips = tips/100 * priceOfPizza;
        totalPrice = priceOfPizza + this.tips + (priceOfPizza*0.08);   // including the tax

    }

    public double calCost() {
        double startingPrice = (size.equalsIgnoreCase("small")) ? 10 :
                size.equalsIgnoreCase("medium") ? 12 : 14;

        double cheese = 1 * cheeseTopping;
        double papperoni = 1.5 * pepperoniTopping;


        return startingPrice + cheese + papperoni;
    }


    @Override
    public String toString() {
        return "Pizza-->>" +
                "size = '" + size + '\'' +
                ", cheeseTopping = " + cheeseTopping +
                ", pepperoniTopping = " + pepperoniTopping +
                ", priceOfPizza = " + priceOfPizza +
                ", tips = " + tips +
                ", totalPrice = " + totalPrice;
    }
}
/*
1. create a custom class for Pizza that should contain the following:
            variables:
                    size (either small, medium, large)
                    number of cheese topping
                    number of pepperoni topping
                    priceOfPizza
                    tips
                    totalPrice
            methods:
                    customizeOrder(): allows user to set the size and toppings of Pizza
                    calcCost(): returns the price of the pizza
                    toString(): get the full informationa nd total cost of Pizza
            Pizza cost is determined by:
                        Small: $10 + $1.5 per pepperoni topping + 1$ per cheese topping
                        Medium: $12 + $1.5 per pepperoni topping + 1$ per cheese topping
                        Large: $14 + $1.5 per pepperoni topping + 1$ per cheese topping
 */









/*




TASKSSSSSSSSSSS.......


books-->> title outhor price number of pages 



12/09/2020
Practice Topics: class & object:
                      instance: unique attribute for each object
                                beling to the object
                            this.: used for calling instances
                            toString: prints object, implicitly done
                      statics: same feature for all objects
                                class memeber
                      instance method & static method
package name: Practice_12_09_2020
Tasks:
    CybertekStudents:
            instance variables: name, age, gender
            statics variables: schoolName, dreamJob, hasReplit, hasFlipGrid
    1. create a custom class for Pizza that should contain the following:
            variables:
                    size (either small, medium, large)
                    number of cheese topping
                    number of pepperoni topping
                    priceOfPizza
                    tips
                    totalPrice
            methods:
                    customizeOrder(): allows user to set the size and toppings of Pizza
                    calcCost(): returns the price of the pizza
                    toString(): get the full informationa nd total cost of Pizza
            Pizza cost is determined by:
                        Small: $10 + $1.5 per pepperoni topping + 1$ per cheese topping
                        Medium: $12 + $1.5 per pepperoni topping + 1$ per cheese topping
                        Large: $14 + $1.5 per pepperoni topping + 1$ per cheese topping
    1. create a custom class for the Carpet class that should contain the following:

                instance variables:
                        width, length, unitPrice, isPersian (boolean)
                instance methods:
                        customOrder(): sets the carpet' width, length, unitprice, & isParsian
                        calcCost(): should be able to caculate the total cost of the carpet and return it as double
                        toSrring(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
            total price of carpet= (width*length)*unitprice
            if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice
            create a class called carpetObjects, and create an array of the carpet that contains 5 carpet objects ( make sure you set the instance variables of those objets)
            create two ArrayList of carpets:
                                        persianCarpets
                                        reugularCarpets
            write a program to store all the persian Carpets into the list of persianCarpets, and store all regular carpets into the list of reugularCarpets

                    use for each loop to print out all the persian carpets

 */












