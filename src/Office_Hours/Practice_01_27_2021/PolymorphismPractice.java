package Office_Hours.Practice_01_27_2021;


import day38_Statics.Iphone;
import day50_Polymorphism.PhoneTask.Huwawei;
import day50_Polymorphism.PhoneTask.IPhone;
import day50_Polymorphism.PhoneTask.Phone;
import day50_Polymorphism.PhoneTask.Samsung;


public class PolymorphismPractice {
    public static void main(String[] args) {

        Phone phone = new Samsung("s", "a", "a", 1);
        Phone phone1 = new IPhone("sa", "ab", "ab", 2);
        Phone phone2 = new Samsung("sbc", "abc", "abc", 3);


        //verify phone is Samsung
        boolean isSamsung = phone instanceof Samsung;


        //verify phone1 is Iphone
        boolean isIphone = phone1 instanceof IPhone;

        // verify phone2 is samsung
        boolean isSamsung2 = phone2 instanceof Samsung;


        System.out.println("================================================");

        Phone[] phones = {
                new Samsung("samsung", "abc", "abc", 1),
                new IPhone("phone", "abc", "abc", 2),
                new Samsung("samsung", "abc", "abc", 3),
                new IPhone("phone", "abc", "abc", 4),
                new Samsung("samsung", "abc", "abc", 5),
                new IPhone("phone", "abc", "abc", 6),
                new Samsung("samsung", "abc", "abc", 7),
                new IPhone("phone", "abc", "abc", 8),
                new Samsung("samsung", "abc", "abc", 9),
                new IPhone("phone", "abc", "abc", 10),
                new Samsung("samsung", "abc", "abc", 11),
                new IPhone("phone", "abc", "abc", 12),
                new Huwawei("j1", "m", "as", 144)

        };

        int countIphones = 0;
        int countSamsung = 0;
        int countHuwaia = 0;

        for (Phone each : phones) {
            if (each instanceof IPhone) {
                countIphones++;
            } else if (each instanceof Samsung) {
                countSamsung++;
            } else {
                countHuwaia++;
            }
        }
        System.out.println("countHuwaia = " + countHuwaia);
        System.out.println("countIphones = " + countIphones);
        System.out.println("countSamsung = " + countSamsung);


    }
}
