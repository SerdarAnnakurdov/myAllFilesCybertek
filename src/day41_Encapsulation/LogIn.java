package day41_Encapsulation;


import day23_NesteLoop.Credential;

public class LogIn {
    public static void main(String[] args) {

       Credentials obj = new Credentials();
/*
        System.out.println(obj.userName);
        obj.userName = "ABC";
        System.out.println(obj.userName);

*/
        System.out.println(obj.getUserName());

        System.out.println(obj.getPassWord());

        //  obj.getPassWord() = 123445; read only

        obj.setUserName("Hello");

        System.out.println(obj.getUserName());


        obj.setPassWord(000);

        System.out.println(obj.getPassWord());



    }
}
