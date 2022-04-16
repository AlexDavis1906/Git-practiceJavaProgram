package Homework;

import java.util.Scanner;

public class HomeWorkYoutube {
    public static void main(String[] args) {
        System.out.println("Please enter app you are using");
        Scanner sc=new Scanner(System.in);
        String program =sc.nextLine();
        switch(program){
            case "Gmail":
            case "Instagram":
            case "Facebook":
                System.out.println("App Belong to Facebook");
                break;
            case "Skype":
            case "Microsoft":
                System.out.println("App belong to Microsoft");
            default:
                System.out.println("Please try again.Incorrect input");

        }

    }
}
