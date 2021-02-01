package day53_Collection;


import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;


public class MapPractice {
    public static void main(String[] args) {

        Map<String, Double> employeeInfo = new LinkedHashMap<>();
        employeeInfo.put("Afrooz", 20_000.0);
        employeeInfo.put("serdar", 20_000.5);
        employeeInfo.put("Muhtar",20_000.6);


        System.out.println(employeeInfo.size());
        System.out.println(employeeInfo);
        System.out.println("Salary of Serdar: " + employeeInfo.get("serdar"));
        System.out.println("Salary of Afrooz: " + employeeInfo.get("Afrooz"));
//        employeeInfo.remove("serdar"); // kinda how to remove from map list by calling the unique key of object
        System.out.println(employeeInfo);
        //employeeInfo.remove("Afrooz"); // removing Afrooz by key "Afrooz" and then removing that obj from the map list ))
        System.out.println(employeeInfo);
        System.out.println(employeeInfo.containsKey("serdar"));
        System.out.println(employeeInfo.containsKey("Muhtar"));

        System.out.println(employeeInfo.containsValue(1222));
        System.out.println(employeeInfo.containsValue(20_000.6));
        System.out.println(employeeInfo.containsValue(20_000.5));

        System.out.println(employeeInfo.isEmpty());
//        employeeInfo.clear();

        for(String eachKey:employeeInfo.keySet()){
            System.out.println(eachKey+"  :   "+employeeInfo.get(eachKey));
        }

        System.out.println("================================================");
        employeeInfo.put("Mustafa",105000.0);
        employeeInfo.put("Emre",103000.0);
        employeeInfo.put("Apo",100000.0);


//        System.out.println(Collections.max(employeeInfo.values()));

        //we need to find and print the name and max value in the one sout...
        double max = Double.MIN_VALUE, min = Double.MAX_VALUE;
        String nameMax = "", nameMin="";



        for (String eachName : employeeInfo.keySet()) {
            double eachSalary = employeeInfo.get(eachName);
            if(eachSalary>max){
                max=eachSalary;
                nameMax=eachName;
            }
            if(eachSalary<min){
                min=eachSalary;
                nameMin=eachName;
            }
        }

        System.out.println(nameMax+" : "+max);
        System.out.println(nameMin+" : "+min);



    }
}
