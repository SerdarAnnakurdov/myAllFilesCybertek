package day43_Inheritance.person_Task;

public class Tester extends Employee{ //tester is a Person,Tester is an Employee

    /*
    inherited:
        variables : name,age,gender,hourlyRate,jobTitle,ID
        methods: work. setinfo.setinfo , toString eat,sleep
     */
public Tester(String name,int age,char gender,double hourlyRate,String jobTitle,String ID){
    setInfo(name, age, gender, hourlyRate, jobTitle, ID);

}

public void testing(){
    System.out.println(jobTitle+" "+name+" is testing");
}







}
/*
 Tester extends Employee:
        name, age, gender, hourlyRate, jobTitle, ID
        Constructor
        eat(), sleep(), work(), testing(),...
 */