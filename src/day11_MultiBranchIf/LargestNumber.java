package day11_MultiBranchIf;

public class LargestNumber {
    public static void main(String[] args) {
        int n1 = 100;
        int n2 = 200;
        int n3 = 300;



        if(n1 > n2 && n1 >n3){
            System.out.println("n1 is maximum number");
        }else if(n2 > n1 && n1 > n3){
            System.out.println("n2 is maximum number");
        }else{
            System.out.println("n3 is maximum number");
        }












    }
}
