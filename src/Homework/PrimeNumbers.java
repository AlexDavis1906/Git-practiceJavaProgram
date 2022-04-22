package Homework;
import java.util.Scanner;
//write a program to check given numbers is prime
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number");
        int num=sc.nextInt();
        if(num%2==0) {
            System.out.println("Ur number is not a prime" + num);
        }else{
            System.out.println("Ur number is prime"+num);

        }


    }
}
