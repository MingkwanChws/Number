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
        System.out.println(" ");

        int width;
        int length;
        int area;
        Scanner com = new Scanner(System.in);
        System.out.println("enter width");
        width = com.nextInt();
        System.out.println("enter length");
        length = com.nextInt();
        area = width*length;
        System.out.println("area (" + width + "*" + length + ") = " + area);
    }
}
