import java.util.Random;
import java.util.Scanner;
import java.security.SecureRandom;

public class Main {

    static String combination =  "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[]{};:'\",./?`~";
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("PASSWORD GENERATOR!!!");
        System.out.println("How long do you want your password to be?");

        int len = sc.nextInt();
        char[] pass = new char[len];
        Random random = new SecureRandom();
        for (int i = 0; i < len; i++) {
            pass[i] = Main.combination.charAt(random.nextInt(Main.combination.length()));
        }
        System.out.println(pass);

    }

}
