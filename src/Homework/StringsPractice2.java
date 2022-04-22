package Homework;

import java.util.Scanner;

public class StringsPractice2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your word");
        String str=sc.nextLine();
        String[] words=str.split(" ");
        System.out.println(str.substring(3));
        System.out.println(words.length);


    }
}
