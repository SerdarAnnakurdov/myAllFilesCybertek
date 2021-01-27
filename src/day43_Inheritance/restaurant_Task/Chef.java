package day43_Inheritance.restaurant_Task;

import day43_Inheritance.person_Task.Employee;

public class Chef extends Employee { // Chef Is An Employee... Chef Is A Person...
 /*
    inherited:
        variables : name,age,gender,hourlyRate,jobTitle,ID
        methods: work. setinfo.setinfo , toString eat,sleep,calcSalary()
     */

    public Chef(String name,int age,char gender,double hourlyRate,String jobTitle,String ID){
        setInfo(name, age, gender, hourlyRate, jobTitle, ID);

    }

    public void makeOrder(){
        System.out.println(jobTitle+" "+name+" is making order");
    }
    public void cooking(){
        System.out.println(jobTitle+" "+name+" is cooking");
    }







}
