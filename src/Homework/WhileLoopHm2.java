package Homework;

import java.util.Scanner;


public class WhileLoopHm2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter amount to print below to figure out is it divide by 3 or 5");
        int num= sc.nextInt();
        int i=1;
        while(i<=num){
            if(i % 3 == 0 && i % 5==0) {
                System.out.println(i);
            } i++;
            }
        }
    }
