package groupPractice;

public class SuperHero {
    public String name,groupName,ID,costumeColor;
    public char gender ;
    public boolean hasResqueSkils;
    public boolean fromNY;


    public SuperHero(String name, String groupName, String ID, String costumeColor, char gender, boolean hasResqueSkils, boolean fromNY) {
        this.name = name;
        this.groupName = groupName;
        this.ID = ID;
        this.costumeColor = costumeColor;
        this.gender = gender;
        this.hasResqueSkils = hasResqueSkils;
        this.fromNY = fromNY;
    }

    public void getInfo(){
        System.out.println(name+" "+groupName+" "+ID+" "+costumeColor+" "+gender+" "+hasResqueSkils+" "+fromNY);
    }


    public String toString() {
        return "SuperHero{" +
                "name='" + name + '\'' +
                ", groupName='" + groupName + '\'' +
                ", ID='" + ID + '\'' +
                ", costumeColor='" + costumeColor + '\'' +
                ", gender=" + gender +
                ", hasResqueSkils=" + hasResqueSkils +
                ", fromNY=" + fromNY +
                '}';
    }
}
