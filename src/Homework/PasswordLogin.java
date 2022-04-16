package Homework;

import java.util.Scanner;

public class PasswordLogin {
    public static void main(String[] args) {
        String username="Davis";
        String password="davis1";
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your name");

        String usernameInput=sc.nextLine();

        System.out.println("Please enter your password");

        String passwordInput=sc.nextLine();

        if(username.equals(usernameInput)&&password.equals(passwordInput)){
            System.out.println("Login successful");

        }else if(username.equals(usernameInput)&&!password.equals(passwordInput));
        System.out.println("Invalid Password.Try again");


        }

    }
