package groupPractice2;

public class Studenty {

    public String name,ID,classNumber;
    public int number;

    public static String schoolName ="42School";
    public static String cityOfSchool = "Ashgabat";


    public void setInfo(String name,String ID,String classNumber,int number){
        this.name=name;
        this.ID=ID;
        this.classNumber=classNumber;
        this.number=number;

    }


    public String toString() {
        return "Studenty{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", classNumber='" + classNumber + '\'' +
                ", number=" + number +
                '}';
    }
}
