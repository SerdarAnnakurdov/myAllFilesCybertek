package day36_CustomClass;

import sun.net.sdp.SdpProvider;

import java.util.ArrayList;
import java.util.Arrays;

public class Serdar { // serdar has an Offer
    public static void main(String[] args) {

        ArrayList<Offer> offers = new ArrayList<>();
        offers.addAll(Arrays.asList( new Offer(), new Offer(), new Offer(), new Offer(), new Offer() ));

        offers.get(0).setInfo("CA", "SDET", "CapitalOne", 120000, true, true, false, false);
        offers.get(1).setInfo("VA", "QA", "Apple", 115000, true, true, true, true);
        offers.get(2).setInfo( "VA", "Scrum Master", "American Express", 100000, true, false, false, true);
        offers.get(3).setInfo("NY","SDET","MIT",150000,true,true,false,false);
        offers.get(4).setInfo("TX", "SDET", "Bank Of America", 100000, true, false, true, true);

        /*
       for(int i = 0; i <= offers.size()-1; i++){
          offers.get(i).getInfo();
       }
         */

        System.out.println("===========================================================");
        // only print the offers from VA


        for(Offer each : offers){
            if(each.location.equalsIgnoreCase("Va")){
                each.getInfo();
            }

        }
        System.out.println("========================================================");

        ArrayList<Offer> localOffers = new ArrayList<>(offers);

        localOffers.removeIf(p->!p.location.equalsIgnoreCase("va"));


        System.out.println("Va offers: "+localOffers.size());

        System.out.println("===========================================================");


        ArrayList<Offer> SDEToffers = new ArrayList<>(offers);
        SDEToffers.removeIf(p->!p.jobTitle.equalsIgnoreCase("SDET"));
        System.out.println("SDET offers : "+SDEToffers.size());

        System.out.println("=============================================================");

        ArrayList<Offer> less120000k = new ArrayList<>(offers);
        less120000k.removeIf(p->p.salary <120000);
        System.out.println("less than 120000K : "+less120000k.size());

        System.out.println("============================================================");


        ArrayList<Offer> fullTime = new ArrayList<>();
        fullTime.removeIf(p->!p.isFullTime==false);
        System.out.println(fullTime.size());







    }

}