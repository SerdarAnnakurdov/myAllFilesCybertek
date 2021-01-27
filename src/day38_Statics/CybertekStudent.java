package day38_Statics;

public class CybertekStudent {

    public String name;
    public int age, GroupNumber;
    public char gender;


    public static String schoolName = "Cybertek School";
    public static boolean isOnlineStudent = true;



    public void setInfo(String name, int age, int groupNumber, char gender) {
        this.name = name;
        this.age = age;
        GroupNumber = groupNumber;
        this.gender = gender;


    }

    public void study() {
        System.out.println(name + " is studying Java");
    }

    public void getSchoolInfo() {
        System.out.println("School is: " + schoolName);
    }



    public String toString() {
        return "CybertekStudent{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", GroupNumber = " + GroupNumber +
                ", gender = " + gender +
                ", is online: " + isOnlineStudent +
                '}';
    }
}
/*
CybertekStudent :

instance: name , age , groupNumber, gender ....
static : SchoolName
 */