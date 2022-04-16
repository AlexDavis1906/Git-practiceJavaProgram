package Homework;

import java.util.Scanner;


public class Reversd {
    public static void main(String[] args) {
        System.out.println("Enter any string");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        for(int i=str.length(); i<=0; i++){
            System.out.print(str.charAt(i));
        }
    }
}
