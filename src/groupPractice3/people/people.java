package groupPractice3.people;

public class people {
    public String firstName,lastName,hobby;
    public int age;


    public static boolean human;
    public static boolean smart;

    static {
        human=true;
        smart=true;
    }

    public void setInfo(String firstName, String lastName, String hobby, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hobby = hobby;
        this.age = age;

    }

    public void sleep(){
        System.out.println(firstName+" "+lastName+" is sleeping");
    }

    public void chilling(){
        System.out.println(firstName+" "+lastName+" is chilling");
    }



    public String toString() {
        return "people{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", hobby='" + hobby + '\'' +
                ", age=" + age +
                '}';
    }
}
