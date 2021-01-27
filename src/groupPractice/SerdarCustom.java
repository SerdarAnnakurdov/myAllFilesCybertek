package groupPractice;

public class SerdarCustom {
    public String name;
    public char gender;
    public int accountNumber;


    public void setInfo(String name, char gender, int accountNumber) {
        this.name = name;
        this.gender = gender;
        this.accountNumber = accountNumber;
    }

    public void getInfo(){
        System.out.println("Name: "+name+", Gender: "+gender+", Account number: "+accountNumber);
    }


    public String toString() {
        return "SerdarCustom{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
