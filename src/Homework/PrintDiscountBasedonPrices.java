package Homework;

import java.util.Scanner;



public class PrintDiscountBasedonPrices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
                System.out.println("Please enter price");
        int price = sc.nextInt();
        if(price>100) {
            System.out.println("No discount");
        }else if(price <500) {
            System.out.println("Discount 2%");
        }else if(price<400){
            System.out.print("Discount 3%");

        }

    }
}
