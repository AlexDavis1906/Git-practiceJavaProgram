package Homework;


import java.util.Scanner;
public class SwitchStatement {
    public static void main(String[] args) {
        System.out.print("Please enter a month");
        Scanner sc= new Scanner(System.in);
        String month=sc.nextLine();
        switch(month){
            case "January":
            System.out.println("31");
            break;
            case "February":
                System.out.println("28");
            case "March":
                System.out.println("31");
            case "April":
                System.out.println("30");
            case "May":
                System.out.println("31");
            case "June" :
                System.out.println("30");
                break;
            default:
                System.out.println("Incorrect");


        }

    }
}
