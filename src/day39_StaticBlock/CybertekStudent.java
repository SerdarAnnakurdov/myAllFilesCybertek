package day39_StaticBlock;

public class CybertekStudent {

    public String name,gender;
    public int age;

    public static String schoolName, dreamJob;
    public static boolean hasRelIt,hasFlipgrid;

    static {
        schoolName = "Cybertek";
        dreamJob = "SDET";
        hasFlipgrid = true;
        hasFlipgrid = true;

    }


    public void setInfo(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }


    @Override
    public String toString() {
        return "CybertekStudent{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}'+ "School Name: "+
                schoolName+", DreamJob: "+dreamJob;
    }
}
