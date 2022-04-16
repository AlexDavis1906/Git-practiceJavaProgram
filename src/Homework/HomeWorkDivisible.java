package Homework;

import java.util.Scanner;

public class HomeWorkDivisible {
    public static void main(String[] args) {
        System.out.println("Please enter the number to check it is divisible or not!");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%5==0||num%3==0) {
            System.out.println("Your number is divisible by 3 or 5");
        }else{
            System.out.println("Your number is not divisible 3 or 5");

        }
    }
}
