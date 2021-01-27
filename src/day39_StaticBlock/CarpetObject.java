package day39_StaticBlock;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObject {
    public static void main(String[] args) {


        Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};
        carpets[0].customOrder(5, 7, 15, false);
        carpets[1].customOrder(5, 7, 15, true);
        carpets[2].customOrder(8, 10, 12, false);
        carpets[3].customOrder(10, 15, 13, true);
        carpets[4].customOrder(15, 20, 20, true);


        ArrayList<Carpet> persianCarpets = new ArrayList<>(Arrays.asList(carpets));
        persianCarpets.removeIf(p->!p.isPersian);

       ArrayList<Carpet> regularCarpets = new ArrayList<>(Arrays.asList(carpets));
       regularCarpets.removeIf(p->p.isPersian);

        System.out.println("==========================================================");


        double totalPriceOfCarpets =0;
        for(Carpet each :persianCarpets){
            System.out.println(each);
            totalPriceOfCarpets += each.calcCost();
        }
        System.out.println("totalPriceOfCarpets = " + totalPriceOfCarpets);

        System.out.println("============================================================");


        double totalPriceOfRegular = 0;

        for(Carpet each :regularCarpets){
            System.out.println(each);
            totalPriceOfRegular+=each.calcCost();
        }
        System.out.println("totalPrice = " + totalPriceOfRegular);

        System.out.println("===========================================");

        double totalPrice = totalPriceOfCarpets + totalPriceOfRegular;

        System.out.println("Total Price of Carpets: "+totalPrice);





    }
}
