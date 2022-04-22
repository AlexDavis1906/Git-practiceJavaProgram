package Homework;
import java.util.Scanner;
public class Practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "This is my java program";
        char c = 'a';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;

            }

        }

    }}