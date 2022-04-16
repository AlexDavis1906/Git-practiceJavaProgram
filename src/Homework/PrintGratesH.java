package Homework;

import java.util.Scanner;

public class PrintGratesH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your points to check your grate");
        int grate = sc.nextInt();
        if (grate >= 90 && grate <= 100){
        System.out.println("Congrats!!!you got A");
    }else if(grate>=80&&grate<=89) {
            System.out.println("Hey you have B");
        }else if(grate>=70&&grate<=79) {
            System.out.println("U got C");
        }else if(grate>=60&&grate<=69) {
            System.out.println("U got D");
        }else{
            System.out.println("Wrong scores!Try again!");
        }
    }
}
