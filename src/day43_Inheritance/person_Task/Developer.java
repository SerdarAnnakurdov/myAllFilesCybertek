package day43_Inheritance.person_Task;

public class Developer extends Employee{ // developer is a Person. Developer is A Employee
    /*
    inherited : name,age,gender,hourlyRate,jobTitle,ID;
    methods: setInfo(3),setInfo(6),eat,sleep,work;
     */

    public Developer(String name,int age,char gender,double hourlyRate,String jobTitle,String ID){
        setInfo(name, age, gender, hourlyRate, jobTitle, ID);
    }

    public void coding(){
        System.out.println(jobTitle+" "+name+" is coding");
    }







}
/*
Developer extends Employee:
        name, age, gender, hourlyRate, jobTitle, ID
        Constructor
        eat(), sleep(), work(), code()...
 */