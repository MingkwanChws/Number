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
        System.out.println("result (" + a + "+" + b +") = " + result );

        int x;
        int y;
        int area;
        Scanner com = new Scanner(System.in);
        System.out.println("enter x");
        x = com.nextInt();
        System.out.println("enter y");
        y = com.nextInt();
        area = x*y;
        System.out.println("answer (" + x + "*" + y + ") = " + area);
    }
}
