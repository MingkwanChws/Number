package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int a;
        int b;
        int result;
        Scanner number = new Scanner(System.in);
        System.out.println("enter a");
        a = number.nextInt();
        System.out.println("enter b");
        b = number.nextInt();
        result = a+b;
        System.out.println("result = " + result );

        int x;
        int y;
        int answer;
        Scanner com = new Scanner(System.in);
        System.out.println("enter x");
        x = com.nextInt();
        System.out.println("enter y");
        y = com.nextInt();
        answer = x*y;
        System.out.println("answer = "+answer);
    }
}
