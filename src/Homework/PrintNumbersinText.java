package Homework;

import java.util.Scanner;


public class PrintNumbersinText {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any numbers 0-9");
        int num=sc.nextInt();

        if(num==0) {
            System.out.println("Number zero");
        }else if(num==1) {
            System.out.println("Number one");
        }else if(num==2){
            System.out.println("Number two");

        }
    }
}
