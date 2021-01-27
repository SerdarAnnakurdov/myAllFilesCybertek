package groupPractice;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import sun.swing.StringUIClientPropertyKey;

import java.util.Arrays;
import java.util.Scanner;

public class a {
    public static void main(String[] args) {

       byte [] b = new byte[5];
       for(int j = 0 ; j < b.length; j ++){
           b[j]=(byte)(b[j]*2);
       }
        System.out.println(b);

        System.out.println("=======================");


        String [] words = {"one","two","three","four"};
        String [] other = new String[words.length];
        int index = 0;
        for(String word: words){
            other[index++]=word+word.length();
        }
        System.out.println(other);

        System.out.println("===========================");

        int [] arr = {1,3,12,5,24,7,9,10};
        boolean [] bArr = new boolean[arr.length];

        for(int i = arr.length-1;i>-1;i--){
            if(arr[i]%2==0){
                bArr[arr.length-1-i]=true;
            }
        }
        System.out.println(bArr);

        System.out.println("=========================");
        int [] nums = {14,1,84,97,1243,46};
        int total =  0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                total+=3;
            }else{
                total +=10;
            }
            if(i%3==0){
                total-=15;
            }
        }
        System.out.println(total);

        System.out.println("============================");

        String [] things = {"house","shed","slide","zebra","park","garden"};

        for(String s: things){
            switch (s.charAt(1)){
                case 'h':
                    System.out.println(1);break;
                case 'a':
                    System.out.println(2);break;
                case 's':
                    System.out.println(3);break;
                case '0':
                    System.out.println(4);break;
                default:
                    System.out.println(4);
            }
        }






    }
}



















