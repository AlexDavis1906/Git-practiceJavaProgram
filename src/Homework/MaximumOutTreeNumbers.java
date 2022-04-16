package Homework;

import java.util.Scanner;

public class MaximumOutTreeNumbers {
    public static void main(String[] args) {
        System.out.println("Please enter tree numbers");
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        if(a>b && a>c) {
            System.out.println("The biggest number:A");
        }else if(b>a&&b>c) {
            System.out.println("The biggest number B");
        }else{
            System.out.println("C the biggest number");
        }

    }
}
