package Homework;

import java.sql.SQLOutput;

public class MethodExample2 {

    static boolean isPrime(int num){
        int count=0;
        if(num%1==0) {
            count++;
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        for(int i=1;i<=50;i++){
            if(isPrime(i)==true) {
                System.out.println(i + "prime");
            }else{
                System.out.println(i+"not prime");
            }
        }
    }
}
