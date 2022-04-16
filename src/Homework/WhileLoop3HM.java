package Homework;

import java.util.Scanner;

public class WhileLoop3HM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number divide by 7 and not divede by 3");

        int num=sc.nextInt();
        int i=1;

        while(i<=num) {
            if(i % 3 != 0&&i%7==0) {
                System.out.println(i);

            } i++;




        }
    }
}
