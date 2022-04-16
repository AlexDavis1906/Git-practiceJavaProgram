package Homework;

import java.util.Scanner;
public class TshirtsHomeWork {
    public static void main(String[] args) {
        System.out.println("Please enter ur size");
       Scanner sc = new Scanner(System.in);
       int size=sc.nextInt();


       if(size >= 27 && size <= 30) {
           System.out.println("Ur size is XS");
       }else if(size>=31&&size<34) {
           System.out.println("Ur size is S");
       }else if(size>=35&&size<=38) {
           System.out.println("Ur size is L");
       }else if(size>=39&&size<=42) {
           System.out.println("Ur size is XL");
       }else{
           System.out.println("Wrong size.Try again");


        }
    }
}
