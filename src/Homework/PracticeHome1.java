package Homework;

public class PracticeHome1 {
    public static void main(String[] args) {
        String str = "HILL Hill HILL Beach Lake";
        String str1 = "HIll hIll HILL bEAch laKe";
        String str2 = str.replace("HILL", "Cardi B");
        System.out.println(str2);

        if (str.equalsIgnoreCase(str1)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (str.contains("Hill")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        String str3 = "CAKE";
        String str4 = str3.toLowerCase();
        System.out.println(str4);
        System.out.println(str4.toUpperCase());
        System.out.println(str4);

        String str5 = "run mother fucker %s %s";
        System.out.println(String.format(str5, "Handsome", "RRRRRRRRRr"));

        String str6 = "KorableKrushenie";
        System.out.println(str6.substring(5, 16));
        System.out.println(str6.substring(7, 13));
        System.out.println(str6.substring(2, 4));
        str1 = "welcome to my world";
        String[] words = str1.split(" ");
        System.out.println(str1.length());
        str1="Merryy Christmas And Happy New Year";
        System.out.println("Merryy"+str1.replaceAll("[a-k]",""));


    }
    }
