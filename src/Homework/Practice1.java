package Homework;

import java.util.Scanner;
public class Practice1 {
    public static void main(String[] args) {
        System.out.println("Please enter the name of president of the USA");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        switch(name){
            case "Biden":
            case "Putin":
                System.out.println("They are not presidents");
                break;
            case "Trump":
                System.out.println("This is my President!!!!");
                break;
            default:
                System.out.println("You wrong-try again");

        }
    }
}
