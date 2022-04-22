package Homework;
import java.util.Locale;
import java.util.Scanner;

public class ChexkPalindrome {
    public static void main(String[] args) {
        System.out.println("Please enter your word");
        //take string from user
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //find reverse of given string
        String rev=getReverse(str);
        //compare rev with original string to check if palindrome
        if(str.equals(rev)) {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not polindrome");
        }

    }

    //This method will find reverse of given string
    static String getReverse(String str){
        String rev="";
        for(int i=str.length()-1; i>=0; i--){
            rev=rev+str.charAt(i);
        }
        return rev;
        }



    }
