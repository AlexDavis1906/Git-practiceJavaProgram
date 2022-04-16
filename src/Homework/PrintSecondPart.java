package Homework;
 import java.util.Scanner;

 public class PrintSecondPart {
    public static void main(String[] args) {
        System.out.println("Enter any string I will print second part");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str.substring(str.length()/2));

    }
    }
