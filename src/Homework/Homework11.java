package Homework;

import java.util.Scanner;


public class Homework11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter number amount to print it");
        int num=sc.nextInt();
        int i=1;
        while(i<=num){
            System.out.println(3*i);
            i++;
        }

    }
}
