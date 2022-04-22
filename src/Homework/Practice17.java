package Homework;
import java.util.Scanner;
// write a program to find out divisor or given numbers.
public class Practice17 {
    public static void main(String[] args) {
        //take number for user
        System.out.println("Enter number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        for(int i =1;i<=num;i++){
            if(num%i==0){
                count++;
                System.out.println(i);
            }
        }
        if(count==2) {
            System.out.println("prime");


        }

    }
}
