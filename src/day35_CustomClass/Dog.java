package day35_CustomClass;

import java.time.LocalDate;

public class Dog {
    public String nickName;
    public String breed;
    public String size;
    public char gender;
    public String color;
    public LocalDate DOB;
    int age ;


    // sets the instance variables of dog objects
    public void setInfo(String dogNickName, String dogBreed, String dogSize, char dogGender, String dogColor,LocalDate dogDoB) {
        nickName = dogNickName;
        breed = dogBreed;
        size = dogSize;
        gender = dogGender;
        color = dogColor;
        DOB = dogDoB;
        age = LocalDate.now().getYear()-DOB.getYear();
        //      current year  - birth year

    }

    // to print the info of the dog object
    public void getInfo(){
        System.out.println("Nickname: "+nickName+", "+"Breed: "+breed+", "+"Size: "+size+", "+"Gender: "+gender+", "+"Color:"+color+", "+
                "Age: "+age);
    }

    public void eat(String food){
        System.out.println(nickName+" is eating "+food);
    }
    public void drink(String drinks){
        System.out.println(nickName+" is drinking "+drinks);
    }







}
