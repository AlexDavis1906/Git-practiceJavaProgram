package Homework;
import java.util.Scanner;

public class PrintInitials {
    public static void main(String[] args) {
        System.out.println("Enter full name");
        Scanner sc=new Scanner(System.in);
        String fullName=sc.nextLine();
        String[] splitName=fullName.split(" ");
        String initials=splitName[0].substring(0,1)+"."+splitName[1].substring(0,1);


        System.out.println(initials);

    }
}
