package groupPractice3.people;

public class sportMan extends people {

    public boolean hasSportSkills;
    public boolean isStrong;




    public  sportMan(String firstName, String lastName, String hobby, int age,boolean hasSportSkills,boolean isStrong){
        setInfo(firstName, lastName, hobby, age);
        this.hasSportSkills=hasSportSkills;
        this.isStrong=isStrong;

    }

    public void workOut(){
        System.out.println(firstName+" "+lastName+" is workingOut in the gym");
    }
    public void running(){
        System.out.println(firstName+" "+lastName+" is running fast");
    }

    @Override
    public String toString() {
        return "sportMan{" +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                "hasSport Skills=" + hasSportSkills +
                ", isStrong=" + isStrong +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
